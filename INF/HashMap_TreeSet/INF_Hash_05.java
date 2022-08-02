package INF.HashMap_TreeSet;
import java.util.*;
// 인프런 35 K번째 큰 수
class INF_Hash_05{
	public int solution(int N, int K, int[] arr){
        int answer = -1 ;
        TreeSet<Integer> Tset = new TreeSet<>(Collections.reverseOrder());  // 중복제거를 위해 사용, 정렬에 필요한 트리를 만드려면 TreeMap -> 이건 이진트리

        // nCk 
        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                for(int x=j+1;x<N;x++){
                    Tset.add(arr[i]+arr[j]+arr[x]);
                }
            }
        }
        // System.out.println(Tset.size());
        int cnt = 0;
        for(int x : Tset){
            cnt++;
            if(cnt==K) return x;
        }
		return answer;
	}
	public static void main(String[] args){
		INF_Hash_05 T = new INF_Hash_05();
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();
        System.out.println(T.solution(N, K, arr));  
        sc.close();
	}
}


// 현수는 1부터 100사이의 자연수가 적힌 N장의 카드를 가지고 있습니다. 같은 숫자의 카드가 여러장 있을 수 있습니다.
// 현수는 이 중 3장을 뽑아 각 카드에 적힌 수를 합한 값을 기록하려고 합니다. 3장을 뽑을 수 있는 모든 경우를 기록합니다.
// 기록한 값 중 K번째로 큰 수를 출력하는 프로그램을 작성하세요.
// 만약 큰 수부터 만들어진 수가 25 25 23 23 22 20 19......이고 K값이 3이라면 K번째 큰 값은 22입니다

// 10 3
// 13 15 34 23 45 65 33 11 26 42     ->   143

// TreeSet -> add, remove, size, first(첫번째값), last
               