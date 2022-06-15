
import java.util.*;
// 실버 3 풍선 터뜨리기
public class BOJ_2346 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        List<Integer> arr = new ArrayList<Integer>();
        int[] check = new int[N];

        int[] answer = new int[N];
        for(int i=0;i<N;i++){
            arr.add(sc.nextInt());
            check[i] = arr.get(arr.size()-1);
        }
        sc.close();

        answer[0] = 1;

        int idx = 0, x=1;
        for(int i=1;i<N-1;i++){
            if(arr.get(idx) > 0){
                answer[x] = idx+arr.get(idx);
            }else{
                answer[x] = N - Math.abs(idx-arr.get(idx)) - 1;
            }
            x++;
        }

        System.out.println(arr);
        System.out.println(Arrays.toString(answer));
    }
}
