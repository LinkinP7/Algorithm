package BOJ;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main_BOJ_13305_주유소  {
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


//도시의 개수를 나타내는 정수 N(2 ≤ N ≤ 100,000)이 주어진다
//제일 왼쪽 도시부터 제일 오른쪽 도시까지의 거리는 1이상 1,000,000,000 이하의 자연수이다. 
//리터당 가격은 1 이상 1,000,000,000 이하의 자연수이다. 
// int 말고 long을 쓰자 ㅠ    만약 숫자가 long 을 넘는다면 BigInteger 를 쓰자