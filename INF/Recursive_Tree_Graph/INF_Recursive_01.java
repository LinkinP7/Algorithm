package INF.Recursive_Tree_Graph;
import java.util.*;
// 인프런 54 재귀함수(스택프레임)
public class INF_Recursive_01{
	public void Recursive(int N){
		if(N==0) return;
		else{
			// System.out.println(N);
            Recursive(N-1);
			System.out.print(N+" ");  // 이렇게 짜면 역순으로 함수부터 쭉 타고 들어가서 끝나면 출력만 쫘르르~
		}
	}
	public static void main(String[] args){
		INF_Recursive_01 T = new INF_Recursive_01();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        T.Recursive(N);
        sc.close();
	}
}

// 자연수 N이 입력되면 재귀함수를 이용해 1부터 N까지 출력하는 프로그램을 작성하세요.

// 재귀함수는 반복문의 형태
// 재귀함수는 스택프레임을 사용한다. 
// Stact에 [ Recursive(3), Recursive(2), Recursive(1)] 이런식으로 쌓이고 팝된다.
// 매개변수 정보, 지역변수 정보, 복귀주소(처음으로) 3개의 정보를 프레임으로 생각하자.
// 스택프레임을 이용해 백트레킹을 할 수 있다.
// 하지만 스택프레임은 무겁고 메모리 낭비도 심하다. 간단한 반복문은 다른걸 이용하자.

// DFS는 스택, BFS는 큐로 생각하자

// 재귀함수는 일단 if-else 조건을 놓고 시작하자.