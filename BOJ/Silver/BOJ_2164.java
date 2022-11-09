package BOJ.Silver;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
// 실버 4 카드2
// Queue
public class BOJ_2164 {
    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();

        for(int i=0;i<N;i++)
            queue.offer(i+1);
        
        for(int i=0;i<N-1;i++){
            queue.poll();
            int last = queue.poll();
            queue.add(last);
        }
        System.out.println(queue.poll());
    }
}
