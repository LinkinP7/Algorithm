package BOJ;
import java.util.*;
// 실버 3 풍선 터뜨리기
public class BOJ_2346 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();

        int[] answer = new int[N];
        for(int i=0;i<N;i++)
            arr.add(sc.nextInt());
        sc.close();

        int idx = 0;
        // for(int i=0;i<N;i++){
        //     answer[i] = idx+1;
        //     idx = arr[idx];
        // }

        System.out.println(arr);
        System.out.println(Arrays.toString(answer));
    }
}
