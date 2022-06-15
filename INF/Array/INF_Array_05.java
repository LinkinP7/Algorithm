package INF.Array;
import java.util.*;
// 인프런 17 에라토스테네스 체
// public class INF_Array_5 {    // 1000MS 안에 해결되지 않음... Time out   이중 for문을 사용하기에 시간이 오래 걸린다
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int count = 0;
//         // List<Integer> prime = new ArrayList<>();
//         for(int i=2;i<N;i++){
//             if(isPrime(i))
//                 count++;
//         }
//         // System.out.println(prime);
//         System.out.println(count);
//     }
//     static boolean isPrime(int n){
//         boolean isP = true;
//         for(int i=2;i<n;i++)
//             if(n%i == 0) {
//                 isP = false;
//                 return isP;
//             }
//         return isP;
//     }
// }

class INF_Array_05 {  
    // 에라토스테네스가 소수 구하기에서는 가장 빠르다, n+1만큼 배열을 만들어 주고 0인 소수면 소수의 배수들을 다 쳐낸다 (2가 소수라면 2를 카운팅하고 2의 배수들을 다 쳐낸다)
	public int solution(int n){
        int answer = 0;
        int[] arr = new int[n+1];
        for(int i=2;i<=n;i++){
            if(arr[i]==0){
                answer++;
                for(int j=i;j<=n;j=j+i) arr[j]=1;
            }
        }
        return answer;
	}
	public static void main(String[] args){
		INF_Array_05 T = new INF_Array_05();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
        System.out.println(T.solution(n));    
        sc.close();
	}
}