package INF.Array;
import java.util.*;
// 인프런 18 뒤집은 소수
class INF_Array_06 {  
	public String solution(int N, String[] arr){
        String answer = "";

        for(int i=0;i<N;i++){
            boolean check = true;
            arr[i] = new StringBuilder(arr[i]).reverse().toString();
            for(int j=2;j<Integer.parseInt(arr[i]);j++){
                if(Integer.parseInt(arr[i])%j == 0){
                    check = false;
                    break;
                } 
            }
            if(check && Integer.parseInt(arr[i]) != 1) answer += Integer.parseInt(arr[i])+" ";
        }
        // System.out.println(Arrays.toString(arr));
        return answer;
	}
	public static void main(String[] args){
		INF_Array_06 T = new INF_Array_06();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	String[] arr = new String[N];
      	for(int i=0;i<N;i++)
        	arr[i] = sc.next(); 

        System.out.print(T.solution(N, arr));
        sc.close();
	}
}

// N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
// 예를 들어 32를 뒤집으면 23이고, 23은 소수이다. 그러면 23을 출력한다. 단 910를 뒤집으면 19로 숫자화 해야 한다.
// 첫 자리부터의 연속된 0은 무시한다.

// 9
// 32 55 62 20 250 370 200 30 100    ->   23 2 73 2 3
