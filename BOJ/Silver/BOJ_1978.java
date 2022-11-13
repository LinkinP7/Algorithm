package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 실버 5 소수 찾기
public class BOJ_1978 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] decimal = new int[1001];
        int[] input = new int[N];
        int cnt = 0;
        for(int i=2;i<decimal.length;i++)
            decimal[i] = i;

        for(int i=2;i<decimal.length;i++){
            if(decimal[i]==0) continue;
            for(int j=i*2;j<decimal.length;j+=i){
                decimal[j] = 0;
            }
        }    
        
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++)
            input[i] = Integer.parseInt(st.nextToken());

        for(int i : input)
            if(decimal[i] != 0) cnt++;            
        
        System.out.println(cnt);

    }
}
