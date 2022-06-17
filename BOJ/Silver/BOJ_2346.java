package BOJ.Silver;
import java.util.*;
// 실버 3 풍선 터뜨리기
public class BOJ_2346 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> balloon = new ArrayList<>();
        StringBuffer answer = new StringBuffer();

        for(int i=1;i<=N;i++)
            balloon.add(sc.nextInt());
        sc.close();    
        int move = 0, cursor = 0;   

        for(int i=0;i<N;i++){
            int direction = (move < 0) ? -1 : 1;
            move *= direction;

            for(int j=0;j<move;j++){
                cursor += direction;
                if(cursor >= N) cursor = 0;
                else if(cursor < 0) cursor = N-1;
                if(balloon.get(cursor) == 0) j--;    
            }

            move = balloon.get(cursor);
            balloon.set(cursor, 0);
            answer.append(cursor+1+" ");
        }
        System.out.println(answer.toString());
    }

}