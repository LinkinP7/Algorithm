import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
// 실버 3 프린터 큐
public class BOJ_1966 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        LinkedList<int[]> queue = new LinkedList<>();
        
        while(N-- > 0){
            st = new StringTokenizer(br.readLine());
            int count = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());

            st = new StringTokenizer(br.readLine());
            for(int i=0;i<count;i++){
                queue.offer(new int[] { i, Integer.parseInt(st.nextToken()) });    // get(큐index)[]  -> [0] 배열 인덱스, [1] 배열 값 
            }
            // System.out.println(queue);
            // queue.clear();
        }
        // System.out.println(queue.get(0)[0]);
        // System.out.println(queue.get(0)[1]);
        // System.out.println(queue.get(1)[0]);
        // System.out.println(queue.get(1)[1]);
        // System.out.println(queue.get(2)[0]);
        // System.out.println(queue.get(2)[1]);
        // System.out.println(queue.get(3)[0]);
        // System.out.println(queue.get(3)[1]);
        // System.out.println(queue.get(4)[0]);
        // System.out.println(queue.get(4)[1]);
        System.out.println(queue.get(7)[1]); 
    }
}
