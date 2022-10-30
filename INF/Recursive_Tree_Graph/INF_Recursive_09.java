package INF.Recursive_Tree_Graph;
// 인프런 62 Tree 말단노드까지의 가장 짧은 경로(DFS)
public class INF_Recursive_09{
	Node root;
	public int DFS(int L, Node root){ 
		if(root.lt == null && root.rt == null) return L;  // 말단노드일 경우 L 리턴
		else return Math.min(DFS(L+1, root.lt), DFS(L+1, root.rt)); // 자식이 있을경우 태우기
	}
	public static void main(String[] args){
		INF_Recursive_09 T = new INF_Recursive_09(); // 메인클래스 객체 생성
		T.root = new Node(1);
		T.root.lt = new Node(2);
		T.root.rt = new Node(3);
		T.root.lt.lt = new Node(4);
		T.root.lt.rt = new Node(5);
		System.out.println(T.DFS(0,T.root));
	}
}

// 루트노드에서 말단노드까지의 길이 중 가장 짧은 길이를 구하는 프로그램
// 최단거리 문제는 BFS 로 푸는게 맞으나 DFS 연습용
// 완전이진트리가 아닌경우 DFS로 풀기에 제약이 있을 수 있다.

// 1 2 4 5 3 (전위)