package INF.Recursive_Tree_Graph;
// 인프런 58 이진트리순회(DFS : Depth-First Search)
class Node{
	int data;
	Node lt, rt;  // 인스턴스 변수는 Node라는 클래스 객체의 주소를 저장하는 변수이다.
	public Node(int val){ // 생성자
		data = val;
		lt = rt = null; // 객체가 생성되는 순간에는 null
	}
}

public class INF_Recursive_05{
	Node root;  // 노드 클래스의 객체의 주소를 저장하는 참조형 변수
	public void DFS(Node root){ // 파라미터는 인스턴스 변수이므로 주소값이다.
		if(root==null) return;
		else{ // 이진트리이므로 함수호출이 두번일어난다. 함수호출수 = 가지수
			System.out.print(root.data+" "); // 전위순회
			DFS(root.lt);
			// System.out.print(root.data+" "); // 중위순회
			DFS(root.rt);
			// System.out.print(root.data+" "); // 후위순회
		}
	}
	public static void main(String[] args){
		INF_Recursive_05 tree = new INF_Recursive_05(); // 메인클래스 객체 생성
		tree.root = new Node(1); // root에 data 1을 넘김 = data가 넘어오면 주소가 생김
		tree.root.lt = new Node(2);
		tree.root.rt = new Node(3);
		tree.root.lt.lt = new Node(4);
		tree.root.lt.rt = new Node(5);
		tree.root.rt.lt = new Node(6);
		tree.root.rt.rt = new Node(7); // 4 5 6 7의 자식노드(lt,rt 는 null 이다)
		tree.DFS(tree.root);
	}
}

// root가 1인 이진트리로 연습해보자. value와 주소값도 같이 표시하며 그려보자.
//   - 2 - 4
// 1     - 5
//   - 3 - 6
//       - 7
// 전위순회 출력 : 1 2 4 5 3 6 7     root에서 왼쪽으로 파고든다. 
//               전위는 root라면 바로 출력하고 자식으로 내려간다.
// 중위순회 출력 : 4 2 5 1 6 3 7
//               중위는 자식이 있으면 일단 내려가고 내려갈 곳이 없을때 출력한다. 백하면서 출력하고 다시 서치한다.
//               하지만 root의 왼쪽을 다 돌았을때는 root를 출력하고 오른쪽 자식노드로 내려간다.
// 후위순회 출력 : 4 5 2 6 7 3 1
//               후위는 모든 자식이 출력되었을때 부모가 출력된다. (병합정렬)
