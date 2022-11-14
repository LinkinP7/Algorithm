package BOJ.Bronze;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// 브론즈 2 OX퀴즈
public class BOJ_8958 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            int answer = 0, cnt = 0;
            char[] input = br.readLine().toCharArray();

            for (char c : input) {
                if(c == 'O'){
                    cnt++;                    
                    answer += cnt;
                }else cnt = 0; 
            }
            sb.append(answer).append("\n");
        }
        System.out.println(sb);
    }    
}
