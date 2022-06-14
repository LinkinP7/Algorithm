import java.io.BufferedReader;
import java.io.InputStreamReader;
// import java.util.Arrays;
// 골드 4 N-Queen

//////////// 미해결 ////////////////

public class BOJ_9663 {

	static int N;
	static int count =0;
	static boolean[][] V;
	static int[][] board;
	static int check = 0;
	
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		N = Integer.parseInt(br.readLine());
		
		board = new int[N][N];
		V = new boolean[N][N];

		
		nQueen(0);
		System.out.println(count);
	}
	
	public static void nQueen(int cnt) {
		
		
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(V[i][j]) {
					check++;
				}
			}
		}
		
		if(cnt == N) {
			if(check == N*N) {
			count++;
			}
			return;
			
		}
		
		for (int i = 0; i < N; i++) {
			for (int j = 0; j < N; j++) {
				if(V[i][j]) {
					continue;
				}
				cross(i,j);
				for (int x = 0; x < N; x++) {
					V[i][x] = true;
					V[x][j] = true;
				}
				nQueen(cnt + 1);
				undo(i,j);
				for (int x = 0; x < N; x++) {
					V[i][x] = false;
					V[x][j] = false;
				}
			}
		}
	}
	
	public static void cross(int x, int y) {
	
		int a = x;
		int b = y;
		
		while(a-1 >= 0 && b-1 >= 0) {
			V[a-1][b-1] = true;
			a--; b--;
		}
		a = x; b = y;
		while(a+1 < N && b+1 < N) {
			V[a+1][b+1] = true;
			a++; b++;
		}
		a = x; b = y;
		while(a-1 >= 0 && b+1 < N) {
			V[a-1][b+1] = true;
			a--; b++;
		}
		a = x; b = y;
		while(a+1 < N && b-1 >= 0) {
			V[a+1][b-1] = true;
			a++; b--;
		}
	}
	
	public static void undo(int x, int y) {
		
		int a = x;
		int b = y;
		
		while(a-1 >= 0 && b-1 >= 0) {
			V[a-1][b-1] = false;
			a--; b--;
		}
		a = x; b = y;
		while(a+1 < N && b+1 < N) {
			V[a+1][b+1] = false;
			a++; b++;
		}
		a = x; b = y;
		while(a-1 >= 0 && b+1 < N) {
			V[a-1][b+1] = false;
			a--; b++;
		}
		a = x; b = y;
		while(a+1 < N && b-1 >= 0) {
			V[a+1][b-1] = false;
			a++; b--;
		}
	}
}
