package INF.String;
import java.util.*;
// 인프런12 암호
// class INF_12 {
//     public String solution(String str, int N) {
//         String answer = "";
//         str = str + " ";
//         char[] pw = new char[N];
//         for(int i=0;i<N;i++){
//             String decord = "", binary ="";
//             decord = str.substring(0, 7);
//             for(int j=0;j<7;j++){
//                 if(decord.charAt(j) == '#') binary += "1";
//                 else binary += "0"; 
//             }
//             pw[i] = (char)Integer.parseInt(binary,2); 
//             str = str.substring(7);
//         }
//         // 공백인덱스 안넣고 N-1번 반복 후 pw[N-1] = str; 넣어줘도 같음
//         answer = String.valueOf(pw);
//         return answer;
//     }
//     public static void main(String[] args) {
//         INF_12 T = new INF_12();
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         String str = sc.next();
//         System.out.println(T.solution(str, N));
//         sc.close();
//     }
// }


// 비밀편지는 알파벳 한 문자마다 # 또는 *이 일곱 개로 구성되어 있습니다.
// 만약 현수가 “#*****#”으로 구성된 문자를 보냈다면 영희는 현수와 약속한 규칙대로 다음과 같이 해석합니다.
// 1. “#*****#”를 일곱자리의 이진수로 바꿉니다. #은 이진수의 1로, *이진수의 0으로 변환합니다. 결과는 “1000001”로 변환됩니다.
// 2. 바뀐 2진수를 10진수화 합니다. “1000001”을 10진수화 하면 65가 됩니다.
// 3. 아스키 번호가 65문자로 변환합니다. 즉 아스크번호 65는 대문자 'A'입니다.
// 참고로 대문자들의 아스키 번호는 'A'는 65번, ‘B'는 66번, ’C'는 67번 등 차례대로 1씩 증가하여 ‘Z'는 90번입니다.
// 현수가 4개의 문자를 다음과 같이 신호로 보냈다면
// #****###**#####**#####**##**
// 이 신호를 4개의 문자신호로 구분하면
// #****## --> 'C'
// #**#### --> 'O'
// #**#### --> 'O'
// #**##** --> 'L'

// 4
// #****###**#####**#####**##**     ->     COOL

// 문제 풀이 -> substring 의 endIndex가 범위를 넘어도 문자만 들어오면 괜찮은가?? 맨 마지막을 0,7 로 자를때 outOfBound 가 생기지 않았다.
// 그리고 바로 replace로 바꿔주는게 훨씬 좋았다. 또 바로 answer 에 더해버리는게 배열로 안쓰고 좋았다.... 
class INF_String_12 {
    public String solution(String str, int N) {
        String answer = "";
        for(int i=0;i<N;i++){
            String tmp = str.substring(0,7).replace('#','1').replace('*','0');
            int num = Integer.parseInt(tmp,2);
            answer += (char)num;
            str = str.substring(7);
        }
        return answer;
    }
    public static void main(String[] args) {
        INF_String_12 T = new INF_String_12();
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String str = sc.next();
        System.out.println(T.solution(str, N));
        sc.close();
    }
}