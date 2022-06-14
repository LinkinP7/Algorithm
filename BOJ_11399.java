import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// �ǹ� 4 ATM
public class BOJ_11399 {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		int[] p = new int[N];
		
		for (int i = 0; i < N; i++) {
			p[i] = Integer.parseInt(st.nextToken());
		}
//		Arrays.parallelSort(p) �� ū������ ������ ��  �ð�����
		Arrays.sort(p);
        int sum = 0;
        int time = 0;
		for (int i = 0; i < p.length; i++) {
			sum += p[i];
			time += sum;
		}
		System.out.println(time);
	}
}


