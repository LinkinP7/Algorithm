package INF.TwoPoint_SlidingWindow;
import java.util.*;
// 인프런 27 최대 매출
class INF_TwoPoint_03{
	public int solution(int N, int K, int[] arr){
        int answer = 0, sum =0; 
        for(int i=0;i<K;i++)
            sum += arr[i];
        answer = sum;
        for(int i=K;i<N;i++){
            sum += (arr[i] - arr[i-K]);
            answer = Math.max(answer, sum);
        }
        return answer;
	}
	public static void main(String[] args){
		INF_TwoPoint_03 T = new INF_TwoPoint_03();
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();

        System.out.print(T.solution(N,K,arr));

        sc.close();
	}
}

// 현수의 아빠는 제과점을 운영합니다. 현수 아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.
// 만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면
// 12 1511 20 2510 20 19 13 15
// 연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
// 여러분이 현수를 도와주세요.

// 10 3
// 12 15 11 20 25 10 20 19 13 15   ->    56


