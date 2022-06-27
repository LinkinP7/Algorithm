package INF.TwoPoint_SlidingWindow;
import java.util.*;
// 인프런 28 최대 길이 연속부분수열
class INF_TwoPoint_06{
    public int solution(int N, int K, int[] arr){
        int answer = Integer.MIN_VALUE;
        int cursor = 0, idx = 0, count = 0;
        int nextCursor = 0, tmp = 0;
        boolean oneFlag = true;
        while(idx < N){
            if(arr[idx] == 0){
                count++;
                oneFlag = false;
            }else{
                if(!oneFlag && nextCursor == 0)
                    nextCursor = idx;
                oneFlag = true;
            } 
            
            if(count > K){
                tmp = idx - cursor;
                System.out.println("idx: "+idx+" cursor: "+cursor+" nextC: "+ nextCursor+" tmp: "+ tmp);
                answer = Math.max(tmp, answer);
                idx = nextCursor-1; cursor = nextCursor;
                nextCursor = 0;
                count = 0;
                oneFlag = true;
            }

            if(idx == N-1){
                tmp = idx - cursor+1;
                answer = Math.max(tmp, answer);
                System.out.println("idx: "+idx+" cursor: "+cursor+" nextC: "+ nextCursor+" tmp: "+ tmp);
            } 
            idx++;
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