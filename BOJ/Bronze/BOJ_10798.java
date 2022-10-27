package BOJ.Bronze;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// 브론즈 1 세로읽기
public class BOJ_10798 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuffer st = new StringBuffer();
        char[][] input = new char[5][];
        int MAX = 0;
        for(int i=0;i<5;i++){
            input[i] = br.readLine().toCharArray(); 
            if(input[i].length >= MAX) MAX = input[i].length;
        }
        
        int count = 0;
        while(count < MAX){
            for(int i=0;i<5;i++){
                if(input[i].length >= count+1){
                    st.append(input[i][count]);     
                } 
            }
            count++;
        }
        System.out.println(st);
        // System.out.println(Arrays.deepToString(input));
        // System.out.println(input[1].length);
    }
}
