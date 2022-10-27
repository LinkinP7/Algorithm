package INF.Recursive_Tree_Graph;
import java.util.*;
// 인프런 59 부분집합 구하기(DFS)
public class INF_Recursive_06{
	static int n;
	static int[] check;
	public void DFS(int L){
		if(L == n+1){
			String tmp = "";
			for(int i=1;i<=n;i++){
				if(check[i]==1) tmp+=(i+" ");
			}
			if(tmp.length()>0) System.out.println(tmp);
		}else{
			check[L] = 1;
			DFS(L+1); // 왼쪽으로 뻗는 가지, '사용한다' 경우
			check[L] = 0;
			DFS(L+1); // 오른쪽으로 뻗는 가지 로 생각하자. '사용하지 않는다' 경우
		}
	}
	public static void main(String[] args){
		INF_Recursive_06 T = new INF_Recursive_06();
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		check = new int[n+1]; // 배열의 인덱스 번호를 원소로 생각하기 위해 +1 해줌
		T.DFS(1); // root부터 시작
		sc.close();
	}
}

// 자연수 N이 주어지면 1부터 N까지의 원소를 갖는 집합의 부분집합을 모두 출력하는 프로그램
// 단, 공집합은 출력하지 않는다.
// 이진상태트리를 만들어 보면 된다. level이 N까지인 이진노드가 만들어지며 true,false 인 경우로 나뉜다.

// input : 3
// 1 2 3
// 1 2
// 1 3
// 1
// 2 3
// 2
// 3

// 즉, N개의 숫자로 조합할 수 있는 모든 경우의 수가 된다.