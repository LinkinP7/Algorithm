package INF.HashMap_TreeSet;
import java.util.*;
// 인프런 33 매출액의 종류
class INF_Hash_03{
	public ArrayList<Integer> solution(int N, int K, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();
        for(int i=0; i<K-1;i++)
            hash.put(arr[i],hash.getOrDefault(arr[i], 0)+1);
        int lt = 0;
        
        for(int rt=K-1;rt<N;rt++){
            hash.put(arr[rt], hash.getOrDefault(arr[rt], 0)+1);
            // answer += hash.size() + " ";  String에 N번 더하면 o(N*N)이다..
            answer.add(hash.size());
            hash.put(arr[lt], hash.get(arr[lt])-1);
            if(hash.get(arr[lt]) == 0) hash.remove(arr[lt]);
            lt++;
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
        for(int x : T.solution(N, K, arr))
            System.out.print(x + " ");
        sc.close();
	}
}

// 현수의 아빠는 제과점을 운영합니다. 현수아빠는 현수에게 N일 동안의 매출기록을 주고 연속된 K일 동안의 매출액의 종류를
// 각 구간별로 구하라고 했습니다.
// 만약 N=7이고 7일 간의 매출기록이 아래와 같고, 이때 K=4이면
// 20 12 20 10 23 17 10
// 각 연속 4일간의 구간의 매출종류는

// 첫 번째 구간은 [20, 12, 20, 10]는 매출액의 종류가 20, 12, 10으로 3이다.
// 두 번째 구간은 [12, 20, 10, 23]는 매출액의 종류가 4이다.
// 세 번째 구간은 [20, 10, 23, 17]는 매출액의 종류가 4이다.
// 네 번째 구간은 [10, 23, 17, 10]는 매출액의 종류가 3이다.
// N일간의 매출기록과 연속구간의 길이 K가 주어지면 첫 번째 구간부터 각 구간별
// 매출액의 종류를 출력하는 프로그램을 작성하세요.

// 7 4
// 20 12 20 10 23 17 10      ->  3 4 4 3

// 타임아웃 2....
// class INF_Hash_03{
// 	public String solution(int N, int K, int[] arr){
// 		String answer = "";
//         HashMap<Integer, Integer> hash = new HashMap<>();
//         int lt = 0, cnt = 0;
//         for(int rt=0;rt<N;rt++){
//             if(hash.get(arr[rt]) == null) hash.put(arr[rt], 1);
//             else hash.put(arr[rt], hash.get(arr[rt])+1);
//             cnt++;
//             if(cnt==K){
//                 answer += hash.size() + " ";
//                 if(hash.get(arr[lt]) == 1) hash.remove(arr[lt]);
//                 else hash.put(arr[lt], hash.get(arr[lt])-1);
//                 lt++;
//                 cnt--;
//             } 
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


// 풀이 방식은 맞았었다...ㅠㅠㅠ 

// 답을 result라는 스트링에 처리하면 속도가 떨어집니다.
// https://jaehun2841.github.io/2019/03/01/effective-java-item63/#%EC%84%9C%EB%A1%A0
// ArrayList<Integer> result = new ArrayList<>(); 선언하시고
// ArrayList에 add한 후 출력하시면 통과될겁니다.
// -> 문자열 연결 연산자로 문자열 n개를 연결하는 시간은 n^2에 비례한다........  와우!