package BOJ.Silver;
import java.util.*;
// 실버 5 그룹 단어 체커
// List
public class BOJ_1316 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt(), idx = 0, answer = 0;
        String[] str = new String[N];
        for(int i=0;i<str.length;i++){
            str[i] = sc.next();
        }
        while(idx < N){
            boolean flag = true;
            List<Character> alp = new ArrayList<Character>();
            String check = str[idx];
            for(int i=0; i<check.length();i++){
                if(!alp.contains(check.charAt(i))){
                    alp.add(check.charAt(i));
                }else{
                    if(alp.indexOf(check.charAt(i)) < alp.size()-1){
                        flag = false;
                        break;
                    }
                }
            }
            if(flag) answer++;
            idx++;
        }
        System.out.println(answer);
        sc.close();
    }
}
