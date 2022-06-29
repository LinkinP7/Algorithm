package BOJ.Gold;
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
        int[] input = new int[N];
        int[] answer = new int[N];
        StringBuilder sb = new StringBuilder();
        
        for(int i=0;i<N;i++)
            input[i] = Integer.parseInt(st.nextToken());

        for(int i=N-1;i>=0;i--){
            while(!stack.isEmpty() && stack.peek() <= input[i])
                stack.pop();
            if(stack.isEmpty()) answer[i] = -1;
            else answer[i] = stack.peek();
            stack.push(input[i]);
        }

        for(int x : answer)
            sb.append(x + " ");
        System.out.println(sb);    
    }
}

// 2중이니 당연히 시간초과 - 그래도 답은 잘 나온다
// public class BOJ_17298 {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int N = Integer.parseInt(br.readLine());
//         StringTokenizer st = new StringTokenizer(br.readLine());
//         Stack<Integer> stack = new Stack<>();
//         List<Integer> answer = new ArrayList<>();
//         StringBuilder reroll = new StringBuilder();
//         for(int i=0;i<N;i++)
//             stack.push(Integer.parseInt(st.nextToken()));
//         answer.add(-1);

//         for(int i=0;i<N-1;i++){

//             int x = stack.pop();
//             if(x > stack.peek()) answer.add(x);
//             else{
//                 boolean checkN = true;
//                 for(int j=answer.size()-1;j>=0;j--){
//                     if(stack.peek() < answer.get(j)){   // stack.peek() 이 비교기준이다! pop 한놈이 기준이 아니라
//                         checkN = false;
//                         answer.add(answer.get(j));
//                         break;
//                     }
//                 }
//                 if(checkN) answer.add(-1);
//             }
//         }

//         for(int i = answer.size()-1; i >= 0; i--)
//             reroll.append(answer.get(i)).append(" ");
//         System.out.println(reroll);
//     }
// }


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
// 나는 -1 -1 2 3 4 5 -1 이 나왔다. stack으로 풀 때 