package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 실버 4 수 찾기
public class BOJ_1920 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            arr[i] = Integer.parseInt(st.nextToken());
        
        int K = Integer.parseInt(br.readLine());
        int[] input = new int[K];
        st = new StringTokenizer(br.readLine());
        for(int i=0;i<K;i++)
            input[i] = Integer.parseInt(st.nextToken());
        
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(input));

        for(int i=0;i<K;i++){
            int start = 0, end = arr.length-1, mid = 0;
            boolean flag = true;
            while(start <= end){
                mid = (start+end) / 2;
                if(arr[mid] == input[i]){
                    sb.append(1).append("\n");
                    flag = false;
                    break;
                } 
                else if(arr[mid] < input[i]) start = mid + 1;
                else end = mid - 1;
            }
            if(flag) sb.append(0).append("\n");
        }
        System.out.println(sb);
    }
}

// 시간초과
// public class BOJ_1920 {
//     public static void main(String[] args) throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int N = Integer.parseInt(br.readLine());
//         int[] arr = new int[N];
//         StringTokenizer st = new StringTokenizer(br.readLine());
        
//         for(int i=0;i<N;i++)
//             arr[i] = Integer.parseInt(st.nextToken());
        
//         int K = Integer.parseInt(br.readLine());
//         int[] input = new int[K];
//         st = new StringTokenizer(br.readLine());
    
//         for(int i=0;i<N;i++)
//             input[i] = Integer.parseInt(st.nextToken());
        
//         for(int i=0;i<N;i++){
//             for(int j=0;j<N-i-1;j++){
//                 if(arr[j] > arr[j+1]){
//                     int tmp = arr[j];
//                     arr[j] = arr[j+1];
//                     arr[j+1] = tmp;
//                 }
//             }
//         }
//         System.out.println(Arrays.toString(arr));
//         System.out.println(Arrays.toString(input));



//         for(int i=0;i<K;i++){
//             int start = 0, end = arr.length-1, mid = 0;
//             boolean flag = true;
//             while(start <= end){
//                 mid = (start+end) / 2;
//                 if(arr[mid] == input[i]){
//                     System.out.println(1);
//                     flag = false;
//                     break;
//                 } 
//                 else if(arr[mid] < input[i]) start = mid + 1;
//                 else if(arr[mid] > input[i]) end = mid - 1;
//             }
//             if(flag) System.out.println(0);
//         }
//     }
// }
