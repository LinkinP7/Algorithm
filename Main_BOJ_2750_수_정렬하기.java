package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_BOJ_2750_수_정렬하기 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int[] num = new int[N];
		
		for (int i = 0; i < N; i++) {
			num[i] = Integer.parseInt(br.readLine());
		}
		
		int tmp = 0;
		
		for(int j = 0; j < num.length; j++) {
			for (int i = 0; i < num.length-1; i++) {
				if(num[i] > num[i+1]) {
					tmp = num[i];
					num[i] = num[i+1];
					num[i+1] = tmp;
				}
			}
		}
		
		for (int i = 0; i < num.length; i++) {
			System.out.println(num[i]);
		}
		
	}
}


//public class Main_BOJ_2750_수_정렬하기 {
//	public static void main(String[] args) throws Exception {
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int N = Integer.parseInt(br.readLine());
//		int[] num = new int[N];
//		for (int i = 0; i < N; i++) {
//			num[i] = Integer.parseInt(br.readLine());
//		}
//		
//		Arrays.sort(num);
//		//Arrays.sort(num,Collections.reverseOrder());  내림차순
//		for (int i = 0; i < num.length; i++) {
//			System.out.println(num[i]);
//		}
//		
//	}
//}