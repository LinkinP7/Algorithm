package BOJ.Bronze;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 브론즈 3 직각삼각형
// Math, input
public class BOJ_4153 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while(true){
            int MAX = 0;
            int[] input = new int[3];
            st = new StringTokenizer(br.readLine());
            for(int i=0;i<3;i++){
                input[i] = Integer.parseInt(st.nextToken());
                if(input[i] >= MAX) MAX = input[i];
            }

            if(MAX == 0) break;
            
            int x = -1, y = -1, z = 0;
            for(int i : input){
                if(i == MAX) z = i*i;
                else{
                    if(x == -1) x = i*i;
                    else y = i*i;   
                }
            }

            sb.append(z == x+y ? "right" : "wrong").append("\n");
        }
        System.out.println(sb);
        
    }    
}
