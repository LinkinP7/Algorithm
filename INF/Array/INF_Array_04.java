package INF.Array;
import java.util.*;
// 인프런 16 피보나치 수열
// public class INF_Array_4 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt(); sc.close();
//         int[] fibo = new int[N];
//         fibo[0] = 1; fibo[1] = 1;

//         for(int i=2;i<N;i++)
//             fibo[i] = fibo[i-2] + fibo[i-1];
        
//         for(int i=0;i<N;i++)
//             System.out.print(fibo[i]+" ");
//     }
// }

// 입력받은 N만큼의 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.
/// 배열 안쓰는 버전

public class INF_Array_04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); sc.close();
        int a = 1, b = 1, c;
        System.out.print(a+" "+b+" ");
        for(int i=2;i<N;i++){
            c = a + b;
            System.out.print(c+" ");
            a = b;
            b = c;
        }
    }
}
