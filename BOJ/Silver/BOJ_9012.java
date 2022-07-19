package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 실버 4 괄호
public class BOJ_9012 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Stack<Character> vps = new Stack<>();
        StringBuffer sb = new StringBuffer();

        while(N-->0){
            vps.clear();
            char[] ps = br.readLine().toCharArray();
            for(char x : ps){
                if(x == '(') vps.push(x);
                else{
                    if(vps.isEmpty()){
                        vps.push(x);
                        break;
                    } 
                    else vps.pop();
                } 
            }
            // System.out.println(vps.isEmpty()); 
            if(vps.isEmpty()) sb.append("YES").append("\n");
            else sb.append("NO").append("\n");
        }
        System.out.println(sb);
    }
}
