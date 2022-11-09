package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// 실버 2 섬의 개수
// DFS
public class BOJ_4963 {

    static int N,M;
    static int[][] map;
    
    static boolean DFS(int x, int y){
        if(x<0 || y<0 || x>=N || y>=M) return false;
        else{
            if(map[x][y] == 1){
                map[x][y] = 0;
                DFS(x+1,y);
                DFS(x-1,y);
                DFS(x,y+1);
                DFS(x,y-1);
                DFS(x-1,y-1);
                DFS(x-1,y+1);
                DFS(x+1,y-1);
                DFS(x+1,y+1);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        boolean flag = true;
        StringTokenizer st;

        while(flag){
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());    
            N = Integer.parseInt(st.nextToken());    
            if(M == 0 && N == 0) break;
            map = new int[N][M];
            int cnt = 0;

            for(int i=0;i<N;i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<M;j++){
                    map[i][j] = Integer.parseInt(st.nextToken());
                }
            }

            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(DFS(i,j)) cnt++;
                }
            }
            sb.append(cnt).append("\n");
            System.out.println(Arrays.deepToString(map));
        }
        System.out.println(sb);
    }
}

// 정방향 + 대각선도 섬으로 친다...