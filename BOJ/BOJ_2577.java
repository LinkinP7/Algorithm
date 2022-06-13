package BOJ;
import java.util.*;
// 브론즈 2 숫자의 개수
public class BOJ_2577 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int mul = 1, x= 0, idx = 0;
        int[] answer = new int[10];

        while(x<3){
            mul *= sc.nextInt();
            x++;
        }    
        String sum = String.valueOf(mul);
        for(int i=0;i<sum.length();i++){
            idx = mul%10;
            answer[idx]++;
            mul = mul/10;  
        }
        // System.out.println(Arrays.toString(answer));
        for(int i=0;i<answer.length;i++){
            System.out.println(answer[i]);
        }

        sc.close();
    }
}
