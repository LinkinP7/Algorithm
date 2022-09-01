package INF.Sorting_Searching;
import java.util.*;
// 인프런 51 이분검색
class INF_Sorting_08{
	public int solution(int N, int K, int[] arr){
		int answer = 0;

        for(int i=0;i<N;i++){
            for(int j=0;j<N-i-1;j++){
                if(arr[j] > arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                }
            }
        }
        // System.out.println(Arrays.toString(arr));

        int start = 0, end = arr.length-1;
        int mid = 0;
        while(start <= end){
            mid = (start+end) / 2;
            // System.out.println("start mid end : " + start + " " + mid + " " + end);
            // System.out.println("arrmid : " + arr[mid]);
            if(arr[mid] == K) return mid+1;
            else if(arr[mid] < K){
                start = mid + 1;
            }else if(arr[mid] > K) {
                end = mid - 1;
            }
        }
        return answer;
    }
	public static void main(String[] args){
		INF_Sorting_08 T = new INF_Sorting_08();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(N, K, arr));  
        sc.close();
	}
}

// 임의의 N개의 숫자가 입력으로 주어집니다. N개의 수를 오름차순으로 정렬한 다음 N개의 수 중 한 개의 수인 M이 주어지면
// 이분검색으로 M이 정렬된 상태에서 몇 번째에 있는지 구하는 프로그램을 작성하세요. 단 중복값은 존재하지 않습니다.

// 8 32
// 23 87 65 12 57 32 99 81    ->    3

