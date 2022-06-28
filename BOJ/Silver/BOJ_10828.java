package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 실버 4 스택
public class BOJ_10828 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        StringBuilder answer = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        while(N-- > 0){
            st = new StringTokenizer(br.readLine());

            switch(st.nextToken()){
                case "push"  : int x = Integer.parseInt(st.nextToken());
                               stack.push(x);
                               break;
                case "pop"   : if(!stack.isEmpty()) answer.append(stack.pop()).append("\n");
                               else answer.append(-1).append("\n");
                               break;
                case "size"  : answer.append(stack.size()).append("\n");
                               break;
                case "empty" : if(stack.isEmpty()) answer.append(1).append("\n");
                               else answer.append(0).append("\n");
                               break;
                case "top"   : if(!stack.isEmpty()) answer.append(stack.peek()).append("\n");
                               else answer.append(-1).append("\n");
                               break;
            }
        }
        System.out.println(answer);
    }
}
