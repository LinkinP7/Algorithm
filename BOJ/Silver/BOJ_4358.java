package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 실버 2 생태학
public class BOJ_4358 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<String, Integer> map = new HashMap<>();
        // StringBuilder sb = new StringBuilder();
        String input = "";
        int cnt = 0;

        while((input = br.readLine()) != null){
            if(input.length() == 0) break;
            map.put(input, map.getOrDefault(input, 0)+1);
            cnt++;
        }

        Object[] mapkey = map.keySet().toArray();
		Arrays.sort(mapkey);
        // System.out.println(Arrays.toString(mapkey));
        // System.out.println(mapkey[0]);
        for (Object tree : mapkey) {
            // round를 써도 같은 형식으로 출력되지만, 문제에서 계산하는 방식이 다른듯 하다.
            // sb.append(tree+" ").append(Math.round((double) map.get(tree)/cnt * 1000000) / 10000.0).append("\n");
            System.out.printf("%s %.4f\n", tree,  (double)map.get(tree)/cnt*100);
            // 소수점 n 자리는 printf의 format 을 사용하여 출력할 수 있다.

        }
        // ArrayList<String> tree = new ArrayList<>();
        // for(Map.Entry<String, Integer> entry : map.entrySet())
        //     tree.add(entry.getKey());
        
        // Arrays.sort(tree);


        // System.out.println(tree);
        // System.out.println(map);
        // System.out.println(sb);
    }
}
