package INF.Recursive_Tree_Graph;
import java.util.*;
// 인프런 54 재귀함수(스택프레임)
public class INF_Recursive_01{
	public String solution(int N, int[] arr){
		StringBuilder sb = new StringBuilder();

        for(int i=0;i<N;i++){
            int idx= i;
            for(int j = i+1; j<N;j++){
                if(arr[j] < arr[idx]) idx = j;
            }
            if(idx != i){
                int tmp = arr[i];
                arr[i] = arr[idx];
                arr[idx] = tmp;
            } 
        }

        for(int x : arr)
            sb.append(x).append(" ");

        return sb.toString();
	}
	public static void main(String[] args){
		INF_Recursive_01 T = new INF_Recursive_01();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(N, arr));  
        sc.close();
	}
}