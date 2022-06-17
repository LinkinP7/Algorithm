package BOJ.Silver;
import java.util.*;
// 실버 5 생일
public class BOJ_5635 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        String[] name = new String[N];
        int[][] birth = new int[N][3];

        for(int i=0;i<N;i++){
            name[i] = sc.next();
            for(int j = 0;j<3;j++)
                birth[i][j] = sc.nextInt();
        } sc.close();

        int min = 0, max = 0;
        for(int i=1;i<N;i++){    // 무식한데,,,,
            if(birth[min][2] < birth[i][2]){
                min = i;
            }else if(birth[min][2] == birth[i][2]){
                if(birth[min][1] < birth[i][1]){
                    min = i;
                }else if(birth[min][1] == birth[i][1]){
                    if(birth[min][0] < birth[i][0])
                        min = i;
                }
            }
            if(birth[max][2] > birth[i][2]){
                max = i;
            }else if(birth[max][2] == birth[i][2]){
                if(birth[max][1] > birth[i][1]){
                    max = i;
                }else if(birth[max][1] == birth[i][1]){
                    if(birth[max][0] > birth[i][0])
                        max = i;
                }
            }
        }
        System.out.println(name[min]);
        System.out.println(name[max]);
        // System.out.println(Arrays.toString(name));
        // System.out.println(Arrays.deepToString(birth));
    }
}
