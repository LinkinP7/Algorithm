package INF.String;
import java.util.*;
// 인프런10 가장 짧은 문자거리
class INF_String_10 {
    public int[] solution(String str, String s) {
        int[] answer = new int[str.length()];
        char t = s.charAt(0);
        int lt = str.indexOf(t), rt = str.indexOf(t, lt + 1);
        for (int i = 0; i < str.length(); i++) {
            if (rt != -1 && i > rt) {
                lt = rt;
                rt = str.indexOf(t, lt + 1);
            }
            if(str.charAt(i) == t) answer[i] = 0;
            else answer[i] = Math.min(Math.abs(i - lt), Math.abs(rt - i));
        }
        return answer;
    }
    public static void main(String[] args) {
        INF_String_10 T = new INF_String_10();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = sc.next();
        int[] answer = T.solution(str, s);
        for (int x : answer)
            System.out.print(x + " ");

        // System.out.println(Arrays.toString(T.solution(str, s)));
        sc.close();
    }
}

// 한 개의 문자열 s와 문자 t가 주어지면 문자열 s의 각 문자가 문자 t와 떨어진 최소거리를 출력하는 프로그램을 작성하세요.
// teachermode e    ->   1 0 1 2 1 0 1 2 2 1 0
// kkkkkkkk k       ->   0 0 0 0 0 0 0 0 
// fkdgkjdflkgjljslgjkfldjlkfdg f    ->   0 1 2 3 3 2 1 0 1 2 3 4 5 6 5 4 3 2 1 0 1 2 3 2 1 0 1 2 

// 강의 풀이   for문으로 두 번 돌려서 좌측, 우측으로 거리 비교.. 
// class INF_10 {
//     public int[] solution(String str, char s) {
//         int[] answer = new int[str.length()];
//         int p = 1000;
//         for(int i=0; i<s.length();i++){
//             if(s.charAt(i)==t){
//                 p=0;
//                 answer[i]=p;
//             }else{
//                 p++;
//                 answer[i]=p;
//             }
//         }
//         p=1000;
//         for(int i=s.length()-1; i>=0;i--){
//             if(s.charAt(i)==t) p=0;
//             else{
//                 p++;
//                 answer[i] = Math.min(answer[i],p);
//             }
//         }
//         return answer;
//     }
//     public static void main(String[] args) {
//         INF_10 T = new INF_10();
//         Scanner sc = new Scanner(System.in);
//         String str = sc.next();
//         char c = sc.next().charAt(0);
//         for (int x : T.solution(str.c))
//             System.out.print(x + " ");
//         sc.close();
//     }
// }