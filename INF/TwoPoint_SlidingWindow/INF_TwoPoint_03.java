package INF.TwoPoint_SlidingWindow;
import java.util.*;
// 인프런 25 두 배열 합치기
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