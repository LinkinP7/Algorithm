package INF.Sorting_Searching;
import java.util.*;
// 인프런 46 삽입 정렬
class INF_Sorting_03{
	public String solution(int N, int[] arr){
		StringBuilder sb = new StringBuilder();

        for(int i=1;i<N;i++){
            int tmp = arr[i], j;   // 멈춘곳의 j 위치가 필요하므로 for문 밖에서 선언한다.
            for(j = i-1; j>=0;j--){
                if(arr[j] > tmp) arr[j+1] = arr[j];  // j가 뒤로 밀린다.
                else break;
            } 
            arr[j+1] = tmp; // 멈추고 나온곳에 삽입!
        }

        for(int x : arr)
            sb.append(x).append(" ");

        return sb.toString();
	}
	public static void main(String[] args){
		INF_Sorting_03 T = new INF_Sorting_03();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(N, arr));  
        sc.close();
	}
}

// 삽입정렬도 비슷하다. 이중for문으로 진행, i는 1부터 j는 i-1부터 시작하며 i 값은 tmp에 담긴다. j와 비교해 맞교환 식으로 정렬된다. 한칸 뒤로 밀거나 댕기는 식, j가 마지막이 될때 tmp값이 그 자리로 삽입된다. 
// for(j=i-1; j>=0; j--) 으로 돈다.
// 즉, i값이 tmp에 저장되고 i보다 작은것들과 쭉 비교한 후 해당 자리에 tmp값을 삽입한다. 
// 5 11 3 이고 i가 3일때 
// 5 11 11 -> 5 5 11 -> 첫번째 5 자리에 tmp인 3이 삽입 -> 3 5 11 


// N개이 숫자가 입력되면 오름차순으로 정렬하여 출력하는 프로그램을 작성하세요.
// 정렬하는 방법은 삽입정렬입니다.

// 6
// 13 5 11 7 23 15   ->   5 7 11 13 15 23
