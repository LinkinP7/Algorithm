package INF.TwoPoint_SlidingWindow;
import java.util.*;
// 인프런 27 연속된 자연수의 합
class INF_TwoPoint_05{
    public int solution(int N){
        int answer = 0, sum =0;
        int cursor = 0, idx = 0;
        int[] numbers = new int[1000];
        for(int i=0;i<N;i++)
            numbers[i] = i+1;

        while(idx < N){
            if(sum < N){
                sum += numbers[idx];
                idx++;
            }else if(sum == N){
                sum -= numbers[cursor];
                cursor++;
                answer++;
            }else{
                sum -= numbers[cursor];
                cursor++;
            }
        }
        if(sum == N) answer++;

        return answer;
	}
	public static void main(String[] args){
		INF_TwoPoint_05 T = new INF_TwoPoint_05();
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(T.solution(N));    
        sc.close();
	}
}