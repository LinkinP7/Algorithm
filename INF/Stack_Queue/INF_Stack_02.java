package INF.Stack_Queue;
import java.util.*;
// 인프런 37 괄호문자제거
class INF_Stack_02{
	public String solution(String S){
		StringBuilder sb = new StringBuilder();
        char[] ch = S.toCharArray();
        Queue<Character> q = new LinkedList<>();
        for(char x : ch) q.offer(x);
        int count = 0;
        while(!q.isEmpty()){
            char x = q.poll();
            if(count == 0 && Character.isAlphabetic(x)) sb.append(x);
            if(x == '(') count++;
            else if(x == ')') count--;
        }
		return sb.toString();
	}
	public static void main(String[] args){
		INF_Stack_02 T = new INF_Stack_02();
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		System.out.println(T.solution(S));  
        sc.close();
	}
}

// 강의 풀이, 하지만 스크링에 직접 더할때 시간초과가 날 수 도있다. 풀이는 남아있는 걸 한번에 뽑아서 출력, 나는 하면서 출력 차이
// public String solution(String str){
//     String answer="";
//     Stack<Character> stack=new Stack<>();
//     for(char x : str.toCharArray()){
//         if(x==')'){
//             while(stack.pop()!='(');  // 먼저 꺼내고 리턴받는데 '(' 를 마지막으로 팝 하고 멈춘다. 똑똑하네..
//         }
//         else stack.push(x);
//     }
//     for(int i=0; i<stack.size(); i++) answer+=stack.get(i);   // 스텍에서 get으로 직접 인덱스 값을 파악 가능하다.
//     return answer;
// }


// 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
// (A(BC)D)EF(G(H)(IJ)K)LM(N) -> EFLM
// (AGKD)KDK(TKDM(KD))(ADKF(DK)DKF)DKF(dkf)dkf(d(D)dd)(DFS(d))dD(dk)DDD ->  KDKDKFdkfdDDDD