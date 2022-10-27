package INF.Recursive_Tree_Graph;
import java.util.*;
// 인프런 55 이진수 출력(재귀)
public class INF_Recursive_02{
	public void Recursive(int N){
		if(N==0) return;
		else{
            Recursive(N/2);
			System.out.print(N%2);
		}
	}
	public static void main(String[] args){
		INF_Recursive_02 T = new INF_Recursive_02();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        T.Recursive(N);
        sc.close();
	}
}

// 재귀함수를 이용하여 10진수 N이 입력되면 2진수로 변환하여 출력하는 프로그램을 작성하세요.
// 계산 후 재귀함수 호출할지, 재귀함수 호출 후 계산할지 결과가 달라진다.
