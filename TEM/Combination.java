package TEM;
import java.util.Arrays;

public class Combination {

   static int[] p = { 1, 2, 3, 4, 5 };
   static int N, R;
   static int tot;
   static int[] num;

   public static void main(String[] args) {
      
      N = 5;
      R = 3;
      tot = 0;
      num = new int[R];
      nCr(0, 0);
      System.out.println(tot);
   }

   private static void nCr(int cnt, int start) {
      if (cnt == R) {
         tot++;
         System.out.println(Arrays.toString(num));
         return;
      }

      for (int i = start; i < N; i++) {
         num[cnt] = p[i];
         nCr(cnt + 1, i + 1);
      }
   }
}