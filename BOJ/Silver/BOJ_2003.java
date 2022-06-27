package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 실버 4 수들의 합 2
public class BOJ_2003 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        st= new StringTokenizer(br.readLine());
        for(int i=0;i<N;i++)
            arr[i] = Integer.parseInt(st.nextToken());

        int sum = 0, cursor = 0, idx = 0, answer = 0;    
        while(idx < N){
            if(arr[idx] == K){
                answer++;
                sum = 0;
                idx++;
                cursor = idx;
                continue;
            }
            if(sum < K){
                sum += arr[idx];
                idx++;
            }else if(sum == K){
                answer++;
                sum -= arr[cursor];
                cursor++;
            }else{
                sum -= arr[cursor];
                cursor++;
            }
        }
        if(sum == K) answer++;

        System.out.println(answer);
    }
}
