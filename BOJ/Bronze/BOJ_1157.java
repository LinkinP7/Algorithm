package BOJ.Bronze;
import java.util.*;
// 브론즈 1 단어 공부
public class BOJ_1157 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.next().toUpperCase();
        char[] word = str.toCharArray();
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        for(char x: word){
            if(map.containsKey(x))
                map.put(x, map.get(x)+1);
            else map.put(x, 1);
        }
        // // Map 조회
        // for (Entry<Character, Integer> entrySet : map.entrySet()) { 
        //     System.out.println(entrySet.getKey() + " : " + entrySet.getValue());
        // } 
        
        int max = 0, count = 0; 
        char answer = ' ';
        for(Map.Entry<Character, Integer> compare : map.entrySet()){
            if(compare.getValue()>max){
                answer = compare.getKey();
                max = compare.getValue();
                count = 0;
            }else if(compare.getValue()==max){
                count++;
            }
            // System.out.println("i:"+idx+" count: "+count);
        }
        if(count > 0) answer = '?';
        System.out.println(answer);
        sc.close();
    }
}
