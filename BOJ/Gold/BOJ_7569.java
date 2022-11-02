package BOJ.Gold;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 골드 5 토마토 
public class BOJ_7569 {

    static int M, N, H;
    static int[][][] box;
    static int[] dx = {0, -1, 0, 1, 0, 0};
    static int[] dy = {1, 0, -1, 0, 0, 0};
    static int[] dz = {0, 0, 0, 0, 1, -1};
    static Queue<int[]> Q = new LinkedList<int[]>();

    static void BFS(){
        while(!Q.isEmpty()){
            int[] tmt = Q.poll();
            int x = tmt[0];
            int y = tmt[1];
            int z = tmt[2];
        
            for(int i=0;i<6;i++){
                int cx = x + dx[i];
                int cy = y + dy[i];
                int cz = z + dz[i];

                if(cx>=0 && cy>=00 && cz>=00 && cx<N && cy<M && cz<H){
                    if(box[cx][cy][cz] == 0){
                        box[cx][cy][cz] = box[x][y][z] + 1;
                        Q.offer(new int[] {cx, cy, cz});
                    } 
                }
            }
        }
    }



    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        H = Integer.parseInt(st.nextToken());
        box = new int[N][M][H];

        for(int k=0;k<H;k++){
            for(int i=0;i<N;i++){
                st = new StringTokenizer(br.readLine());
                for(int j=0;j<M;j++){
                    int p = Integer.parseInt(st.nextToken());
                    if(p == 1) Q.offer(new int[] {i ,j, k});
                    box[i][j][k] = p;
                }
            }
        }

        int answer = 0;
        int MAX = 1;
        boolean flag = true;

        BFS();

        for(int k=0;k<H;k++){
            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(box[i][j][k] == 0) flag = false;
                    MAX = Math.max(MAX, box[i][j][k]);
                }
            }
        }

        System.out.println(flag ? MAX-1 : -1);
        System.out.println(Arrays.deepToString(box));

    }    
}
