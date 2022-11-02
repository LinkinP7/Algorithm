import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 골드 4 불
public class BOJ_5427 {

    static int M,N;
    static char[][] map;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};
    static Queue<int[]> Q = new LinkedList<int[]>();
    static Queue<int[]> Fire = new LinkedList<int[]>();

    static void BFS(){
        while(!Q.isEmpty()){
            int[] escape = Q.poll();
            int[] fire = Fire.poll();
            
            int eX = escape[0];
            int eY = escape[1];
            int fX = fire[0];
            int fY = fire[1];
            
            for(int i=0;i<4;i++){
                
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
            map = new char[N][M];
            for(int i=0;i<N;i++){
                map[i] = br.readLine().toCharArray();
                for(int j=0;j<M;j++){
                    if(map[i][j] == '@') Q.offer(new int[] {i,j});
                    else if(map[i][j] == '*') Fire.offer(new int[] {i,j});
                }
            }

            // System.out.println(Arrays.deepToString(map));
        }



    }
}

// 큐를 두개써야할까?
// @ 는 . 을 찾아 이동하며 @가 이동시 기존 자리를 . 으로 바꿔주어야 한다.
// @ 가 이동시 # 이 없는 곳을 찾는다면 탈출 -> OutOfBound 나오지 않을까 걱정?
// * 는 . 을 찾아  * 로 바꿈, @을 찾아버리면 return 해야될듯
// 전체 돌려서 탈출이 된다면 count, 탈출이 안된다면 IMPOSSIBLE