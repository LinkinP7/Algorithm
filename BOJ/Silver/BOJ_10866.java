package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 실버 4 덱
// Deque
public class BOJ_10866 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        Deque<Integer> dq = new LinkedList<>();
        StringBuilder answer = new StringBuilder();

        while(N-- >0){
            int value = 0;
            StringTokenizer command = new StringTokenizer(br.readLine());
            switch(command.nextToken()){
                case "push_front":  value = Integer.parseInt(command.nextToken());
                                    dq.offerFirst(value);
                                    break;

                case "push_back":   value = Integer.parseInt(command.nextToken());
                                    dq.offerLast(value);  
                                    break;

                case "pop_front":   if(!dq.isEmpty()) answer.append(dq.pollFirst()+"\n");
                                    else answer.append(-1+"\n");
                                    break;

                case "pop_back":    if(!dq.isEmpty()) answer.append(dq.pollLast()+"\n");
                                    else answer.append(-1+"\n");  
                                    break;

                case "size":        answer.append(dq.size()+"\n");
                                    break;

                case "empty":       if(dq.isEmpty()) answer.append(1+"\n");
                                    else answer.append(0+"\n");
                                    break;
                
                case "front":       if(!dq.isEmpty()) answer.append(dq.peekFirst()+"\n");
                                    else answer.append(-1+"\n");
                                    break;            

                case "back":        if(!dq.isEmpty()) answer.append(dq.peekLast()+"\n");
                                    else answer.append(-1+"\n");
                                    break;
            }
            // System.out.println("now:"+dq);
        }
        System.out.println(answer);
    }
}


// 문제를 잘 읽자... empty가 아니면을 -1 로 놓아서 3번틀렸다....