// 실버 5 셀프 넘버
public class BOJ_4673 {
	public static void main(String[] args) {
		
		boolean[] check = new boolean[10001];
		check[0] = true;
		
		for (int i = 1; i <= 10000; i++) {
			int N = selfNum(i);
			
			if(N <= 10000) {
				check[N] = true;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		
		for (int i = 0; i < check.length; i++) {
			if(check[i] == false) {
				sb.append(i).append("\n");
			}
		}
		System.out.println(sb);
	}
	
	static int selfNum(int n) {
		int num = n;
		int sum = n;
			
		while(num != 0) {
			sum += num%10;
			num /= 10;
		}
		return sum;
	}	
}
