import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 실버 2 스택 수열
public class BOJ_1874 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        int[] arr = new int[N];
        
        for(int i=0;i<N;i++)
            arr[i] = Integer.parseInt(br.readLine());
        
        Stack<Integer> stack = new Stack<>();
        int x = 1;
        stack.push(x++);
        sb.append("+").append("\n");
        boolean flag = true;

        for(int i=0;i<N;i++){
            if(stack.isEmpty() && x >= arr[i]){
                stack.push(x++);
                sb.append("+").append("\n");
            }else if(stack.isEmpty() && x < arr[i]){
                System.out.println("NO");
                flag = false;
                break;
            }

            while(stack.peek() < arr[i]){
                stack.push(x++);
                sb.append("+").append("\n");
            }

            if(stack.peek() == arr[i]){
                stack.pop();
                sb.append("-").append("\n");
            } 
        }
        if(!stack.isEmpty()){
            System.out.println("NO");
            flag = false;
        } 

        if(flag) System.out.println(sb);
    }
}



//반례 5 4 2 3 1 5
//반례 