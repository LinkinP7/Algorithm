package BOJ.Bronze;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// 브론즈 2 첫 글자를 대문자로
public class BOJ_4458 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(N-->0){
            char[] line = br.readLine().toCharArray();
            if(Character.isLowerCase(line[0])) line[0] = Character.toUpperCase(line[0]);
            sb.append(String.valueOf(line)).append("\n");   
        }
        System.out.println(sb);
    }
}
