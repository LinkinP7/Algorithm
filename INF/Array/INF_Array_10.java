package INF.Array;
import java.util.*;
// 인프런 22 봉우리
class INF_Array_10 {  
	public int solution(int N, int[][] arr){
        int answer = 0, pivot = 0;

        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                pivot = arr[i][j];
                if(pivot > arr[i-1][j] && pivot > arr[i+1][j] && pivot > arr[i][j+1] && pivot >  arr[i][j-1])
                    answer++;
            }
        }
        // System.out.println(Arrays.deepToString(arr));   2차원 배열 생으로 출력하기
        return answer;
	}
	public static void main(String[] args){
		INF_Array_10 T = new INF_Array_10();
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


// 지도 정보가 N*N 격자판에 주어집니다. 각 격자에는 그 지역의 높이가 쓰여있습니다.
// 각 격자판의 숫자 중 자신의 상하좌우 숫자보다 큰 숫자는 봉우리 지역입니다. 봉우리 지역이 몇 개 있는 지 알아내는 프로그램을 작성하세요.
// 격자의 가장자리는 0으로 초기화 되었다고 가정한다.
