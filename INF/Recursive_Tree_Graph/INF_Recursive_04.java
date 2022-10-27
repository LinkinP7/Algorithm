package INF.Recursive_Tree_Graph;
import java.util.*;
// 인프런 57 피보나치 재귀(메모이제이션)
public class INF_Recursive_04{
	static int[] fibo;
	public int Recursive(int N){
		if(fibo[N] > 0) return fibo[N];  // 메모이제이션
		if(N==1) return fibo[N] = 1;
		else if(N==2) return fibo[N] = 1;
		else return fibo[N] = Recursive(N-2) + Recursive(N-1);
	}
	public static void main(String[] args){
		INF_Recursive_04 T = new INF_Recursive_04();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		long Start = System.currentTimeMillis();
		fibo = new int[N+1];
		T.Recursive(N);
		for(int i=1;i<=N;i++)
			System.out.print(fibo[i]+" ");
		long End = System.currentTimeMillis();
		System.out.println("실행시간: " + (End-Start)/1000.0+"초");
		sc.close();
	}
}
// 메모이제이션 활용 - 한번이라도 리턴받은 값은 배열에 넣고 함수 호출 시 자료구조에 값이 있는지 확인하여 바로 그것을 활용하는 방법
// 한번 훑음과 동시에 다신 재귀를 타지 않아도 된다.
// input 45일 때, 실행시간: 0.002초   

// public class INF_Recursive_04{
// 	static int[] fibo;
// 	public int Recursive(int N){
// 		if(N==1) return fibo[N] = 1;
// 		else if(N==2) return fibo[N] = 1;
// 		else return fibo[N] = Recursive(N-2) + Recursive(N-1);
// 	}
// 	public static void main(String[] args){
// 		INF_Recursive_04 T = new INF_Recursive_04();
// 		Scanner sc = new Scanner(System.in);
// 		int N = sc.nextInt();
// 		long Start = System.currentTimeMillis();
// 		fibo = new int[N+1];
// 		T.Recursive(N);
// 		for(int i=1;i<=N;i++)
// 			System.out.print(fibo[i]+" ");
// 		long End = System.currentTimeMillis();
// 		System.out.println("실행시간: " + (End-Start)/1000.0+"초");
// 		sc.close();
// 	}
// }
// 이렇게 중간값을 저장할 자료구조를 이용하면 재귀를 한번만 태울수 있다.
// input 45일 때, 실행시간: 4.16초


// public class INF_Recursive_04{
// 	public int Recursive(int N){
// 		if(N==1) return 1;
// 		else if(N==2) return 1;
// 		else return Recursive(N-2) + Recursive(N-1);
// 	}
// 	public static void main(String[] args){
// 		INF_Recursive_04 T = new INF_Recursive_04();
// 		Scanner sc = new Scanner(System.in);
// 		int N = sc.nextInt();
// 		long Start = System.currentTimeMillis();
// 		for(int i=1;i<=N;i++) System.out.print(T.Recursive(i)+" "); // 이렇게하면 매번 호출하므로 비효율적이다
// 		long End = System.currentTimeMillis();
// 		System.out.println("실행시간: " + (End-Start)/1000.0+"초");
// 		sc.close();
// 	}
// }

// input 45일 때, 실행시간: 9.031초
// 재귀를 사용한 피보나치 수열 출력 프로그램 
// input : 10
// return: 1 1 2 3 5 8 13 21 34 55