import java.io.BufferedReader;
import java.io.InputStreamReader;
// 브론즈 2 분해합
public class BOJ_2231 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		int result = 0;
		
		for (int i = 1; i <= N; i++) {
			int num = i;
			int sum = 0;
			
			while(num != 0) {     // 각 자리수 더해주기! 제일 똑똑한 방법같다
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


//입력값이 분해합된 자연수
// 256의 생성자 245