package BOJ.Gold;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 골드 5 AC 
public class BOJ_5430 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();

        while(N-- > 0){
            char[] command = br.readLine().toCharArray();
            int T = Integer.parseInt(br.readLine());
            String[] arr = new String[T];
            arr = br.readLine().replace("[", "").replace("]", "").split(",");
            Boolean err = false, reverse = true;
            Deque<String> q = new LinkedList<>();

            for(int i=0;i<arr.length;i++)
                q.offer(arr[i]);

            if(arr[0]=="" && String.valueOf(command).indexOf("D") != -1) err=true;

            for(int i=0;i<command.length;i++){
                if(q.isEmpty() && command[i] == 'D'){
                    err = true;
                    break;
                }else if(q.isEmpty() && command[i] == 'R')
                    continue;

                if(command[i] == 'R'){              // 일자로 놓고 R이면 뒤에서 제거, 정방향이면 앞에서 제거 후 출력
                    if(reverse) reverse = false;
                    else reverse = true;
                }else{
                    if(reverse)
                        q.poll();
                    else q.pollLast();
                } 
            }

            if(err){
                answer.append("error").append("\n"); 
                continue;
            }

            String[] re = new String[q.size()];
            for(int i=0;i<re.length;i++)
                if(reverse) re[i] = q.poll();
                else re[i] = q.pollLast();
            answer.append(Arrays.toString(re).replace(" ", "")).append("\n");
        }
        System.out.println(answer);
    }    
}

// 시간초과, 입출력 형식... 답은 공백없는 배멸형식, 그냥 배열 출력하면 공백있는 배열형식이다... 



// 시간초과 - 배열을 뒤집었기에 n*n 복잡도가 나옴
// public class BOJ_5430 {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int N = Integer.parseInt(br.readLine());
//         StringBuilder answer = new StringBuilder();

//         while(N-- > 0){
//             char[] command = br.readLine().toCharArray();
//             int T = Integer.parseInt(br.readLine());
//             String[] arr = new String[T];
//             arr = br.readLine().replace("[", "").replace("]", "").split(",");
//             Boolean err = false;
//             // if(T == 0 && command.)
            
//             Queue<String> q = new LinkedList<>();
//             for(int i=0;i<arr.length;i++)
//                 q.offer(arr[i]);

//             System.out.println(Arrays.toString(command) + "  @@@  " + q );

//             if(arr[0]== "") err=true;

//             for(int i=0;i<command.length;i++){
//                 if(q.isEmpty() && command[i] == 'D'){
//                     err = true;
//                     break;
//                 }else if(q.isEmpty() && command[i] == 'R')
//                 continue;
                
//                 if(command[i] == 'R'){
//                     String[] tmp = new String[q.size()-1];
//                     for(int j=0;j<tmp.length;j++){
//                         tmp[j] = q.poll();
//                     }    
//                     for(int j=tmp.length-1;j>=0;j--)
//                     q.offer(tmp[j]);
//                 }else q.poll();
//             }

//             if(err){
//                 answer.append("Error").append("\n"); 
//                 continue;
//             }

//             String[] re = new String[q.size()];
//             for(int i=0;i<re.length;i++)
//                 re[i] = q.poll();

//             System.out.println(q + " re: "+ Arrays.toString(re));

//             answer.append(Arrays.toString(re)).append("\n");
//         }
//         System.out.println("@@@@@@@@@@@answer@@@@@@@@@@");
//         System.out.println(answer);
//     }    
// }
