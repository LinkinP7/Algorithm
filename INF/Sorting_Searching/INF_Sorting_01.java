package INF.Sorting_Searching;
import java.util.*;
// 인프런 44 선택 정렬
class INF_Sorting_01{
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
		INF_Sorting_01 T = new INF_Sorting_01();
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		System.out.println(T.solution(S));  
        sc.close();
	}
}
