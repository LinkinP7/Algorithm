package INF.Array;
import java.util.*;
// 인프런 23 임시반장 정하기
class INF_Array_11 {    // row = 학생 col = 학년
	public int solution(int N, int[][] arr){
        int answer = 0, student = 0;
		int[] head = new int[N];

		while(student < N){
			int check = 0;
			List<Integer> friend = new ArrayList<>();
			for(int i=0; i<5; i++){
				check = arr[student][i];
				// System.out.println("check:"+check);
				for(int j=0; j<N; j++){
					if(j != student && check == arr[j][i]){
						// System.out.println("student"+student+" "+"i:"+i+" j:"+j+" "+check+" "+arr[j][i]);
						if(!friend.contains(j)){
							friend.add(j);
						}
					}
				}
			}
			head[student] = friend.size();
			student++;
		}
		int max = head[0], idx = 0;  
		for(int i=1; i<head.length; i++){
			if(head[i]>max){
				max = head[i];
				idx = i;
			}
		}
		answer = idx+1;
		// System.out.println(Arrays.toString(head));
        return answer;
	}
	public static void main(String[] args){
		INF_Array_11 T = new INF_Array_11();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int[][] arr = new int[N][5];
      	for(int i=0;i<N;i++){
            for(int j=0;j<5;j++){
                arr[i][j] = sc.nextInt(); 
            }
        }
        System.out.print(T.solution(N, arr));
        sc.close();
	}
}
