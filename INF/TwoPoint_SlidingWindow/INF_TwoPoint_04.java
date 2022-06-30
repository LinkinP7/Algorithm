package INF.TwoPoint_SlidingWindow;
import java.util.*;
// 인프런 28 연속 부분수열
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


// N개의 수로 이루어진 수열이 주어집니다.
// 이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
// 만약 N=8, M=6이고 수열이 다음과 같다면
// 1 2 1 3 1 1 1 2
// 합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.

// 8 6
// 1 2 1 3 1 1 1 2   ->   3
