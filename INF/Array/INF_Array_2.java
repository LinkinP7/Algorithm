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