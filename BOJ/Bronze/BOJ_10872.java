package BOJ.Bronze;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// 브론즈 5 팩토리얼
public class BOJ_10872 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        if(N==0) System.out.println(1);
        else System.out.println(factorial(N));
    }

    public static int factorial(int N){
        if(N==1) return 1;
        else return N*factorial(N-1);
    }
}
