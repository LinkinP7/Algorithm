package INF.Recursive_Tree_Graph;
import java.util.*;
// 인프런 60 이진트리 레벨탐색(BFS : Breadth-First Search)
public class INF_Recursive_07{
	Node root; 
	public void BFS(Node root){ 
		Queue<Node> Q = new LinkedList<>();
		Q.offer(root);
		int L=0; // 레벨은 0 부터 시작,  레벨은 거리가 된다. 몇레벨만에 찾아가는지를 확인

		while(!Q.isEmpty()){
			int len = Q.size();
			System.out.print(L+" level : ");
			for(int i=0;i<len;i++){ // len, 즉 원소 개수만큼 돌기
				Node current = Q.poll(); // 현재노드, 현재노드와 연결된 자식들을 큐에 넣어주면 된다.
				System.out.print(current.data+" ");
				if(current.lt!=null) Q.offer(current.lt); // 왼쪽자식이 있다면 추가
				if(current.rt!=null) Q.offer(current.rt);
			} // for문이 끝나면 Level이 끝나므로 증가시켜 주면 된다.
			L++;  // 하위노드가 없다면 어차피 큐에 추가되지 않으므로 다음 와일에서 Q.isEmpty가 되어 종료
			System.out.println();
		}

	}
	public static void main(String[] args){
		INF_Recursive_07 tree = new INF_Recursive_07(); // 메인클래스 객체 생성
		tree.root = new Node(1); // root에 data 1을 넘김 = data가 넘어오면 주소가 생김
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7); // 4 5 6 7의 자식노드(lt,rt 는 null 이다)
		tree.BFS(tree.root);
	}
}

// 이진트리 순회(넓이우선탐색 : 레벨탐색) - 루트에서 레벨단위로 방문하는 것이 BFS

// 0 level : 1       
// 1 level : 2 3     
// 2 level : 4 5 6 7 