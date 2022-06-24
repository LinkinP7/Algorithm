package INF.TwoPoint_SlidingWindow;
import java.util.*;
// 인프런 25 두 배열 합치기
class INF_TwoPoint_01{
	public int[] solution(int[] arr1, int[] arr2){
        int[] answer = new int[arr1.length+arr2.length];
        int point1 = 0, point2 = 0;    // two point 를 사용하면 nlogn이 n 이 된다.
        int idx = 0;
        System.out.println((arr1.length-1) + " " + (arr2.length-1));
        while(idx < answer.length){
            // System.out.println("idx = "+idx+" p1: "+point1+" p2: "+point2);
            if(point1 > arr1.length-1){
                answer[idx] = arr2[point2++]; 
                // point2++; 굳이 해줄필요 없었다...
                idx++;
                continue;
            }else if(point2 > arr2.length-1){
                answer[idx] = arr1[point1++];
                // point1++;
                idx++;
                continue;
            }
            
            if(arr1[point1] <= arr2[point2]){
                answer[idx] = arr1[point1++];
                // point1++;
            }else{
                answer[idx] = arr2[point2++];
                // point2++;
            }
            
            idx++;
        }
        return answer;
	}
	public static void main(String[] args){
		INF_TwoPoint_01 T = new INF_TwoPoint_01();
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr1 = new int[N];
        for(int i=0;i<N;i++)
            arr1[i] = sc.nextInt();

        int M = sc.nextInt();
        int[] arr2 = new int[M];
        for(int i=0;i<M;i++)
            arr2[i] = sc.nextInt();

        for(int x : T.solution(arr1, arr2))
            System.out.print(x + " ");

        sc.close();
	}
}

// 오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.

// 3
// 1 3 5
// 5
// 2 3 6 7 9    ->   1 2 3 3 5 6 7 9

// 풀이
// class Main {	
// 	public ArrayList<Integer> solution(int n, int m, int[] a, int[] b){
// 		ArrayList<Integer> answer = new ArrayList<>();
// 		int p1=0, p2=0;
// 		while(p1<n && p2<m){   // 반복문을 이렇게 나눠주면 idx도 불필요하다. 좋은 것 같다.
// 			if(a[p1]<b[p2]) answer.add(a[p1++]);
// 			else answer.add(b[p2++]);
// 		}
// 		while(p1<n) answer.add(a[p1++]);
// 		while(p2<m) answer.add(b[p2++]);
// 		return answer;
// 	}

// 	public static void main(String[] args){
// 		Main T = new Main();
// 		Scanner kb = new Scanner(System.in);
// 		int n=kb.nextInt();
// 		int[] a=new int[n];
// 		for(int i=0; i<n; i++){
// 			a[i]=kb.nextInt();
// 		}
// 		int m=kb.nextInt();
// 		int[] b=new int[m];
// 		for(int i=0; i<m; i++){
// 			b[i]=kb.nextInt();
// 		}
// 		for(int x : T.solution(n, m, a, b)) System.out.print(x+" ");
// 	}
// }