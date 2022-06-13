package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BOJ_15649_N?_M1 {
	
	static boolean[] V;
	static int[] num, p;
	static int N,R;

	
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		
		V = new boolean[N];
		num = new int[R];
		p = new int[N];

		for (int i = 0; i < N; i++) {
			p[i] = i+1;
		}
		
		nPr(0);
		
	}
	
	public static void nPr(int cnt) {
		if(cnt == R) {
			for (int i = 0; i < num.length; i++) {
				System.out.print(num[i] + " ");
			}System.out.println("");
			return;
		}
		
		for (int i = 0; i < N; i++) {
			if(V[i]) {
				continue;
			}
			
			V[i] = true;
			num[cnt] = p[i];
			nPr(cnt+1);
			
			V[i] = false;
		}
	}
}
