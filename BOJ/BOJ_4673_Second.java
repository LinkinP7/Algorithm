package BOJ;
// 실버 5 셀프 넘버 - 두번째 풀이
public class BOJ_4673_Second {
    public static void main(String[] args) {
        for(int i=1;i<=10000;i++)
            selfN(i);
    }
    static void selfN(int n){
        boolean check = true;
        for(int i=1;i<n+1;i++){
            if(i+(i%10)+(i/10%10)+(i/100%10)+(i/1000%10)+(i/10000%10) == n) check = false;
        }
        if(check)
            System.out.println(n);
    }
}
