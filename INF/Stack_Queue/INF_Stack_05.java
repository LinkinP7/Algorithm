package INF.Stack_Queue;
import java.util.*;
// 인프런 40 쇠막대기
class INF_Stack_05{
	public int solution(String S){
		int answer = 0;
        char[] ch = S.toCharArray();
        Stack<Character> stack = new Stack<>();
        
        for(int i=0; i<ch.length;i++){
            if(ch[i] == '('){
                stack.push(ch[i]);
            }else{
                if(ch[i-1] == '('){
                    stack.pop();
                    answer += stack.size();
                    // System.out.println(stack);
                }else{
                    stack.pop();
                    answer++; 
                }
            }
        }
		return answer;
	}
	public static void main(String[] args){
		INF_Stack_05 T = new INF_Stack_05();
		Scanner sc = new Scanner(System.in);
		String S = sc.next();
		System.out.println(T.solution(S));  
        sc.close();
	}
}


// 여러 개의 쇠막대기를 레이저로 절단하려고 한다. 효율적인 작업을 위해서 쇠막대기를 아래에서 위로 겹쳐 놓고,
// 레이저를 위에서 수직으로 발사하여 쇠막대기들을 자른다. 쇠막대기와 레이저의 배치는 다음 조건을 만족한다.
// • 쇠막대기는 자신보다 긴 쇠막대기 위에만 놓일 수 있다. - 쇠막대기를 다른 쇠막대기 위에 놓는 경우 완전히 포함되도록 놓되,
// 끝점은 겹치지 않도록 놓는다.
// • 각 쇠막대기를 자르는 레이저는 적어도 하나 존재한다.
// • 레이저는 어떤 쇠막대기의 양 끝점과도 겹치지 않는다.
// 1. 레이저는 여는 괄호와 닫는 괄호의 인접한 쌍 ‘( ) ’ 으로 표현된다. 또한, 모든 ‘( ) ’는 반드시 레이저를 표현한다.
// 2. 쇠막대기의 왼쪽 끝은 여는 괄호 ‘ ( ’ 로, 오른쪽 끝은 닫힌 괄호 ‘) ’ 로 표현된다.
// 위 예의 괄호 표현은 그림 위에 주어져 있다.
// 쇠막대기는 레이저에 의해 몇 개의 조각으로 잘려지는데, 위 예에서 가장 위에 있는 두 개의 쇠막대기는 각각 3개와 2개의 조각으로 잘려지고,
// 이와 같은 방식으로 주어진 쇠막대기들은 총 17개의 조각으로 잘려진다.
// 쇠막대기와 레이저의 배치를 나타내는 괄호 표현이 주어졌을 때, 잘려진 쇠막대기 조각의 총 개수를 구하는 프로그램을 작성하시오.

// ()(((()())(())()))(())    ->   17

// (((()(()()))(())()))(()())   ->  24

// ((( (()()))(())()))(()()) 
// (((( ()))(())()))(()()) 
// (((( ))(())()))(()())
// ((( )()))(()())
// (( ))(()())