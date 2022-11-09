package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 실버 5 회사에 있는 사람
// HashMap
public class BOJ_7785 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        HashMap<String, Integer> employee = new HashMap<>();
        // ArrayList<String> employee = new ArrayList<>();

        while(N-->0){
            st = new StringTokenizer(br.readLine());
            String name = st.nextToken();
            String flag = st.nextToken();
            if(flag.equals("enter")) employee.put(name, 1);
            else employee.remove(name);
        }

        Object[] check = employee.keySet().toArray();
        Arrays.sort(check, Collections.reverseOrder());
        // System.out.println(Arrays.toString(check));

        for (Object name : check) {
            sb.append(name).append("\n");
        }

        System.out.println(sb);
        // System.out.println(employee);
    }
}


// #1 시간초과
// 어레이리스트를 사용하시면 삭제 연산에서 시간이 n만큼 걸리기 때문에 결국 시간복잡도가 O(n^2)되어 시간초과가 걸립니다. 해시맵을 써야한다.
// ArrayList의 remove와 HashMap의 remove 연산 속도가 다르다.
// public class BOJ_7785 {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int N = Integer.parseInt(br.readLine());
//         StringBuilder sb = new StringBuilder();
//         StringTokenizer st;
//         ArrayList<String> employee = new ArrayList<>();

//         while(N-->0){
//             st = new StringTokenizer(br.readLine());
//             String name = st.nextToken();
//             String flag = st.nextToken();
//             if(flag.equals("enter")) employee.add(name);
//             else employee.remove(name);
//         }

//         Object[] check = employee.toArray();
//         Arrays.sort(check, Collections.reverseOrder());
//         // System.out.println(Arrays.toString(check));

//         for (Object name : check) {
//             sb.append(name).append("\n");
//         }

//         System.out.println(sb);
//         // System.out.println(employee);
//     }
// }
