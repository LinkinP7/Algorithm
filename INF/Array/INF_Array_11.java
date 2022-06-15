package INF.Array;
import java.util.*;
// 인프런 23 임시반장 정하기
class INF_Array_11 {    // row = 학생 col = 학년
	public int solution(int N, int[][] arr){
        int answer = 0;

        return answer;
	}
	public static void main(String[] args){
		INF_Array_11 T = new INF_Array_11();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int[][] arr = new int[N+2][N+2];
      	for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                arr[i][j] = sc.nextInt(); 
            }
        }
        System.out.print(T.solution(N, arr));
        sc.close();
	}
}
