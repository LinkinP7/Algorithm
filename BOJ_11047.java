import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// 실버 4 동전 0
public class BOJ_11047 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		int MAX = 999999999;
		
		int N = Integer.parseInt(st.nextToken());   // 동전 종류
		int K = Integer.parseInt(st.nextToken());   // 금액
		
		int[] money = new int[N];				
		Arrays.fill(money, MAX);
		int[] coin = new int[N];
		
		for (int i = 0; i < N; i++) {
			coin[i] = Integer.parseInt(br.readLine());
		}
		
		for (int i = N-1; i >= 0; i--) {
			if( K / coin[i] == 0) {
				continue;
			}else {
				money[i] = Math.min(K / coin[i], MAX);
				K = K % coin[i];
			}
		}
		
		int cnt = 0;
		
		for (int i = 0; i < N; i++) {
			if(money[i] != MAX) {
				cnt += money[i];
			}
		}
		
		System.out.println(cnt);
		
	}
}
