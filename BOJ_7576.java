import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;


// 골드 5 토마토
public class BOJ_7576 {

    static int M,N,cnt;
    static int[][] box;

    static void BFS(int x, int y){
        Queue<int[]> Q = new LinkedList<int[]>();
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
                box[i][j] = p;
            }
        }

        // System.out.println(Arrays.deepToString(box));
    }
}
