package INF.Sorting_Searching;
import java.util.*;
// 인프런 45 버블 정렬
class INF_Sorting_02{
	public String solution(int N, int[] arr){
		StringBuilder sb = new StringBuilder();

        for(int i=0;i<N-1;i++){ // N번이던 N-1 번이던 똑같다 비교 후 스위치니까
            for(int j = 0; j<N-i-1;j++){
                if(arr[j] > arr[j+1]){   // 가장 작거나 큰 값을 맨 뒤로 보내버린다. 뒤부터 채우는 정렬
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }

        for(int x : arr)
            sb.append(x).append(" ");

        return sb.toString();
	}
	public static void main(String[] args){
		INF_Sorting_02 T = new INF_Sorting_02();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(N, arr));  
        sc.close();
	}
}

// 이웃한 두 수를 비교해서 (오름차순 기준으로) 앞의 숫자가 뒤의 숫자보다 크다면 스위칭 , 쭉 비교하다 가장 크거나 작은 숫자가 맨 뒤 인덱스로 스위칭 된다.
// 다시 반복을 진행하는데 처음부터 비교하되 비교횟수는 하나 감소된다. 즉, 거품처럼 두개씩 비교하며 뒤부터 채워주는 방식
// for(int j = 0; j<N-i-1;j++) 으로 돈다.

// N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
// 정렬하는 방법은 버블정렬입니다.

// 6
// 13 5 11 7 23 15   ->   5 7 11 13 15 23
