import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 골드 4 좋은 친구
public class BOJ_3078 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        String[] classMate = new String[N];
        int answer = 0;
        for(int i=0;i<N;i++)
            classMate[i] = br.readLine().toString();
        
        for(int i=0;i<N-1;i++){
            int count = 0;
            for(int j=i+1; j<N; j++){
                count++;
                if(classMate[i].length() == classMate[j].length()) answer++;
                if(count == K) break;
            }
        }
        // System.out.println(Arrays.toString(classMate));
        System.out.println(answer);
    }
}

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