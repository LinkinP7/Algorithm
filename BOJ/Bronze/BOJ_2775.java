package BOJ.Bronze;
import java.util.*;
// 브론즈 1 부녀회장이 될테야
public class BOJ_2775 {  // 2차원배열
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        while(N-- >0){
            int answer = 0;
            int k = sc.nextInt();
            int n = sc.nextInt();
            sc.close();
            int[][] apt = new int[k+1][n+1];
            
            for(int j=0;j<=k;j++){
                apt[j][1] = 1;
                if(j==0){
                    for(int i=2;i<=n;i++){
                        if(j==0) apt[j][i] = i;
                    }
                }else{
                    for(int i=2;i<=n;i++){
                        apt[j][i] = apt[j-1][i] + apt[j][i-1];
                    }
                }
            }
            answer += apt[k][n];

            System.out.println(Arrays.deepToString(apt));
            System.out.println(answer);
        }
    }
}

// 1차원 배열
// import java.util.*;
// public class Main {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int test_case = sc.nextInt();
       
//         for (int i = 0; i < test_case; i++) {
//             int k = sc.nextInt();
//             int n = sc.nextInt();

//             int arr[] = new int[n];
//             int floor = 0;

//             arr[0] = 1;
//             for (int j = 1; j < n; j++) // 0층 거주 사람 수
//                 arr[j] = j + 1;

//             while (floor < k) {
//                 floor++;
//                 for (int w = 1; w < n; w++) { // n층 거주 사람 수.
//                     arr[w] = arr[w] + arr[w - 1];
//                 }
//             }
//             System.out.println(arr[n - 1]);
//         }
//     }
// }