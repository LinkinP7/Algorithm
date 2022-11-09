import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 실버 5 달팽이는 올라가고 싶다
public class BOJ_2869 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int up = Integer.parseInt(st.nextToken());
        int down = Integer.parseInt(st.nextToken());
        int goal = Integer.parseInt(st.nextToken());
        int cnt = goal/up;
        int point = (up-down)*cnt;

        while(point < goal){
            cnt++;
            point += up;
            if(point >= goal) break;
            point -= down;
        }

        System.out.println(cnt);

    }
}

// int 는 21억, 그 이상은 long