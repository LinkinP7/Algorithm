package BOJ;
import java.util.*;;
// 브론즈 2 상수
public class BOJ_2908 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        a = (a%10)*100 + ((a/10)%10)*10 + a/100; 
        b = (b%10)*100 + ((b/10)%10)*10 + b/100;

        int answer = b;
        if(a > b) answer = a;
        System.out.println(answer);
        sc.close();
    }
}
