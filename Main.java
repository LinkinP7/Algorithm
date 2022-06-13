import java.util.*;

class Main {
    public int[] solution(String str, String s) {
        int[] answer = new int[str.length()];
        char t = s.charAt(0);
        int lt = str.indexOf(t), rt = str.indexOf(t, lt + 1);
        for (int i = 0; i < str.length(); i++) {
            if (rt != -1 && i > rt) {
                lt = rt;
                rt = str.indexOf(t, lt + 1);
            }
            if(str.charAt(i) == t) answer[i] = 0;
            else answer[i] = Math.min(Math.abs(i - lt), Math.abs(rt - i));
        }
        return answer;
    }
    public static void main(String[] args) {
        Main T = new Main();
        Scanner sc = new Scanner(System.in);
        String str = sc.next();
        String s = sc.next();
        int[] answer = T.solution(str, s);
        for (int x : answer)
            System.out.print(x + " ");

        // System.out.println(Arrays.toString(T.solution(str, s)));
        sc.close();
    }
}