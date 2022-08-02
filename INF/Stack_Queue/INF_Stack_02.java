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

// 입력된 문자열에서 소괄호 ( ) 사이에 존재하는 모든 문자를 제거하고 남은 문자만 출력하는 프로그램을 작성하세요.
// (A(BC)D)EF(G(H)(IJ)K)LM(N) -> EFLM
// (AGKD)KDK(TKDM(KD))(ADKF(DK)DKF)DKF(dkf)dkf(d(D)dd)(DFS(d))dD(dk)DDD ->  KDKDKFdkfdDDDD