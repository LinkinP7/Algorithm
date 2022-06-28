package BOJ.Silver;
import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// 실버 4 제로
public class BOJ_10773 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0;
        Stack<Integer> stack = new Stack<>();
        for(int i=0;i<N;i++){
            int x = Integer.parseInt(br.readLine());
            if(x != 0) stack.push(x);
            else stack.pop();
        }
        int length = stack.size();
        for(int i = 0; i<length; i++)
            answer += stack.pop();
        
        System.out.println(answer);    
    }    
}
