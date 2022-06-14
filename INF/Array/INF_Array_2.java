package INF.Array;
import java.util.*;
// 인프런 14 보이는 학생
class INF_Array_2 {  
	public int solution(int n, int[] arr){
        int answer = 0;
        ArrayList<Integer> std = new ArrayList<>();
        std.add(arr[0]);

        for(int i=1;i<n;i++)
            if(arr[i] > std.get(std.size()-1)) std.add(arr[i]);
        answer = std.size();
        System.out.println(std);
        return answer;
	}
	public static void main(String[] args){
		INF_Array_2 T = new INF_Array_2();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	int[] arr = new int[n];
      	for(int i=0;i<n;i++)
        	arr[i] = sc.nextInt(); 
        System.out.println(T.solution(n, arr));
        sc.close();
	}
}


// 선생님이 N명의 학생을 일렬로 세웠습니다. 일렬로 서 있는 학생의 키가 앞에서부터 순서대로 주어질 때, 맨 앞에 서 있는
// 선생님이 볼 수 있는 학생의 수를 구하는 프로그램을 작성하세요. (앞에 서 있는 사람들보다 크면 보이고, 작거나 같으면 보이지 않습니다.)

// 8
// 130 135 148 140 145 150 150 153      ->     5

// 풀이 ArrayList 사용 안하는 방법, 훨씬 간단하다

// class INF_Array_2 {  
// 	public int solution(int n, int[] arr){
//         int answer = 1, max=arr[0];
//         for(int i=1; i<n; i++){
//             if(arr[i]>max){
//                 answer++;
//                 max=arr[i];
//             }
//         }
//         return answer;
// 	}
// 	public static void main(String[] args){
//         INF_Array_2 T = new INF_Array_2();
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int[] arr = new int[n];
//         for(int i=0;i<n;i++)
//             arr[i] = sc.nextInt(); 
//         System.out.println(T.solution(n, arr));
//         sc.close();
// 	}
// }