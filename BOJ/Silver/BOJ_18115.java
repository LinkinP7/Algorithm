package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 실버 3 카드 놓기
public class BOJ_18115 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(br.readLine());
        int[] skill = new int[N];
        int[] card = new int[N];
        StringTokenizer st = new StringTokenizer(br.readLine());
        Deque<Integer> q = new LinkedList<>();

        for(int i=0;i<N;i++)
            card[i] = i+1;

        for(int i=N-1;i>=0;i--)
            skill[i] = Integer.parseInt(st.nextToken());
        
        for(int i=0;i<N;i++){
            if(skill[i] == 1) q.offerFirst(card[i]);
            else if(skill[i] == 2){
                int tmp = q.poll();
                q.offerFirst(card[i]);
                q.offerFirst(tmp);
            }else q.offer(card[i]);
        }

        System.out.println(Arrays.toString(skill));
        System.out.println(q);

        for (Integer answer : q) {
            sb.append(answer).append(" ");
        }
        System.out.println(sb);
    }
}

// N 은 카드의 수이며 스킬 이후 반드시 오름차순이어야 한다. 
// 1 : 제일 위의 카드 1장을 바닥에 내려놓는다.
// 2 : 위에서 두 번째 카드를 바닥에 내려놓는다. 카드가 2장 이상일 때만 쓸 수 있다.
// 3 : 제일 밑에 있는 카드를 바닥에 내려놓는다. 카드가 2장 이상일 때만 쓸 수 있다.
