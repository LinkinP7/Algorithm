package INF.Recursive_Tree_Graph;
import java.util.*;
// 인프런 65 그래프 최단거리(BFS)
public class INF_Recursive_13{
	static int n, m;
	static ArrayList<ArrayList<Integer>> graph;
	static int[] ch, dis;
	public void BFS(int v){ 
		Queue<Integer> Q = new LinkedList<>();
		ch[v] = 1;
		dis[v] = 0;
		Q.offer(v);
		while(!Q.isEmpty()){
			int cv = Q.poll();
			for(int nv : graph.get(cv)){
				if(ch[nv] == 0){
					ch[nv] = 1;
					Q.offer(nv);
					dis[nv] = dis[cv]+1;
				}
			}
		}
	}
	public static void main(String[] args){
		INF_Recursive_13 T = new INF_Recursive_13(); 
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
		m = sc.nextInt();
		graph = new ArrayList<ArrayList<Integer>>();
		for(int i=0;i<=n; i++)
			graph.add(new ArrayList<Integer>());
		ch = new int[n+1];
		dis = new int[n+1];
		for(int i=0;i<m;i++){
			int a = sc.nextInt();
			int b = sc.nextInt();
			graph.get(a).add(b);
		}
		ch[1]=1; // 시작 노드
		T.BFS(1);
		for(int i=2;i<=n;i++)
			System.out.println(i+" : "+dis[i]);
		sc.close();
	}
}

// 1번 정점에서 각 정점으로 가는 최소 이동 간선수를 출력하세요
// 첫째 줄에는 정점의 수 N과 간선의 수 M이 주어진다.

// 0 level : 1
// 1 level : 3 4
// 2 level : 5 6
// 3 level : 2

// input
// 6 9
// 1 3
// 1 4
// 2 1
// 2 5
// 3 4
// 4 5
// 4 6
// 6 2
// 6 5

// output
// 2 : 3
// 3 : 1
// 4 : 1
// 5 : 2
// 6 : 2