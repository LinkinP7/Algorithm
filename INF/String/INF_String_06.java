package INF.String;
import java.util.Scanner;
// 인프런 6 중복문자제거  
class INF_String_06 {
    public String solution(String str){
        String answer = ""; 
        for(int i=0;i<str.length();i++){
            if(str.indexOf(str.charAt(i)) == i)    // 처음 찾아지는 인덱스와 현재 인덱스가 같으면 고유값
                answer += str.charAt(i);
        }
        return answer;
    }
    public static void main(String[] args){
        INF_String_06 T = new INF_String_06();
        Scanner sc = new Scanner(System.in);
        String n = sc.next();
        System.out.println(T.solution(n));
        sc.close();
    }
}

// 소문자로 된 한개의 문자열이 입력되면 중복된 문자를 제거하고 출력하는 프로그램을 작성하세요. 중복이 제거된 문자열의 각 문자는 원래 문자열의 순서를 유지합니다.
// ksekkset  ->   kset
// kdkgksjgkjlsjgkjsljgkjaksjg   ->   kdgsjla

