package BOJ.Gold;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 골드 4 좋은 친구
// Queue, Sliding Window
// 못 풀어서 다른사람 풀이 참고,,, 나중에 다시 도전하자
public class BOJ_3078 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer>[] queues = new Queue[21];
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());

        // 각 숫자에 해당하는 큐를 만듬...
        for (int i = 0; i < 21; i++) {
            queues[i] = new LinkedList<>();
        }

        // 각 숫자에 맞는 큐를 들고있으며 큐의 peek과 비교하여 범위를 벗어나면 poll -> k 짜리 슬라이딩
        long count = 0;
        for (int i = 0; i < N; i++) {
            int length = br.readLine().trim().length();

            if(queues[length].isEmpty()){
                queues[length].offer(i);
                
            } else {
                while(i- queues[length].peek() > K){
                        queues[length].poll();
                        if(queues[length].isEmpty()){
                            break;
                        }
                }
                count += queues[length].size();
                System.out.println(count);
                queues[length].offer(i);
            }
        }
        System.out.println(queues);
        System.out.println(count);
    }
}

// 또 시간초과... 이거슨 슬라이딩이 아니무입니까?
// public class BOJ_3078 {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine());
//         int N = Integer.parseInt(st.nextToken());
//         int K = Integer.parseInt(st.nextToken());
//         int[] classMate = new int[N];
//         int answer = 0;
//         for(int i=0;i<N;i++)
//             classMate[i] = br.readLine().toString().length();
//         int idx = 1, cursor = 0;

//         while(idx < N){
//             if(idx-cursor <= K){
//                 if(classMate[cursor] == classMate[idx]){
//                     answer++;
//                     System.out.println("cursor: "+cursor+" idx: "+idx);
//                 }
//                 if(idx < N-1) idx++;
//                 else if(idx == N-1){
//                     cursor++; idx = cursor + 1;
//                 }
//             }else{
//                 cursor++;
//                 idx = cursor + 1;
//             }
//             if(idx == N) break;
//         }
//         System.out.println(answer);
//     }
// }

// 시간초과 -> 슬라이딩 윈도우로 풀어야한다?? 
// public class BOJ_3078 {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine());
//         int N = Integer.parseInt(st.nextToken());
//         int K = Integer.parseInt(st.nextToken());
//         String[] classMate = new String[N];
//         int answer = 0;
//         for(int i=0;i<N;i++)
//             classMate[i] = br.readLine().toString();
        
//         for(int i=0;i<N-1;i++){
//             int count = 0;
//             for(int j=i+1; j<N; j++){
//                 count++;
//                 if(classMate[i].length() == classMate[j].length()) answer++;
//                 if(count == K) break;
//             }
//         }
//         // System.out.println(Arrays.toString(classMate));
//         System.out.println(answer);
//     }
// }