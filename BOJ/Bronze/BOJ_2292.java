package BOJ.Bronze;
import java.util.*;
// 브론즈 2 벌집
public class BOJ_2292 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt()-1;
        int room = 1;
        while(N>0){
            N = N - (room+(room-1)*4+(room-2));
            System.out.println(room +" "+N);
            room++;
        }
        if(room-1 == 0) System.out.println("1");
        else System.out.println(room-1);
        sc.close();
    }
}
// 벌집 방의 layer => n -> n+(n-1)*4+(n-2)  => 6(n-1)