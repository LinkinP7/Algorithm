package INF.TwoPoint_SlidingWindow;
import java.util.*;
// 인프런 26 연속 부분수열
class INF_TwoPoint_04{
    public int solution(int N, int K, int[] arr){
        int answer = 0, sum =0;
        int cursor = 0, idx = 0;
        System.out.println(Arrays.toString(arr));
        while(idx < N){
            if(sum < K){
                sum += arr[idx];
                idx++;
            }else if(sum == K){
                sum -= arr[cursor];
                cursor++;
                answer++;
            }else{
                sum -= arr[cursor];
                cursor++;
            }
        }
        if(sum == K) answer++;

        return answer;
	}
	public static void main(String[] args){
		INF_TwoPoint_04 T = new INF_TwoPoint_04();
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();
        System.out.println(T.solution(N, K, arr));    
        sc.close();
	}
}