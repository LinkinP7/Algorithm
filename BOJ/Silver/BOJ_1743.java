package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// 실버 1 음식물 피하기
public class BOJ_1743 {
    static int N,M,cnt,MAX;
    static int[][] cafe;

    static void DFS(int x, int y){
        if(x>=1 && y>=1 && x<=N && y<=M){
            if(cafe[x][y] == 1){
                cnt++;
                System.out.println("!:!:!"+x+" "+y+" cnt: "+cnt);
                cafe[x][y] = 0;
                DFS(x+1,y);
                DFS(x-1,y);
                DFS(x,y+1);
                DFS(x,y-1);
                MAX = Math.max(MAX, cnt);    
            }
        }else return;
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        M = Integer.parseInt(st.nextToken());
        cnt = 0; MAX = 0;
        int K = Integer.parseInt(st.nextToken());

        cafe = new int[N+1][M+1];
        while(K-->0){
            st = new StringTokenizer(br.readLine());
            int x = Integer.parseInt(st.nextToken());
            int y = Integer.parseInt(st.nextToken());
            cafe[x][y] = 1;
        }

        for(int i=1;i<N+1;i++){
            for(int j=1;j<M+1;j++){
                DFS(i,j);
                cnt = 0;
            }
        }

        System.out.println(Arrays.deepToString(cafe));
        System.out.println(MAX);

    }
}
