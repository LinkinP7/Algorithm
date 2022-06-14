import java.io.BufferedReader;
import java.io.InputStreamReader;
// ����� 2 ������
public class BOJ_2231 {
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


//�Է°��� �����յ� �ڿ���
// 256�� ������ 245