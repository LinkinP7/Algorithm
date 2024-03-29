package INF.Stack_Queue;
import java.util.*;
// 인프런 41 공주 구하기
class INF_Stack_06{
	public int solution(int N, int K){
        int answer = 0;
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<N;i++) q.offer(i+1);
        
        while(q.size() > 1){
            for(int i=0;i<K-1;i++){
                q.offer(q.poll());
            }
            q.poll();
            // System.out.println("poll: " + x);
        }
        answer = q.poll();
		return answer;
	}
	public static void main(String[] args){
		INF_Stack_06 T = new INF_Stack_06();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int K = sc.nextInt();
		System.out.println(T.solution(N, K));  
        sc.close();
	}
}

// 요세푸스 문제 인듯
// 정보 왕국의 이웃 나라 외동딸 공주가 숲속의 괴물에게 잡혀갔습니다.
// 정보 왕국에는 왕자가 N명이 있는데 서로 공주를 구하러 가겠다고 합니다.
// 정보왕국의 왕은 다음과 같은 방법으로 공주를 구하러 갈 왕자를 결정하기로 했습니다.
// 왕은 왕자들을 나이 순으로 1번부터 N번까지 차례로 번호를 매긴다.
// 그리고 1번 왕자부터 N번 왕자까지 순서대로 시계 방향으로 돌아가며 동그랗게 앉게 한다.
// 그리고 1번 왕자부터 시계방향으로 돌아가며 1부터 시작하여 번호를 외치게 한다.
// 한 왕자가 K(특정숫자)를 외치면 그 왕자는 공주를 구하러 가는데서 제외되고 원 밖으로 나오게 된다.
// 그리고 다음 왕자부터 다시 1부터 시작하여 번호를 외친다.
// 이렇게 해서 마지막까지 남은 왕자가 공주를 구하러 갈 수 있다.

// 8 3   ->  7