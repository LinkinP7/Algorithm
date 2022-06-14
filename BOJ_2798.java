import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;
// 브론즈 2 블랙잭
public class BOJ_2798 {

	static int tot, N, R, black;
	static int[] pick;
	static boolean[] v;
	static int[] num;
	static List<Integer> jack = new ArrayList<Integer>();
	
	public static void main(String[] args) throws Exception {
		

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		N = Integer.parseInt(st.nextToken());
		black = Integer.parseInt(st.nextToken());
		
		R = 3;
		v = new boolean[N];
		tot = 0;
		pick = new int[R];
		num = new int[N];
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		
		
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(st1.nextToken());
		}

	    nPr(0);
	    
	    Collections.sort(jack);
	    int result = jack.get(jack.size() - 1);
		System.out.println(result);
	}
	
	private static void nPr(int cnt) {
	      if (cnt == R) {
	         for (int i = 0; i < pick.length; i++) {
				tot += pick[i];
			 }
	         if(tot <= black) {
	        	 jack.add(tot);
	         }
	         tot=0;
	         return;
	      }

	      for (int i = 0; i < N; i++) {
	    	 if (v[i]) {
	            continue;
	         }

	         v[i] = true;
	         pick[cnt] = num[i];
	         nPr(cnt + 1);
	         v[i] = false;

	      }
	   }
}
