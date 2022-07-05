import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 실버 3 두 수의 합
// 투포인터
public class BOJ_3273 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int answer = 0, lt = 0;
        int[] arr = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            arr[i] = Integer.parseInt(st.nextToken());
        int X = Integer.parseInt(br.readLine());

        for(int rt=1;rt<N;rt++){
            if(arr[lt]+arr[rt] == X) answer++;
            
            
        }
    }
}
