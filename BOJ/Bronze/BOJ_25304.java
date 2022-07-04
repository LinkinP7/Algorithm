package BOJ.Bronze;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 브론즈 5 영수증
public class BOJ_25304 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int price = Integer.parseInt(br.readLine());
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int sum = 0;    
        for(int i=0;i<N;i++){
            st = new StringTokenizer(br.readLine());
            sum += Integer.parseInt(st.nextToken()) * Integer.parseInt(st.nextToken());
        }

        if(price == sum) System.out.println("Yes");
        else System.out.println("No");
    }
}
