package BOJ;

public class Subset {

	   static int[] p = {0, 1, 2, 3, 4, 5 };
	   static int N;
	   static boolean[] v;
	   static int tot;

	   public static void main(String[] args) {

	      N = 6;
	      v = new boolean[N];
	      tot = 0;

	      subset(0, 0);

	   }
	   private static void subset(int cnt, int sum) {

	      if (cnt == N) {
//	         if (sum==0) {
//	            return;
//	         }
	         tot++;
	         for (int i = 0; i < N; i++) {
	            System.out.print((v[i] ? p[i] : "x") + " ");
	         }
	         System.out.println();
	         System.out.println(sum);
	         return;
	      }

	      v[cnt] = true;
	      subset(cnt + 1, sum + p[cnt]);
	      v[cnt] = false;
	      subset(cnt + 1, sum);
	      
	   }
	}