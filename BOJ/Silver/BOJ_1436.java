package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// �ǹ� 5 ��ȭ���� ��
// String, Brute Force
public class BOJ_1436 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int cnt = 0;
		int num = 666;
		
		while(cnt != N) {
			if(String.valueOf(num).contains("666")) {
				cnt++;
			}
			num++;
		}
		System.out.println(num-1);
	}
}

// ������ 6�� 3�� �����ϴ� ���� --> exception //  input 1321 => output 166386
//public class Main_BOJ_1436_��ȭ����_�� {
//	public static void main(String[] args) throws Exception{
//		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//		
//		int N = Integer.parseInt(br.readLine());
//		StringBuilder sb = new StringBuilder();
//		int n = 1;
//		int cnt = 0;
//		while(true) {
//			int six = 0;
//			int tmp = n;
//			while(tmp != 0) {
//				int num = tmp % 10;
//				if(num == 6) { six++; }
//				tmp /= 10;
//			}
//			
//			if(six >= 3) {
//				cnt++;
//			}
//
//			if(cnt == N) {
//				System.out.println(n);
//				break;
//			}
//			n++;
//		}
//	}
//}
