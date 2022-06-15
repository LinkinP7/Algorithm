package INF.Array;
import java.util.*;
// 인프런 20 등수구하기
class INF_Array_08 {  
	public String solution(int N, int[] arr){
        String answer = "";
		int idx = 0;
		List<Integer> rank = new ArrayList<>();
		for(int i=0;i<N;i++){
			rank.add(arr[i]);
		}
		rank.sort(Collections.reverseOrder());
		while(idx < N){
			for(int i=0;i<rank.size();i++){
				if(arr[idx] == rank.get(i))	{
					answer += i+1 + " ";
					break;
				}
			}
			idx++;		
		}
		// System.out.println(rank);
		// System.out.println(Arrays.toString(arr));
        return answer;
	}
	public static void main(String[] args){
		INF_Array_08 T = new INF_Array_08();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int[] arr = new int[N];
      	for(int i=0;i<N;i++)
        	arr[i] = sc.nextInt(); 
        System.out.print(T.solution(N, arr));
        sc.close();
	}
}

// N명의 학생의 국어점수가 입력되면 각 학생의 등수를 입력된 순서대로 출력하는 프로그램을 작성하세요.
// 같은 점수가 입력될 경우 높은 등수로 동일 처리한다.
// 즉 가장 높은 점수가 92점인데 92점이 3명 존재하면 1등이 3명이고 그 다음 학생은 4등이 된다.