package INF.Array;
import java.util.*;
// 인프런 24 멘토링
class INF_Array_12 {  
	public int solution(int N, int M, int[][] arr){
        int answer = 0;
        System.out.println(Arrays.deepToString(arr)); 
        // 기준은 첫번째 행
        for(int i=0;i<N;i++){   // i는 테스트 i
            for(int j=i+1;j<N;j++){  // 학생비교
                // arr[0][i], arr[0][j] 고정
                // arr[k][i] arr[k][j] 를 비교
                int mentor = arr[0][i];
                int mentee = arr[0][j];
                System.out.println("I:"+i+" J:"+j);
                System.out.println("멘토: "+mentor+" 멘티: "+mentee);
                boolean checkFlag = true;

                int idxTor = N-1, idxTee = N-1;
                for(int k=1;k<M;k++){   // 다른 행에서도 [k][i]가 [k][j]보다 빠른가? 를 파악하면 될듯, k돌만큼 다 i가 먼저있다면 answer++;
                   for(int m=0;m<N;m++){
                        if(arr[k][m] == mentor) idxTor = m;
                        if(arr[k][m] == mentee) idxTee = m;
                   }
                   if(idxTor > idxTee){
                        checkFlag = false;
                        break; 
                   } 
                }
                if(checkFlag) answer++;
            }
        }
        return answer;
	}
	public static void main(String[] args){
		INF_Array_12 T = new INF_Array_12();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();  //학생
        int M = sc.nextInt();  //테스트
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
