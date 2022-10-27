package INF.Recursive_Tree_Graph;
import java.util.*;
// 인프런 56 팩토리얼
public class INF_Recursive_03{
	public int Recursive(int N){
		if(N==1) return 1;
		else return N*Recursive(N-1);
	}
	public static void main(String[] args){
		INF_Recursive_03 T = new INF_Recursive_03();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		System.out.println(T.Recursive(N));
        sc.close();
	}
}

// 자연수 N이 입력되면 N!를 구하는 프로그램을 작성하세요.

// R(5)
// -> 5*R(4)
// -> 4*R(3)
// -> 3*R(2)
// -> 2*R(1) 
// 이제 R(1)부터 리턴하여  1*2*3*4*5 가 완성 