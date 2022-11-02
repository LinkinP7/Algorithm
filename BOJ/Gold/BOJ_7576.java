package BOJ.Gold;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
// 골드 5 토마토
public class BOJ_7576 {

    static int M,N;
    static int[][] box;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};
    static Queue<int[]> Q = new LinkedList<int[]>();

    static void BFS(){
        while(!Q.isEmpty()){
            int[] tmt = Q.poll();
            int x = tmt[0];
            int y = tmt[1];
            for(int i=0;i<4;i++){
                int cx = x + dx[i];
                int cy = y + dy[i];

                if(cx>=0 && cy>=0 && cx<N && cy<M){
                    if(box[cx][cy]==0){
                        box[cx][cy] = box[x][y]+1;                        
                        Q.offer(new int[] {cx, cy});
                    } 
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        M = Integer.parseInt(st.nextToken());
        N = Integer.parseInt(st.nextToken());
        box = new int[N][M];

        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            for(int j=0;j<M;j++){
                int p = Integer.parseInt(st.nextToken());
                if(p == 1) Q.offer(new int[] {i,j});
                box[i][j] = p;
            }
        }

        BFS();


        boolean flag = true;
        int MAX = 1;
        for(int i =0; i<N;i++){
            for(int j =0;j<M;j++){
                if(box[i][j] == 0){
                    flag = false;
                } 
                MAX = Math.max(MAX, box[i][j]);
            }
        }

        int answer = 0 ;
        if(flag) answer = MAX-1;
        else answer = -1;
        // System.out.println(Arrays.deepToString(box));
        System.out.println(answer);
    }
}
