package INF.Recursive_Tree_Graph;
import java.util.*;
// 인프런 64 경로탐색(인접리스트, ArrayList)
public class INF_Recursive_12{
	static int n, m, answer=0;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch;
	public void DFS(int v){ 
		if(v == n) answer++;
		else{
			for (int nv : graph.get(v)) {
				if(ch[nv]==0){
					ch[nv] = 1;
					DFS(nv);
					ch[nv] = 0;
				}
			}
		}
	}
	public static void main(String[] args){
		INF_Recursive_12 T = new INF_Recursive_12(); // 메인클래스 객체 생성
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=n; i++)
			graph.add(new ArrayList<Integer>());
		ch = new int[n+1];
		for(int i=0;i<m;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		ch[1]=1; // 시작 노드
		T.DFS(1);
		System.out.println(answer);
		sc.close();
	}
}

// 정점이 10000개만 되도 인접 배열은 이중for 로 돌으므로 메모리 낭비가 크다.
// 인접리스트를 활용하면 각 행이 리스트가 되어 들어있는 원소만 확인해주면 된다.
// 1: {2, 3, 4}
// 2: {1, 3, 5}
// 3: {4}
// 4: {2, 5}
// 5: {}
// 갈 수 있는지 체크할 필요도 없이 Array에 있는 값만 탐색해주면 된다.

// 그래프는 G(V,E) 로 표현한다. 노드(V)와 간선(E)
// 무방향(양방향) 그래프와 방향 그래프, 가중치 방향그래프가 있다.

// 무방향은 그래프 2차원 배열에 들어온 [행][열], [열][행] 으로 1 check 해준다. graph[a][b] , graph[b][a]
// 방향그래프는 방향이 존재하므로 간선정보 그대로 체크해준다. graph[a][b] , 행에서 열로 이동한다.
// 가중치 방향그래프는 graph[a][b] = c 로 가중치 c 까지 추가해준다.
// 0이 아닌 수가 나올때 그것을 가중치로 생각해준다. 

// 경로 탐색 시 한번 방문한 경로는 방문하지 않아야 한다.

// 방향그래프가 주어지면 1번 노드에서 5번 노드(정점) 까지 가는 가지 수를 출력하라.
// 첫째 줄에는 정점의 수 N과 간선의 수 M이 주어진다.

// 매번 노드에서 노드의 수만큼 for문으로 체크해준다. 다 돌면 돌아갈때 다시 체크를 풀어주어야 한다.
// 백트레킹이라고 한다.

// 정점이 천개, 만개 들어오면 인접행렬로는 너무 비효율적이므로 인접리스트로 풀어야 한다.
// 인접리스트로 풀기
// input
// 5 9
// 1 2
// 1 3
// 1 4
// 2 1
// 2 3
// 2 5
// 3 4
// 4 2 
// 4 5

// answer
// 6