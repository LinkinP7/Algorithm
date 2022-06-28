import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 골드 4 오큰수
public class BOJ_17298 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Stack<Integer> stack = new Stack<>();
        List<Integer> answer = new ArrayList<>();
        StringBuilder reroll = new StringBuilder();
        for(int i=0;i<N;i++)
            stack.push(Integer.parseInt(st.nextToken()));
        answer.add(-1);

        for(int i=0;i<N-1;i++){
            int arrL = answer.get(answer.size()-1);
            int x = stack.pop();
            if(x > stack.peek()) answer.add(x);
            else{
                if(stack.peek() >= arrL) answer.add(-1);
                else answer.add(arrL);
            }
            // System.out.println(x + " "+answer + "나머지:"+stack);
        }
        // answer 출력
        // for(int i=0;i<N;i++)
        //     reroll.append(answer.pop()).append(" ");

        System.out.println(reroll);
    }
}

// 틀렸습니다 - 밑의 반례 참조
// import java.io.BufferedReader;
// import java.io.InputStreamReader;
// import java.util.*;
// public class Main {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int N = Integer.parseInt(br.readLine());
//         StringTokenizer st = new StringTokenizer(br.readLine());
//         Stack<Integer> stack = new Stack<>();
//         Stack<Integer> answer = new Stack<>();
//         StringBuilder reroll = new StringBuilder();
//         for(int i=0;i<N;i++)
//             stack.push(Integer.parseInt(st.nextToken()));
//         answer.push(-1);

//         for(int i=0;i<N-1;i++){
//             int x = stack.pop();
//             if(x > stack.peek()) answer.push(x);
//             else{
//                 if(stack.peek() >= answer.peek()) answer.push(-1);
//                 else answer.push(answer.peek());
//             }
//         }
//         for(int i=0;i<N;i++)
//             reroll.append(answer.pop()).append(" ");
//         System.out.println(reroll);
//     }
// }


// 시간 초과
// public class BOJ_17298 {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int N = Integer.parseInt(br.readLine());
//         StringTokenizer st = new StringTokenizer(br.readLine());
//         Deque<Integer> dq = new LinkedList<>();
//         Stack<Integer> tmp = new Stack<>();
//         String answer = "";

//         for(int i=0;i<N;i++)
//             dq.offer(Integer.parseInt(st.nextToken()));

//         for(int i=0;i<N-1;i++){
//             int x = dq.pollFirst();
//             int n = dq.size();
//             while(n-- > 0){
//                 int check = dq.pollFirst();
//                 tmp.push(check);
//                 if(x < check){
//                     answer += check + " ";
//                     break;
//                 }
//                 if(n == 0 & x >= check) answer += -1 +" ";
//             }

//             int reroll = tmp.size();
//             while(reroll-- > 0)
//                 dq.offerFirst(tmp.pop());
//         }
//         System.out.println(dq);
//         answer += -1;
//         System.out.println(answer);
//     }
// }

// 반례 
// 7 
// 3 2 1 2 3 4 5 -> 4 3 2 3 4 5 -1
// 나는 -1 -1 2 3 4 5 -1 이 나왔다.