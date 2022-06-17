package BOJ.Silver;
import java.util.*;
// 실버 4 큐
public class BOJ_10845 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        Queue<Integer> queue = new LinkedList<>();
        StringBuilder answer = new StringBuilder();
        int last = 0;

        for(int i=0;i<N;i++){
            String command = sc.next();
            switch(command){
                case "push":    int value = sc.nextInt();
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
        sc.close();
        System.out.print(answer);
    }    
}
