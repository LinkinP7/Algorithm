import java.util.*;
// 브론즈 2 다이얼
public class BOJ_5622 {
    public static void main(String[] args) {
        int answer = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase(); sc.close();
        char[] dial = str.toCharArray();
        for(int i=0;i<dial.length;i++){
            answer += oldTel(dial[i]);
        }
        System.out.println(answer+dial.length);
    }

    static int oldTel(char c){      // 백준의 자바 11은 multi case를 지원하지 않는다
        System.out.println(c);
        int count = 0;
        switch(c){
            case 'A': case 'B': case 'C': count = 2; break;
            case 'D': case 'E': case 'F': count = 3; break;
            case 'G': case 'H': case 'I': count = 4; break;
            case 'J': case 'K': case 'L': count = 5; break;
            case 'M': case 'N': case 'O': count = 6; break;
            case 'P': case 'Q': case 'R': case 'S': count = 7; break;
            case 'T': case 'U': case 'V': count = 8; break;
            case 'W': case 'X': case 'Y': case 'Z': count = 9; break;
        }
        System.out.println(count);
        return count;
    }
}
