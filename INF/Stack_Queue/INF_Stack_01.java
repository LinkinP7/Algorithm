package INF.Stack_Queue;
import java.util.*;
// 인프런 36 올바른 괄호
class INF_Stack_01{
	public String solution(String S){
		String answer = "YES";
        char[] ch = S.toCharArray();
        Queue<Character> q = new LinkedList<>();
        for(char x : ch) q.offer(x);
        if(q.peek() == ')') return "NO";

        int count = 0;
        while(!q.isEmpty()){
            char x = q.poll();
            if(x == '(') count++;
            else if(x == ')') count--;
            System.out.println(count);
            if(count < 0) break; 
        }
		return count != 0 ? "NO" : answer;
	}
	public static void main(String[] args){
		INF_Stack_01 T = new INF_Stack_01();
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		System.out.println(T.solution(S));  
        sc.close();
	}
}

// 더 깔끔한 강의 풀이, count 도 필요 없다.
// public String solution(String str){
//     String answer="YES";
//     Stack<Character> stack=new Stack<>();
//     for(char x : str.toCharArray()){
//         if(x=='(') stack.push(x);
//         else{
//             if(stack.isEmpty()) return "NO";
//             stack.pop();
//         }
//     }
//     if(!stack.isEmpty()) return "NO";
//     return answer;
// }

// 괄호가 입력되면 올바른 괄호이면 “YES", 올바르지 않으면 ”NO"를 출력합니다.
// (())() 이것은 괄호의 쌍이 올바르게 위치하는 거지만, (()()))은 올바른 괄호가 아니다.

// (()(()))(() -> NO


// 큐 테스트
// public static void main(String[] args) {
//     Queue<Integer>[] q = new Queue[10];

//     for(int i=0;i<10;i++)
//         q[i] = new LinkedList<>();

//     for(int i=0;i<10;i++)
//         q[i].offer(i);

//     System.out.println(q[0].poll());    
//     System.out.println(q[2].poll());    
//     System.out.println(q[5].poll());    
//     System.out.println(q[8].poll());    
// }