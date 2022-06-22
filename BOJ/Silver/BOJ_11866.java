package BOJ.Silver;
import java.util.*;
// 실버 5 요세푸스 문제 0
public class BOJ_11866 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int K = sc.nextInt();
        sc.close();

        StringBuilder answer = new StringBuilder();
        Queue<Integer> q = new LinkedList<>();
        answer.append("<");
        for(int i=0;i<N;i++)
            q.offer(i+1);

        while(!q.isEmpty()){
            for(int i=1;i<K;i++)
                q.offer(q.poll());
            if(q.size() == 1) answer.append(q.poll()).append(">");    
            else answer.append(q.poll()).append(", ");
        }
        System.out.println(answer);
    }
}

// 처음에 k 만큼 가서 빼다가 k보다 작게 남으면 그냥 출력하는줄 알았다.