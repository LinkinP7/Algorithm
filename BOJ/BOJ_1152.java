package BOJ;
import java.util.*;
// 브론즈 2 단어의 개수
public class BOJ_1152 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine().trim(); sc.close();
        System.out.println(str.length());
        if(str.length() == 0){ System.out.println("0");}
        else{
            String[] word = str.split(" ");
            System.out.println(Arrays.toString(word));
            System.out.println(word.length);
        }
    }    
}
