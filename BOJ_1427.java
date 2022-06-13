import java.util.*;;
// 실버 5 소트인사이드
public class BOJ_1427 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        char[] ch = str.toCharArray();
        boolean flag = true;

        while(flag){
            int tmp = 0;
            for(int i=1;i<ch.length;i++){
                if(ch[i] > ch[i-1]){
                    tmp = ch[i];
                    ch[i] = ch[i-1];
                    ch[i-1] = (char)tmp; 
                }
            }
            if(tmp == 0) flag = false;
        }
        System.out.println(String.valueOf(ch));
        sc.close();
    }
}
