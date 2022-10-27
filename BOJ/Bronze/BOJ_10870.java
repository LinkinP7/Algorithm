package BOJ.Bronze;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// 브론즈 2 피보나치 수 5
public class BOJ_10870 {
    static int[] fibo; 
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        fibo = new int[N+1];
        System.out.println(F(N));
    }

    public static int F(int N){
        if(fibo[N] > 0) return fibo[N];
        if(N==0) return fibo[N] = 0;
        else if(N==1) return fibo[N] = 1;
        else return fibo[N] = F(N-1)+F(N-2);
    }
}
