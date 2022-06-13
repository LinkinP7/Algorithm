package BOJ;

import java.util.Arrays;

public class Permutation {

   static int[] p = { 5,6,7,8,9 };
   static int N, R;
   static boolean[] v;
   static int tot;
   static int[] num;

   public static void main(String[] args) {

      N = 5;
      R = 3;
      v = new boolean[N];
      tot = 0;
      num = new int[R];
      nPr(0);
      System.out.println(tot);
   }

   private static void nPr(int cnt) {
      if (cnt == R) {
         tot++;
         System.out.println(Arrays.toString(num));
         return;
      }

      for (int i = 0; i < N; i++) {
         if (v[i]) {
            continue;
         }

         v[i] = true;
         num[cnt] = p[i];
         nPr(cnt + 1);
         v[i] = false;

      }
   }
}

//�Է¹��� �迭�� arr�϶� �� �迭�� ���� ù �ε����� �����̰� �������߿� ���� �ϸ�
//num[0]=arr[0] ���� �����ϰ�
//nPr(1) �� ������