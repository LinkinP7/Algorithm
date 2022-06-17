package INF.Array;
import java.util.*;
// 인프런 24 멘토링
class INF_Array_12 {  
	public int solution(int N, int M, int[][] arr){
        int answer = 0;

        // 기준은 첫번째 행
        for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                
            }
        }
        return answer;
	}
	public static void main(String[] args){
		INF_Array_12 T = new INF_Array_12();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int M = sc.nextInt();
      	int[][] arr = new int[M][N];
      	for(int i=0;i<M;i++){
            for(int j=0;j<N;j++){
                arr[i][j] = sc.nextInt(); 
            }
        }
        System.out.print(T.solution(N, M, arr));
        sc.close();
	}
}

// 시험 입력이 3 4 1 2 이렇게 오는데 1등부터 순서대로 학생의 번호가 들어오는 것이다
// 3 1 4 2 -> 1등은 3번, 2등은 1번, 3등은 4번, 4등은 2번 학생이 된다.

// 4 3
// 3 4 1 2
// 4 3 2 1
// 3 1 4 2     ->    3
