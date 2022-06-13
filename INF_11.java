import java.util.*;
// 인프런11 문자열 압축
class INF_11 {
    public String solution(String str) {
        String answer = "";
        char[] ch = str.toCharArray();
        int count = 1;
        if(ch.length > 1){
            for(int i=1;i<ch.length;i++){
                if(ch[i-1] == ch[i]) count++;
                else{
                    if(count > 1) answer += ch[i-1] + String.valueOf(count);
                    else answer += ch[i-1];                 
                    count = 1;
                }
            }
            if(count > 1) answer += ch[ch.length-1] + String.valueOf(count);
            else answer += ch[ch.length-1];    
        }else  answer = str;
        return answer;
    }
    public static void main(String[] args) {
        INF_11 T = new INF_11();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        System.out.println(T.solution(str));
        sc.close();
    }
}

// 알파벳 대문자로 이루어진 문자열을 입력받아 같은 문자가 연속으로 반복되는 경우 반복되는 문자 바로 오른쪽에 반복 횟수를 표기하는 방법으로 문자열을 압축하는 프로그램을 작성하시오. 단 반복횟수가 1인 경우 생략합니다.
// KKHSSSSSSSE   ->   K2HS7E
// KSTTTSEEKFKKKDJJGG -> KST3SE2KFK3DJ2G2  