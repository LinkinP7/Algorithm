package INF.TwoPoint_SlidingWindow;
import java.util.*;
// 인프런 26 공통원소구하기
class INF_TwoPoint_02{
	public ArrayList<Integer> solution(int N, int M, int[] arr1, int[] arr2){
        ArrayList<Integer> answer = new ArrayList<>(); 
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        System.out.println(Arrays.toString(arr1));
        System.out.println(Arrays.toString(arr2));
        int p1 = 0, p2 =0;
        while(p1 < N && p2 < M){
            if(arr1[p1] ==  arr2[p2]){
                answer.add(arr1[p1]);
                p1++; p2++;
            }else if(arr1[p1] <=  arr2[p2]){
                p1++;
            }else if(arr1[p1] >=  arr2[p2]){
                p2++;
            }
        }
        // System.out.println(answer);
        return answer;
	}
	public static void main(String[] args){
		INF_TwoPoint_02 T = new INF_TwoPoint_02();
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for(int i=0;i<N;i++)
            arr1[i] = sc.nextInt();
        
        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for(int i=0;i<M;i++)
            arr2[i] = sc.nextInt();

        for(int x : T.solution(N, M, arr1, arr2))
            System.out.print(x + " ");

        sc.close();
	}
}

// A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.
// 5
// 1 3 9 5 2
// 5
// 3 2 5 7 8  ->   2 3 5



