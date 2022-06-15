package INF.Array;
import java.util.*;
// 인프런 15 가위 바위 보
public class INF_Array_03 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N];
        int[] B = new int[N];
        
        for(int i=0;i<N;i++)
            A[i] = sc.nextInt();
        
        for(int i=0;i<N;i++)
            B[i] = sc.nextInt();
        sc.close();
        for(int i=0;i<N;i++){
            System.out.println(rsp(A[i], B[i]));
        }
    }

    static char rsp(int a, int b){   // 비기거나 A 가 이기는 경우가 아니라면 B 가 이기는 것
        char result = ' ';
        if(a == b) result = 'D';
        else if(a==1 && b==3) result = 'A';
        else if(a==2 && b==1) result = 'A';
        else if(a==3 && b==2) result = 'A';
        else result = 'B';
        return result;
    }
}

// A, B 두 사람이 가위바위보 게임을 합니다. 총 N번의 게임을 하여 A가 이기면 A를 출력하고, B가 이기면 B를 출력합니다. 비길 경우에는 D를 출력합니다.
// 가위, 바위, 보의 정보는 1:가위, 2:바위, 3:보로 정하겠습니다.

// 5
// 2 3 3 1 3
// 1 1 2 2 3     ->  
// A
// B
// A
// B
// D