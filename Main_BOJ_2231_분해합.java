package BOJ;
//�Է°��� �����յ� �ڿ���
// 256�� ������ 245

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main_BOJ_2231_������ {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		
		for (int i = 1; i <= N; i++) {
			int num = i;
			int sum = 0;
			
			while(num != 0) {     // �� �ڸ��� �����ֱ�! ���� �ȶ��� �������
				sum += num%10;
				num /= 10;
			}
			
			if(sum+i == N) {
				result = i;
				break;
			}
		}
		System.out.println(result);
	}
}
