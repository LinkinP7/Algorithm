package INF.Sorting_Searching;
import java.util.*;
// 인프런 47 Least Recently Used
class INF_Sorting_04{
	public String solution(int N, int K, int[] arr){
		StringBuilder sb = new StringBuilder();
        int[] memory = new int[N];
        for(int x : arr){
            boolean newFlag = true;
            for(int i=0;i<N;i++){
                if(memory[i] == x){  // 여기서 부터 삽입
                    int j;
                    for(j=i-1;j>=0;j--)
                        memory[j+1] = memory[j]; 
                    memory[j+1] = x;
                    newFlag = false;
                }
            }
            if(newFlag){
                for(int i=N-1;i>=1;i--)
                memory[i] = memory[i-1]; 
                memory[0] = x;
            }
            System.out.println(Arrays.toString(memory));
        }

        for(int x : memory)
            sb.append(x).append(" ");

        return sb.toString();
	}
	public static void main(String[] args){
		INF_Sorting_04 T = new INF_Sorting_04();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[K];
        for(int i=0;i<K;i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(N, K, arr));  
        sc.close();
	}
}

// 삽입으로 풀면 될 듯?

// 캐시메모리는 CPU와 주기억장치(DRAM) 사이의 고속의 임시 메모리로서 CPU가 처리할 작업을 저장해 놓았다가
// 필요할 바로 사용해서 처리속도를 높이는 장치이다. 워낙 비싸고 용량이 작아 효율적으로 사용해야 한다.
// 철수의 컴퓨터는 캐시메모리 사용 규칙이 LRU 알고리즘을 따른다.
// LRU 알고리즘은 Least Recently Used 의 약자로 직역하자면 가장 최근에 사용되지 않은 것 정도의 의미를 가지고 있습니다.
// 캐시에서 작업을 제거할 때 가장 오랫동안 사용하지 않은 것을 제거하겠다는 알고리즘입니다.
// 캐시의 크기가 주어지고, 캐시가 비어있는 상태에서 N개의 작업을 CPU가 차례로 처리한다면 N개의 작업을 처리한 후
// 캐시메모리의 상태를 가장 최근 사용된 작업부터 차례대로 출력하는 프로그램을 작성하세요.

// 메모리는 5칸 작업은 9개, 메모리는 가장 최근에 한 작업을 기억, 메모리 풀스택 시 새로은 프로세스라면 맨 뒤에있는 작업이 삭제되고 최근 것이 맨 앞으로 들어감.
// 5 / 2 3 1 6 7  -> 5 2 3 1 6  (7 삭제)
// 3 / 5 2 3 1 6  -> 3 5 2 1 6  (스위칭)

// 5 9
// 1 2 3 2 6 2 3 5 7       ->       7 5 3 2 6
