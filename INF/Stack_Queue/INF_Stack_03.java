package INF.Stack_Queue;
import java.util.*;
// 인프런 38 크레인 인형뽑기(카카오)
class INF_Stack_03{
	public int solution(int N, int[][] board,int M, int[] moves){
		int answer = 0;
        Stack<Integer> stack = new Stack<>();
        // System.out.println(Arrays.deepToString(board)); 
        // System.out.println(Arrays.toString(moves));

        for(int i=0;i<M;i++){
            int cursor = moves[i];
            int idx = 1, pick = 0;
            while(idx <= N){
                // System.out.println(board[idx][cursor]);
                if(board[idx][cursor] != 0){
                    pick = board[idx][cursor];
                    board[idx][cursor] = 0;
                    break;
                }
                idx++;
            }
            if(pick != 0){
                if(!stack.isEmpty()){
                    if(stack.peek() == pick){
                        stack.pop();
                        answer += 2;
                    }else{
                        stack.push(pick);
                    } 
                }else{
                    stack.push(pick);
                }
            } 
            // System.out.println(pick + "stk: " + stack);
        }
		return answer;
	}
	public static void main(String[] args){
		INF_Stack_03 T = new INF_Stack_03();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int[][] board = new int[N+1][N+1];
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                board[i][j] = sc.nextInt();
            }
        }
        int M = sc.nextInt();
        int[] moves = new int[M];
        for(int i=0;i<M;i++)
            moves[i] = sc.nextInt();

        System.out.println(T.solution(N,board,M,moves));  
        sc.close();
	}
}

// 강의 풀이
// public int solution(int[][] board, int[] moves){
//     int answer=0;
//     Stack<Integer> stack = new Stack<>();
//     for(int pos : moves){
//         for(int i=0; i<board.length; i++){
//             if(board[i][pos-1]!=0){
//                 int tmp=board[i][pos-1];
//                 board[i][pos-1]=0;
//                 if(!stack.isEmpty() && tmp==stack.peek()){
//                     answer+=2;
//                     stack.pop();
//                 }
//                 else stack.push(tmp);
//                 break;
//             }
//         }
//     }
//     return answer;
// }