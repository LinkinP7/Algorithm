import java.util.*;
import java.io.BufferedReader;
import java.io.InputStreamReader;
// 실버 4 큐 2
public class BOJ_18258 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder answer = new StringBuilder();
        int last = 0;

        StringTokenizer command = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++){

            switch(command.nextToken()){
                case "push":    int value = Integer.parseInt(command.nextToken());
                                last = value;
                                queue.offer(value);
                                break;

                case "pop":     if(queue.size() > 0) answer.append(queue.poll()+"\n");
                                else answer.append(-1+"\n");    
                                break;

                case "size":    answer.append(queue.size()+"\n");
                                break;

                case "empty":   if(queue.isEmpty()) answer.append(1+"\n");
                                else answer.append(0+"\n");
                                break;

                case "front":   if(!queue.isEmpty()) answer.append(queue.peek()+"\n");
                                else answer.append(-1+"\n");
                                break;

                case "back":    if(!queue.isEmpty()) answer.append(last+"\n");
                                else answer.append(-1+"\n");
                                break;
            }
        }
        System.out.print(answer);
    }    
}
