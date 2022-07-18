package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// 실버 4 한수
// 한수 - 각 자리의 수가 등차수열을 이루는 수
// 두번째 풀이
public class BOJ_1065 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());  // N은 1000보다 작거나 같다 == 즉 999 로 봐도 무방.
        int answer = 0;
        
        if(N>=100){
            answer = 99;
            int num = 100;
            while(num <= N){
                if(num/10%10 - num%10 == num/100 - num/10%10) answer++;
                num++;
            }
        }else answer = N;
        System.out.println(answer);
    }    
}

// 첫번째 풀이
// public class BOJ_1065 {
// 	public static void main(String[] args) throws Exception {
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
// 		int N = Integer.parseInt(br.readLine());
// 		int cnt = 0;
		
// 		if(N < 100) {
// 			cnt = N;
// 		}
		
// 		if(N >= 100) {
// 			cnt = 99;
			
// 			for (int i = 100; i <= N; i++) {
// 				int hun = i/100;
// 				int ten = (i%100)/10;
// 				int one = 0;
// 				if(i%10 != 0) {
// 					one = (i%10);
// 				}
				
// 				if(hun-ten == ten-one) {
// 					cnt++;
// 				}
// 			}
// 		}
// 		System.out.println(cnt);
// 	}
// }


