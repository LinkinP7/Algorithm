package BOJ.Bronze;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// 브론즈 2 문자열 분석
public class BOJ_10820 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String input = "";
        while((input = br.readLine()) != null){
            char[] line = input.toCharArray();
            StringBuilder sb = new StringBuilder();
            int lower = 0, upper = 0, number = 0, space = 0;
            for(char x : line){
                if(Character.isLowerCase(x)) lower++;  
                else if(Character.isUpperCase(x)) upper++;
                else if(Character.isDigit(x)) number++; 
                if(Character.isWhitespace(x)) space++;
            }   
            sb.append(lower).append(" ").append(upper).append(" ").append(number).append(" ").append(space);
            System.out.println(sb);
        }
    }
}
