package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BOJ_13305_������  {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		
		long[] dis = new long[N-1];
		long[] city = new long[N];
		
		for (int i = 0; i < dis.length; i++) {
			dis[i] = Long.parseLong(st.nextToken());
		}
		
		for (int i = 0; i < city.length; i++) {
			city[i] = Long.parseLong(st2.nextToken());
		}
		
		long cost = 0;
		
		for (int i = 0; i < dis.length; i++) {
			if(city[i] < city[i+1]) {
				city[i+1] = city[i];
			}
			cost += city[i]*dis[i];
		}
		
		System.out.println(cost);
		
	}
}


//������ ������ ��Ÿ���� ���� N(2 �� N �� 100,000)�� �־�����
//���� ���� ���ú��� ���� ������ ���ñ����� �Ÿ��� 1�̻� 1,000,000,000 ������ �ڿ����̴�. 
//���ʹ� ������ 1 �̻� 1,000,000,000 ������ �ڿ����̴�. 
// int ���� long�� ���� ��    ���� ���ڰ� long �� �Ѵ´ٸ� BigInteger �� ����