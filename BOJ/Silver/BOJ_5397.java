package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.ListIterator;
// 실버 2 키로거
// LinkedList, ListIterator
public class BOJ_5397 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        while(T-->0){
            char[] input = br.readLine().toCharArray();
            LinkedList<Character> list = new LinkedList<>();
            ListIterator<Character> iter = list.listIterator();

            for (Character c : input) {
                if(c == '<'){
                    if(iter.hasPrevious()) iter.previous();
                }else if(c == '>'){
                    if(iter.hasNext()) iter.next();
                }else if(c == '-'){
                    if(iter.hasPrevious()){
                        iter.previous();
                        iter.remove();
                    }
                }else iter.add(c);
            }

            for (Character c : list) sb.append(c);
            sb.append("\n");
        }    
        System.out.println(sb);
    }
}
