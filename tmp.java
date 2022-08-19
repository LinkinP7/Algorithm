import java.util.Arrays;
import java.util.Scanner;

public class tmp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
        sc.close();

        for(int i=0;i<N;i++){
            for(int j=i+1;j<N;j++){
                if(arr[i] > arr[j]){
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;
                }
            }
        }
        
        System.out.println(Arrays.toString(arr));
    
    }
}
