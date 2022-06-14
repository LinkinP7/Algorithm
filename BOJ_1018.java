import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 실버 4 체스판 다시 칠하기
public class BOJ_1018 {
	
	static boolean[][] chessBoard;
	static int min = 64;
	
	public static void main(String[] args) throws Exception{
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		if(M < 8 && N < 8) {
			System.out.println("Error");
		}
		
		chessBoard = new boolean[M][N];
		
		for (int i = 0; i < M; i++) {
			
			String wb = br.readLine();
		
			for (int j = 0; j < N; j++) {
				if(wb.charAt(j) == 'B') {
					chessBoard[i][j] = true;
				}
			}
		}
		
			
		for (int i = 0; i < M-7; i++) {
			for (int j = 0; j < N-7; j++) {
				check(i,j);
			}
		}
		
		System.out.println(min);
	}
	
	public static void check(int n, int m) {
		int cnt = 0;
		boolean board = chessBoard[n][m];
		
		for (int i = n; i < n+8; i++) {
			for (int j = m; j < m+8; j++) {
				if(board != chessBoard[i][j]) 
					cnt++;
				
				board = !board;
			}
			board = !board;
		}
		
		cnt = Math.min(cnt, 64-cnt);
		
		min = Math.min(cnt, min);
	}
}
