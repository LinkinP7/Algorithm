package INF.Sorting_Searching;
import java.util.*;
// 인프런 50 좌표 정렬
class INF_Sorting_07{
	public String solution(int N, int[] arr){
		StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
            int idx= i;
            for(int j = i+1; j<N;j++){
                if(arr[j] < arr[idx]) idx = j;
            }
            if(idx != i){
                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
            } 
        }

        for(int x : arr)
            sb.append(x).append(" ");

        return sb.toString();
	}
	public static void main(String[] args){
		INF_Sorting_07 T = new INF_Sorting_07();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(N, arr));  
        sc.close();
	}
}

// 선택정렬은 2중포문, i에서 j 부터 시작해 가장 작은 숫자를 구해 스위칭한다.(작은 숫자면 오름차순, 큰 숫자면 내림차순)

// N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
// 정렬하는 방법은 선택정렬입니다.

// 6
// 13 5 11 7 23 15   ->   5 7 11 13 15 23
