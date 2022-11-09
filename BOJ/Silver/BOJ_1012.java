package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 실버 2 유기농 배추
// BFS
public class BOJ_1012 {

    static int N,M,W,cnt;
    static int[][] farm;
    static boolean[][] visit;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {1, 0, -1, 0};

    static void BFS(int x, int y){
        Queue<int[]> Q = new LinkedList<int[]>();
        Q.offer(new int[] {x,y});
        while(!Q.isEmpty()){
            x = Q.peek()[0];
            y = Q.peek()[1];
            visit[x][y] = true;
            Q.poll();
            for(int i=0; i<4; i++){
                int cx = x + dx[i];
                int cy = y + dy[i];

                if(cx >= 0 && cy >= 0 && cx < M && cy < N){
                    if(!visit[cx][cy] && farm[cx][cy] == 1){
                        Q.offer(new int[] {cx,cy});
                        visit[cx][cy] = true;
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringTokenizer st;
        while(T-->0){
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            W = Integer.parseInt(st.nextToken());
            farm = new int[M][N];
            visit = new boolean[M][N];
            cnt = 0;

            for(int i=0;i<W;i++){
                st = new StringTokenizer(br.readLine());
                int a = Integer.parseInt(st.nextToken());
                int b = Integer.parseInt(st.nextToken());
                farm[a][b] = 1;
            }

            for(int i=0;i<M;i++){
                for(int j=0;j<N;j++){
                    if(farm[i][j] == 1 && !visit[i][j]){
                        BFS(i, j);
                        cnt++;
                    }
                }
            }
            System.out.println(cnt);
        }
    }
}
