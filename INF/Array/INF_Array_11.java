package INF.Array;
import java.util.*;
// 인프런 23 임시반장 정하기
// class INF_Array_11 {    // row = 학생 col = 학년
// 	public int solution(int N, int[][] arr){
//         int answer = 0, student = 0;
// 		int[] head = new int[N];

// 		while(student < N){
// 			int check = 0;
// 			List<Integer> friend = new ArrayList<>();
// 			for(int i=0; i<5; i++){
// 				check = arr[student][i];
// 				// System.out.println("check:"+check);
// 				for(int j=0; j<N; j++){
// 					if(j != student && check == arr[j][i]){
// 						// System.out.println("student"+student+" "+"i:"+i+" j:"+j+" "+check+" "+arr[j][i]);
// 						if(!friend.contains(j)){
// 							friend.add(j);
// 						}
// 					}
// 				}
// 			}
// 			head[student] = friend.size();
// 			student++;
// 		}
// 		int max = head[0], idx = 0;  
// 		for(int i=1; i<head.length; i++){
// 			if(head[i]>max){
// 				max = head[i];
// 				idx = i;
// 			}
// 		}
// 		answer = idx+1;
// 		// System.out.println(Arrays.toString(head));
//         return answer;
// 	}
// 	public static void main(String[] args){
// 		INF_Array_11 T = new INF_Array_11();
// 		Scanner sc = new Scanner(System.in);
// 		int N = sc.nextInt();
//       	int[][] arr = new int[N][5];
//       	for(int i=0;i<N;i++){
//             for(int j=0;j<5;j++){
//                 arr[i][j] = sc.nextInt(); 
//             }
//         }
//         System.out.print(T.solution(N, arr));
//         sc.close();
// 	}
// }

// 학생 중에서 1학년부터 5학년까지 지내오면서 한번이라도 같은 반이었던 사람이 가장 많은 학생을 임시 반장으로 정하려 한다.
// 5
// 2 3 1 7 3
// 4 1 9 6 8
// 5 5 2 4 4
// 6 5 2 6 7
// 8 4 2 2 2    ->    4


class INF_Array_11 {    // 훨씬 깔끔하다...
	public int solution(int N, int[][] arr){
        int answer = 0, max = Integer.MIN_VALUE;

		for(int i=1;i<=N; i++){	 // 학생수만큼 돌기 
			int cnt = 0;
			for(int j=1; j<=N; j++){   // i 학생과 같은반을 했던 j 학생은 몇명있는지
				for(int k=1;k<=5;k++){   // 같은반 확인용
					if(arr[i][k]==arr[j][k]){
						cnt++;  
						break; // 학년이 달라도 같은반일경우도 결국은 사람 한명이기에
					}
				}
				if(cnt>max){
					max=cnt;
					answer=i;  
				}
			}
		}
        return answer;
	}
	public static void main(String[] args){
		INF_Array_11 T = new INF_Array_11();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
      	int[][] arr = new int[N+1][6];
      	for(int i=1;i<=N;i++){
            for(int j=1;j<=5;j++){
                arr[i][j] = sc.nextInt(); 
            }
        }
        System.out.print(T.solution(N, arr));
        sc.close();
	}
}