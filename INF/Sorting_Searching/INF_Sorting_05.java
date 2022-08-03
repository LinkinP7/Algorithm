package INF.Sorting_Searching;
import java.util.*;
// 인프런 48 중복 확인
class INF_Sorting_05{
	public String solution(int N, int[] arr){
		String answer = "U";
        for(int i=0;i<N;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[j] == arr[i]) return "D";
            }
        }
        return answer;
	}
	public static void main(String[] args){
		INF_Sorting_05 T = new INF_Sorting_05();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(N, arr));  
        sc.close();
	}
}

// 현수네 반에는 N명의 학생들이 있습니다.
// 선생님은 반 학생들에게 1부터 10,000,000까지의 자연수 중에서 각자가 좋아하는 숫자 하나 적어 내라고 했습니다.
// 만약 N명의 학생들이 적어낸 숫자 중 중복된 숫자가 존재하면 D(duplication)를 출력하고,
// N명이 모두 각자 다른 숫자를 적어냈다면 U(unique)를 출력하는 프로그램을 작성하세요.

// 8
// 20 25 52 30 39 33 43 33  ->  D

// 하나씩 넣는다고 가정할때, 리스트에서 존재유무 확인하고 없으면 추가, 있으면 바로 종료 하면 되지 않을까?