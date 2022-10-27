package INF.Recursive_Tree_Graph;
import java.util.*;
// 인프런 61 송아지 찾기1(BFS)
public class INF_Recursive_08{
	int answer=0;
	int[] dis={1, -1, 5};
	int[] check;
	Queue<Integer> Q = new LinkedList<>();

	public int BFS(int s, int e){ 
		check = new int[10001];
		check[s]=1;
		Q.offer(s);
		int L = 0;

		while(!Q.isEmpty()){
			int len = Q.size();
			System.out.print(L+" level : ");
			for(int i=0;i<len;i++){ // len, 즉 원소 개수만큼 돌기
				int x = Q.poll();
				System.out.print(x+" ");
				// if(x == e) return L;
				for (Integer j : dis) {
					int nx = x + j;
					if(nx == e) return L+1;
					if(nx >= 1 && nx <= 10000 && check[nx]==0){  // 방문한지 체크
						check[nx] = 1; // 방문 기록
						Q.offer(nx);   // 큐에 삽입
					}
				}
			} // for문이 끝나면 Level이 끝나므로 증가시켜 주면 된다.
			L++;  // 하위노드가 없다면 어차피 큐에 추가되지 않으므로 다음 와일에서 Q.isEmpty가 되어 종료
			System.out.println();
		}
		return 0;
	}
	public static void main(String[] args){
		INF_Recursive_08 T = new INF_Recursive_08(); // 메인클래스 객체 생성
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(T.BFS(s,e));
		sc.close();
	}
}

// BFS : 상태트리탐색
// 현수는 송아지를 잃어버렸다. 다행히 송아지에는 위치추적기가 달려 있다.
// 현수의 위치와 송아지의 위치가 수직선상의 좌표 점으로 주어지면 현수는 현재 위치에서 송아지의 위치까지 다음과 같은 방법으로 이동한다.
// 송아지는 움직이지 않고 제자리에 있다.
// 현수는 스카이 콩콩을 타고 가는데 한 번의 점프로 앞으로 1, 뒤로 1, 앞으로 5를 이동할 수 있다. 
// 최소 몇 번의 점프로 현수가 송아지의 위치까지 갈 수 있는지 구하는 프로그램을 작성하세요.

// 앞으로 1, 뒤로 1, 앞으로 5 는 3갈래로 생각해보면 된다.
// 0 level : 5
// 1 level : 6 4 10
// 2 level : 7 11 3 9 15   // 한번 방문했던곳은 굳이 갈필요 없으니 큐에 넣으면 안된다.
// 3 level : 8 12 16 2 14 16 20   // 14가 발견되는 순간 레벨을 리턴해주면 된다.

// 최소의 횟수로 어디까지 가는 최단거리를 구하는걸 최단거리 알고리즘