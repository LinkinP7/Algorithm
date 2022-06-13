package BOJ;
import java.util.*;
// 골드 4 별 찍기 - 11
public class BOJ_2448 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(); sc.close();
        
        // String st1 = "  *  ";
        // String st2 = " * * ";
        // String st3 = "*****";
        String[] star = {"  *  ",
                         " * * ",
                         "*****"};

        for(int i=0;i<N;i++){
            System.out.println(star[i]);
        }
    }



}
