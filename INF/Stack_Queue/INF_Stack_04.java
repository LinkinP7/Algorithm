package INF.Stack_Queue;
import java.util.*;
// 인프런 39 후위식 연산(postfix)
class INF_Stack_04{
	public int solution(String S){
		int answer = 0;
        Stack<Integer> stack = new Stack<>();

        for(char x : S.toCharArray()){
            if(Character.isDigit(x)) stack.push((int)x - 48);
            else{
                // System.out.println("STACKKK: " + stack);
                int n2 = stack.pop();
                int n1 = stack.pop();
                switch(x){
                    case '+': stack.push(n1+n2); break;
                    case '-': stack.push(n1-n2); break;
                    case '*': stack.push(n1*n2); break;
                    case '/': stack.push(n1/n2); break;
                }
            }
        }
        answer = stack.pop();
		return answer;
	}
	public static void main(String[] args){
		INF_Stack_04 T = new INF_Stack_04();
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		System.out.println(T.solution(S));  
        sc.close();
	}
}


// 후위연산식이 주어지면 연산한 결과를 출력하는 프로그램을 작성하세요.
// 만약 3*(5+2)-9 을 후위연산식으로 표현하면 352+*9- 로 표현되며 그 결과는 12입니다.
// 5 + 2 =>> 52+ 
// 3 * 7 =>> 37*
// 숫자1 숫자 2 연산자    ->   연산자를 찾는다. 그리고 앞의 두 숫자를 해당 연산자로 계산한다.

// 352+*9-    ->     12
