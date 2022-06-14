package INF.Array;
import java.util.*;
// 인프런13 큰 수 출력하기
// class INF_Array_1 {  // String 으로 끝내기
// 	public String solution(int n, int[] arr){
//         String answer = arr[0] + " ";
//         for(int i=1;i<n;i++)
//             if(arr[i-1] < arr[i]) answer += arr[i] + " ";
//         return answer;
// 	}
// 	public static void main(String[] args){
// 		INF_Array_1 T = new INF_Array_1();
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
//       	int[] arr = new int[n];
//       	for(int i=0;i<n;i++)
//         	arr[i] = sc.nextInt(); 
//         System.err.println(T.solution(n, arr));    
//         sc.close();
// 	}
// }

// N개의 정수를 입력받아, 자신의 바로 앞 수보다 큰 수만 출력하는 프로그램을 작성하세요.
// (첫 번째 수는 무조건 출력한다)

// 6
// 7 3 9 5 6 12      ->    7 9 6 12


// 풀이 - ArrayList 사용하기
class INF_Array_1 {  
	public ArrayList<Integer> solution(int n, int[] arr){
        ArrayList<Integer> answer = new ArrayList<>();
        answer.add(arr[0]);
        for(int i=1;i<n;i++)
            if(arr[i] > arr[i-1]) answer.add(arr[i]);
        return answer;
	}
	public static void main(String[] args){
		INF_Array_1 T = new INF_Array_1();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int[] arr = new int[n];
      	for(int i=0;i<n;i++)
        	arr[i] = sc.nextInt(); 
        for(int x : T.solution(n, arr)){
            System.out.print(x+" ");
        }    
        sc.close();
	}
}