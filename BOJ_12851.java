import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 골드 4 숨바꼭질 2
public class BOJ_12851 {

    static int N,K,answer,cnt;
    static int[] move;
    static int[] time;
    static Queue<Integer> Q = new LinkedList<>();

    static void BFS(int N){
        time = new int[100001];
        if(N == K){
            answer = 0;
            return;
        }
        time[N] = 1;
        Q.add(N);
        int L = 1;
        int minL = -1;
        while(!Q.isEmpty()){
            int size = Q.size();
            for(int i=0;i<size;i++){
                int x = Q.poll();
                move = new int[] {1,-1,x};

                for(int j : move){
                    int y = x + j;

                    // System.out.println("L: "+L+ " X: "+x+" y: "+y);
                    
                    if(minL != -1 && minL < L) return;
                    
                    if(y == K){
                        if(minL == -1){
                            minL = L;
                            answer = L;
                        }else{
                            if(minL == L){
                                cnt++;
                                continue;
                            } 
                        }
                    }

                    if(y>=0 && y<=100000){
                        Q.add(y);
                    }
                }
            }
            L++;
        }
    }
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        N = Integer.parseInt(st.nextToken());
        K = Integer.parseInt(st.nextToken());
        answer=0; cnt = 1;
        BFS(N);
        System.out.println(answer);
        System.out.println(cnt);
    }
}

// #1 답은 나오나 무한로오딩, time 을 써야한다고 한다. 
// public class BOJ_12851 {

//     static int N,K,answer,cnt;
//     static int[] move;
//     static boolean[] visit;
//     static Queue<Integer> Q = new LinkedList<>();

//     static void BFS(int N){
//         visit = new boolean[100001];
//         if(N == K){
//             answer = 0;
//             return;
//         }
//         visit[N] = true;
//         Q.add(N);
//         int L = 1;
//         int minL = -1;
//         while(!Q.isEmpty()){
//             int size = Q.size();
//             for(int i=0;i<size;i++){
//                 int x = Q.poll();
//                 move = new int[] {1,-1,x};

//                 for(int j : move){
//                     int y = x + j;

//                     // System.out.println("L: "+L+ " X: "+x+" y: "+y);
                    
//                     if(minL != -1 && minL < L) return;
                    
//                     if(y == K){
//                         if(minL == -1){
//                             minL = L;
//                             answer = L;
//                         }else{
//                             if(minL == L){
//                                 cnt++;
//                                 continue;
//                             } 
//                         }
//                     }

//                     if(y>=0 && y<=100000){
//                         // visit[y] = true;
//                         Q.add(y);
//                     }
//                 }
//             }
//             L++;
//         }
//     }
//     public static void main(String[] args) throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine());
//         N = Integer.parseInt(st.nextToken());
//         K = Integer.parseInt(st.nextToken());
//         answer=0; cnt = 1;
//         BFS(N);
//         System.out.println(answer);
//         System.out.println(cnt);
//     }
// }

