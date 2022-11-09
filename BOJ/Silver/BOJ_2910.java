package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 실버 3 빈도 정렬
// HashMap, Set
public class BOJ_2910 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        HashMap<Integer, Integer> map = new HashMap<>();
        int N = Integer.parseInt(st.nextToken());
        ArrayList<Integer> num = new ArrayList<>();
        Set<Integer> set = new HashSet<>();

        st = new StringTokenizer(br.readLine());
        while(N-->0){
            int i = Integer.parseInt(st.nextToken());
            if(map.get(i)==null){
                map.put(i, 1);
                num.add(i);
            }else map.put(i, map.get(i)+1);
        }
        System.out.println(num);

        for (Integer i : map.values())
            set.add(i);
        Object[] check = set.toArray();
        Arrays.sort(check, Collections.reverseOrder());

        System.out.println("check: " + Arrays.toString(check));

        for (Object o : check) {
            int x = Integer.parseInt(o.toString());
            for (int oInt : num) {
                if(map.get(oInt) == x){
                    for(int i =0; i<x;i++){
                        sb.append(oInt).append(" ");
                    }
                }
            }
        }

        System.out.println(sb);
    }
}