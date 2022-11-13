package BOJ.Bronze;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 브론즈 1 최대공약수와 최소공배수
public class BOJ_2609 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int x = Integer.parseInt(st.nextToken());
        int y = Integer.parseInt(st.nextToken());
        int GCD = 0, LCM = 0;
        int leng = Math.min(x, y);

        for(int i=1;i<leng+1;i++)
            if(x%i == 0 && y%i ==0) GCD = i;
        
        LCM = x*y/GCD;
        
        System.out.println(GCD + "\n" + LCM);

    }
}
