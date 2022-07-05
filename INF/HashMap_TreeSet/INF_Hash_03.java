package INF.HashMap_TreeSet;
import java.util.*;
// 인프런 33 매출액의 종류
class INF_Hash_03{
	public String solution(int N, int K, int[] arr){
		String answer = "";
        HashMap<Integer, Integer> hash = new HashMap<>();
        int lt = 0, cnt = 0;
        for(int rt=0;rt<N;rt++){
            if(hash.get(arr[rt]) == null) hash.put(arr[rt], 1);
            else hash.put(arr[rt], hash.get(arr[rt])+1);
            cnt++;
            if(cnt==K){
                answer += hash.size() + " ";
                if(hash.get(arr[lt]) == 1) hash.remove(arr[lt]);
                else hash.put(arr[lt], hash.get(arr[lt])-1);
                lt++;
                cnt--;
            } 
        }
		return answer;
	}
    
	public static void main(String[] args){
		INF_Hash_03 T = new INF_Hash_03();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0; i<arr.length; i++)
            arr[i] = sc.nextInt();
		System.out.println(T.solution(N, K, arr));  
        sc.close();
	}
}

// 타임아웃
// class INF_Hash_03{
// 	public String solution(int N, int K, int[] arr){
// 		String answer = "";
//         HashMap<Integer, Integer> hash = new HashMap<>();

//         for(int i=0;i<N-K+1;i++){
//             for(int j=i;j<i+K;j++){
//                 hash.put(arr[j], 1);
//             }
//             answer += hash.size() + " ";
//             hash.clear();
//         }
    
// 		return answer;
// 	}
    
// 	public static void main(String[] args){
// 		INF_Hash_03 T = new INF_Hash_03();
// 		Scanner sc = new Scanner(System.in);
// 		int N = sc.nextInt();
//         int K = sc.nextInt();
//         int[] arr = new int[N];
//         for(int i=0; i<arr.length; i++)
//             arr[i] = sc.nextInt();
// 		System.out.println(T.solution(N, K, arr));  
//         sc.close();
// 	}
// }