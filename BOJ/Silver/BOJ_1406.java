package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.StringTokenizer;
// 실버 2 에디터
// LinkedList, ListIterator
public class BOJ_1406 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] input = br.readLine().toCharArray();
        LinkedList<Character> list = new LinkedList<>(); 
        ListIterator<Character> iter = list.listIterator();
        StringTokenizer st;

        for (Character c : input) 
            iter.add(c);
        
        int T = Integer.parseInt(br.readLine());

        while(T-->0){
            st = new StringTokenizer(br.readLine());
            String x = st.nextToken();
            switch(x){
                case "L": if(iter.hasPrevious()) iter.previous(); break;
                case "D": if(iter.hasNext()) iter.next(); break;
                case "B": if(iter.hasPrevious()){
                            iter.previous();
                            iter.remove();
                          } break;
                case "P": iter.add(st.nextToken().charAt(0));
                          break;
            }
        }
        // System.out.println(list);
        for (Character c : list) 
            sb.append(c);
        System.out.println(sb);
    }
}


// 시간초과...
// List의 add나 remove는 0부터 찾아들어가서 그 부분에서 동작한뒤 더하거나 빼면 다른 원소들이 전부 한칸씩 움직이는 연산을 하게된다.
// O(N) 이 되어버림.
// Stack 혹은 ListIterator 로 풀어야 한다.
// ArrayList는 정렬할 때만 사용하고, 이렇게 추가하고, 제거하는 문제의 경우엔 LinkedList를 활용하도록 하자.
// LinkedList에서 remove와 add는 리스트의 처음부터 끝까지 탐색한다는 걸 잊지말자.
// ListIterator는 양방향 이동이 가능하나 ArrayList, LinkedList 에서만 사용이 가능하다.

// public class BOJ_1406 {
//     public static void main(String[] args) throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();
//         char[] input = br.readLine().toCharArray();
//         ArrayList<Character> list = new ArrayList<>(); 
//         StringTokenizer st;

//         for (Character c : input) 
//             list.add(c);
        
//         int cursor = list.size();
//         int T = Integer.parseInt(br.readLine());

//         while(T-->0){
//             st = new StringTokenizer(br.readLine());
//             String x = st.nextToken();
//             switch(x){
//                 case "L": if(cursor>=1) cursor--; break;
//                 case "D": if(cursor<list.size()) cursor++; break;
//                 case "B": if(cursor != 0){
//                             list.remove(cursor-1); cursor--;
//                           } break;
//                 case "P": char a = st.nextToken().charAt(0);
//                           list.add(cursor, a); cursor++;
//                           break;
//             }
//             // System.out.println("NOWCURSOR::: " + cursor);
//         }
//         // System.out.println(list);
//         for (Character c : list) 
//             sb.append(c);
//         System.out.println(sb);
//     }
// }
