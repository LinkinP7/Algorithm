package INF.Sorting_Searching;
import java.util.*;
// 인프런 50 좌표 정렬
class INF_Sorting_07{
	public String solution(int N, HashMap<Integer, Integer> hash){
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
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0 ; i<N;i++)
            hash.put(sc.nextInt(), sc.nextInt());
		System.out.println(T.solution(N, hash));  
        sc.close();
	}
}

// N개의 평면상의 좌표(x, y)가 주어지면 모든 좌표를 오름차순으로 정렬하는 프로그램을 작성하세요.
// 정렬기준은 먼저 x값의 의해서 정렬하고, x값이 같을 경우 y값에 의해 정렬합니다.

// 5
// 2 7
// 1 3
// 1 2
// 2 5
// 3 6
// ->
// 1 2
// 1 3
// 2 5
// 2 7
// 3 6
