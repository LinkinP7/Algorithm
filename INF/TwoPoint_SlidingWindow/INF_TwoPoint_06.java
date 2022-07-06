package INF.TwoPoint_SlidingWindow;
import java.util.*;
// 인프런 30 최대 길이 연속부분수열
class INF_TwoPoint_06{
    public int solution(int N, int K, int[] arr){
        int answer = 0, cnt = 0, lt = 0;
        for(int rt=0;rt<N;rt++){
            if(arr[rt]==0) cnt++;
            while(cnt>K){
                if(arr[lt]==0) cnt--;   // lt가 쫒아가기
                lt++;
            }
            answer = Math.max(answer, rt-lt+1);
        }

        return answer;

	}
	public static void main(String[] args){
		INF_TwoPoint_06 T = new INF_TwoPoint_06();
		Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        int[] arr = new int[N];    
        for(int i=0;i<N;i++)
            arr[i] = sc.nextInt();
        System.out.println(T.solution(N,K,arr));    
        sc.close();
	}
}

// 0과 1로 구성된 길이가 N인 수열이 주어집니다. 
// 여러분은 이 수열에서 최대 k번을 0을 1로 변경할 수 있습니다. 여러분이 최대 k번의 변경을 통해 이 수열에서 1로만 구성된 최대 길이의 연속부분수열을 찾는 프로그램을 작성하세요
// 14 2
// 1 1 0 0 1 1 0 1 1 0 1 1 0 1   ->    8


// Time Out....
// class INF_TwoPoint_06{
//     public int solution(int N, int K, int[] arr){
//         int answer = Integer.MIN_VALUE;
//         int cursor = 0, idx = 0, count = 0;
//         int nextCursor = 0, tmp = 0;
//         boolean oneFlag = true;
//         while(idx < N){
//             if(arr[idx] == 0){
//                 count++;
//                 oneFlag = false;
//             }else{
//                 if(!oneFlag && nextCursor == 0)
//                     nextCursor = idx;
//                 oneFlag = true;
//             } 
            
//             if(count > K){
//                 tmp = idx - cursor;
//                 System.out.println("idx: "+idx+" cursor: "+cursor+" nextC: "+ nextCursor+" tmp: "+ tmp);
//                 answer = Math.max(tmp, answer);
//                 idx = nextCursor-1; cursor = nextCursor;
//                 nextCursor = 0;
//                 count = 0;
//                 oneFlag = true;
//             }

//             if(idx == N-1){
//                 tmp = idx - cursor+1;
//                 answer = Math.max(tmp, answer);
//                 System.out.println("idx: "+idx+" cursor: "+cursor+" nextC: "+ nextCursor+" tmp: "+ tmp);
//             } 
//             idx++;
//         }
//         return answer;
// 	}
// 	public static void main(String[] args){
// 		INF_TwoPoint_06 T = new INF_TwoPoint_06();
// 		Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         int K = sc.nextInt();
//         int[] arr = new int[N];    
//         for(int i=0;i<N;i++)
//             arr[i] = sc.nextInt();
//         System.out.println(T.solution(N,K,arr));    
//         sc.close();
// 	}
// }