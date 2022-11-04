package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
import java.util.Queue;
import java.util.LinkedList;
// 실버 1 숨바꼭질
public class BOJ_1697 {

    static int N,K,cnt,answer;
    static boolean[] visit;
    static int[] m; 
    static Queue<Integer> Q = new LinkedList<>();

    static void BFS(int N){
        visit = new boolean[100001];
        if(N == K){
            answer = 0;
            return;
        }
        visit[N] = true;
        Q.offer(N);
        int cnt = 1;

        while(!Q.isEmpty()){
            int size = Q.size();
            for(int i=0;i<size;i++){
                int x = Q.poll();
                m = new int[] {1, -1, x};
                
                for(int j : m){
                    int y = x + j;

                    System.out.println("L: "+cnt+ " X: "+x+" y: "+y);

                    if(y == K){
                        answer = cnt;
                        return;
                    }
                    
                    if(y>=0 && y<=100000 && !visit[y]){
                        visit[y] = true;
                        Q.offer(y);
                    }
                }
            }
            cnt++;
        }
    }

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        answer = 0;
        BFS(N);
        System.out.println(answer);
    }   
}
