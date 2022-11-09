package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 실버 2 스택 수열
// Stack
public class BOJ_1874 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        Stack<Integer> stack = new Stack<>();
        
        int x = 1; boolean flag = true;
        for(int i=0;i<N;i++){
            int num = Integer.parseInt(br.readLine());
            while(x < num){
                stack.push(x);
                sb.append("+").append("\n");
                if(x<N)x++;
            }
            
            if(x == num){
                stack.push(x); if(x<N)x++;
                sb.append("+").append("\n");
                stack.pop();
                sb.append("-").append("\n");
            }else if(x > num) {
                if(stack.peek() == num){
                    stack.pop();
                    sb.append("-").append("\n");
                }else{
                    flag = false; 
                } 
            }
            // System.out.println("STACK!@@@@:==>" +stack + "NUM:::"+num);
        }
        if(flag) System.out.println(sb);
        else System.out.println("NO");
    }
}

//반례 5 4 2 3 1 5
//반례 