package INF.Array;
import java.util.*;
// 인프런 21 격자판 최대합
class INF_Array_09 {  
	public int solution(int N, int[][] arr){
        int answer = 0;
        // 가로 세로 대각선 합 필요
        List<Integer> sum = new ArrayList<>();

        int dia=0, rev=0;
        for(int i=0;i<N;i++){
            int row = 0, col=0; 
            for(int j=0;j<N;j++){
                row += arr[i][j];
                col += arr[j][i];
            }
            dia += arr[i][i];       // 대각선은 고정이므로 
			rev += arr[i][N-1-i];

            sum.add(col);
            sum.add(row);
            col = 0; row = 0;
        }
        sum.add(dia);
        sum.add(rev);

        Collections.sort(sum);
        answer = sum.get(sum.size()-1);
        return answer;
	}
	public static void main(String[] args){
		INF_Array_09 T = new INF_Array_09();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int[][] arr = new int[N][N];
      	for(int i=0;i<N;i++){
            for(int j=0;j<N;j++)
        	    arr[i][j] = sc.nextInt(); 
        }
        System.out.print(T.solution(N, arr));
        sc.close();
	}
}


// N*N의 격자판이 주어지면 각 행의 합, 각 열의 합, 두 대각선의 합 중 가 장 큰 합을 출력합니다.
// 5
// 10 13 10 12 15
// 12 39 30 23 11
// 11 25 50 53 15
// 19 27 29 37 27
// 19 13 30 13 19
// testR[60, 115, 154, 139, 94]
// testC[71, 117, 149, 138, 87]
// testD[155, 134]