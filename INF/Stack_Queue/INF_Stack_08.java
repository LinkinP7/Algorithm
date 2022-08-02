package INF.Stack_Queue;
import java.util.*;
// 인프런 43 응급실
class INF_Stack_08{
	public int solution(int N, int K, int[] arr){
        int answer = 0;
        int key = arr[K];
        int idx = K;
        Queue<Integer> q = new LinkedList<>();
        for(int x : arr) q.offer(x);
        while(!q.isEmpty()){  
            int x = q.poll();
            boolean flag = true;
            for(int y : q){
                if(x < y){
                    q.offer(x);
                    flag = false;
                    break;
                } 
            }
            if(flag){
                answer++;
                if(x == key && idx == 0) break;
            }
            if(idx == 0) idx = q.size()-1;
            else idx--; 
        }
		return answer;
	}
	public static void main(String[] args){
		INF_Stack_08 T = new INF_Stack_08();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();

		System.out.println(T.solution(N,K,arr));  
        sc.close();
	}
}

// #1 같은 숫자인 경우 순서 계산이 되지 않는다.
// class INF_Stack_08{
// 	public int solution(int N, int K, int[] arr){
//         int answer = 0;
//         int key = arr[K];
//         Queue<Integer> q = new LinkedList<>();
//         for(int x : arr) q.offer(x);
//         while(!q.isEmpty()){  
//             int x = q.poll();
//             boolean flag = true;
//             for(int y : q){
//                 if(x < y){
//                     q.offer(x);
//                     flag = false;
//                     break;
//                 } 
//             }
//             if(flag){
//                 answer++;
//                 if(x == key) break;
//             } 
//         }
// 		return answer;
// 	}
// 	public static void main(String[] args){
// 		INF_Stack_08 T = new INF_Stack_08();
// 		Scanner sc = new Scanner(System.in);
// 		int N = sc.nextInt();
//         int K = sc.nextInt();
//         int[] arr = new int[N];
//         for(int i=0;i<N;i++)
//             arr[i] = sc.nextInt();

// 		System.out.println(T.solution(N,K,arr));  
//         sc.close();
// 	}
// }

// 6 0
// 60 60 90 60 60 60    ->   5 가 나와야 하는데 2가 나온다




// 메디컬 병원 응급실에는 의사가 한 명밖에 없습니다.
// 응급실은 환자가 도착한 순서대로 진료를 합니다. 하지만 위험도가 높은 환자는 빨리 응급조치를 의사가 해야 합니다.
// 이런 문제를 보완하기 위해 응급실은 다음과 같은 방법으로 환자의 진료순서를 정합니다.
// • 환자가 접수한 순서대로의 목록에서 제일 앞에 있는 환자목록을 꺼냅니다.
// • 나머지 대기 목록에서 꺼낸 환자 보다 위험도가 높은 환자가 존재하면 대기목록 제일 뒤로 다시 넣습니다. 그렇지 않으면 진료를 받습니다.
// 즉 대기목록에 자기 보다 위험도가 높은 환자가 없을 때 자신이 진료를 받는 구조입니다.
// 현재 N명의 환자가 대기목록에 있습니다.
// N명의 대기목록 순서의 환자 위험도가 주어지면, 대기목록상의 M번째 환자는 몇 번째로 진료를 받는지 출력하는 프로그램을 작성하세요.
// 대기목록상의 M번째는 대기목록의 제일 처음 환자를 0번째로 간주하여 표현한 것입니다.

// 5 2
// 60 50 70 80 90       ->    3

// 100 25
// 70 81 58 71 62 68 92 63 50 53 53 61 77 96 67 60 74 54 91 81 65 65 82 50 95 98 87 93 70 72 90 62 64 99 74 73 67 95 71 82 61 96 57 84 84 91 52 50 88 90 77 54 50 70 52 99 99 83 72 57 78 61 54 59 58 78 79 75 84 78 95 61 61 50 90 76 51 55 64 99 50 72 61 77 72 93 62 87 76 57 62 74 94 71 98 84 63 74 73 68 
// -> 6