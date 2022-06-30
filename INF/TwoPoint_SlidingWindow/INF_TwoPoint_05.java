package INF.TwoPoint_SlidingWindow;
import java.util.*;
// 인프런 29 연속된 자연수의 합
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

// N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로 정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.
// 만약 N=15이면
// 7+8=15
// 4+5+6=15
// 1+2+3+4+5=15
// 와 같이 총 3가지의 경우가 존재한다

// 15   ->  3