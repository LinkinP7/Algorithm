package BOJ.Bronze;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 브론즈 2 음계
public class BOJ_2920 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = 8;
        int[] arr = new int[N];
        int[] asc = {1,2,3,4,5,6,7,8};
        int[] dec = {8,7,6,5,4,3,2,1};
        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0;i<N;i++)
            arr[i] = Integer.parseInt(st.nextToken());

        if(Arrays.equals(arr, asc)) System.out.println("ascending");
        else if(Arrays.equals(arr, dec)) System.out.println("descending");
        else System.out.println("mixed");  
        
    }
}

// System.out.println(arr.equals(asc));   // false
// System.out.println(arr.equals(dec));   // false
// System.out.println(Arrays.equals(arr, asc));   // true   1,2,3,4,5,6,7,8 일때
// System.out.println(Arrays.equals(arr, dec));   // false

// Arrays.sort(arr);
// Arrays.sort(arr, Collections.reverseOrder());

// 두 배열을 == 연산자로 비교하면 배열의 요소가 아닌 Heap 영역의 주소 값을 비교하므로 배열의 타입, 동일한 수의 요소 그리고 정렬 순서가 동일하더라도 두 배열은 동일하지 않다.
// 두 배열을 Arrays.equals() 메서드로 비교하면 주소 값이 아닌 배열의 요소를 비교한다. 2차원 배열비교는 Arrays.deepEquals()
// arr.equals(asc) 는 자체의 값을 비교하지만 배열에서는 먹히지 않는것 같다.