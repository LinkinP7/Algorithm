package BOJ.Bronze;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
// 브론즈 3 나는 요리사다
public class BOJ_2953 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> point = new ArrayList<>(); 
        int max = 0;
        for(int i=0;i<5;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            for(int j=0;j<4;j++){
                sum += Integer.parseInt(st.nextToken());
            }
            point.add(sum);
            if(max < sum) max = sum;
        }    
        
        System.out.println(point.indexOf(max)+1 + " " + point.get(point.indexOf(max)));    
    }
}
