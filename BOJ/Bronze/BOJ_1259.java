package BOJ.Bronze;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// 브론즈 1 팰린드롬수
public class BOJ_1259 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            char[] ch = br.readLine().toCharArray();
            if(ch.length==1 && ch[0]=='0') break;
            boolean flag = true;
            int N = ch.length;
            for(int i=0;i<N/2;i++){
                if(ch[i] != ch[N-1-i]) flag = false; 
            }
            System.out.println(flag ? "yes" : "no");
        }
    }
}
