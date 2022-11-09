package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 실버 4 베스트셀러
// HashMap
public class BOJ_1302 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        int MAX = 0;

        while(N-->0){
            String book = br.readLine();
            // map.put(book, map.getOrDefault(book, 0) + 1);
            if(map.get(book) == null) map.put(book, 1);
            else map.put(book, map.get(book)+1);  // map.replace 도 가능
            MAX = Math.max(MAX, map.get(book));
        }

        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            if (entry.getValue() == MAX) list.add(entry.getKey());
        }
        Collections.sort(list);
        // System.out.println(list);
        System.out.print(list.get(0));
    }    
}

    // for(Map.Entry<String, Integer> entry : map.entrySet()){
    //     entry.getValue() == N 일때 entry.getValue() 를 활용
    // }


// HashMap 으로 카운팅 하고, 정렬할 수 있는지 보는 문제
// Map.Entry 는 Map 형태의 인터페이스를 만들어 for문을 돌려주거나
// Stream 사용 시 Map 형식의 데이터 처리시 사용한다.

// Map.Entry 사용하는 대표적인 두가지

// for(Map.Entry<String, Integer> entry : map.entrySet()) {
//     System.out.println("entry.getKey() : " + entry.getKey());
//     System.out.println("entry.getKey() : " + entry.getValue());
// }

// System.out.println( map.entrySet().stream()
//                                   .map(Map.Entry<String, Integer>::getKey)
//                                   .collect(Collectors.toList())
//                   );

// 이거 어케쓰노 ㅋㅋ

// List<Map.Entry<String, Integer>> entryList = new LinkedList<Map.Entry<String,Integer>>(map.entrySet());

// Collections.sort(entryList, new Comparator<Map.Entry<String, Integer> >() {
//     public int compare(Map.Entry<String, Integer> o1,
//                        Map.Entry<String, Integer> o2)
//     {
//         return (o2.getValue()).compareTo(o1.getValue());
//     }
// });