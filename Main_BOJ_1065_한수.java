package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;

// �� �ڸ��� ���� ���������� �̷�� ��
public class Main_BOJ_1065_�Ѽ� {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		
		if(N < 100) {
			cnt = N;
		}
		
		if(N >= 100) {
			cnt = 99;
			
			for (int i = 100; i <= N; i++) {
				int hun = i/100;
				int ten = (i%100)/10;
				int one = 0;
				if(i%10 != 0) {
					one = (i%10);
				}
				
				if(hun-ten == ten-one) {
					cnt++;
				}
			}
		}
		System.out.println(cnt);
	}
}


