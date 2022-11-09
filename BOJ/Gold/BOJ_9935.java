package BOJ.Gold;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 골드 4 문자열 폭발
// Stack
public class BOJ_9935 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] line = br.readLine().toCharArray();
        ArrayList<Character> word = new ArrayList<>();
        for(char x : br.readLine().toCharArray()) word.add(x);
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        int idx = word.size()-1;
        for(char x : line){
            stack.push(x);
            if(stack.size() >= word.size()){  // peek로 비교하면 index Error 발생
                boolean flag = true;
                for(int i=0; i<word.size();i++){
                    if(stack.get(stack.size()-word.size()+i) != word.get(i)){
                        flag = false;
                        break;
                    } 
                }
                if(flag) while(idx-->=0){stack.pop();} 
                idx = word.size()-1;
            }
        }
        for(char x : stack) sb.append(x);
        System.out.println(stack.isEmpty() ? "FRULA" : sb);
    }
}

// 시간초과...
// public class BOJ_9935 {
//     public static void main(String[] args) throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringBuilder sb = new StringBuilder();
//         char[] line = br.readLine().toCharArray();
//         String word = br.readLine();
//         System.out.println(word);
//         for(char x : line){
//             sb.append(x);
//             if(sb.indexOf(word) > -1){
//                 System.out.println(sb + " word : "+word );
//                 sb.replace(sb.length()-word.length(), sb.length(), "");
//                 // sb.delete(sb.length()-1-word.length(), sb.length());
//             }
//         }
//         if(sb.length() < 1) System.out.println("FRULA");
//         else System.out.println(sb);
//     }
// }

// 메모리 초과...
// public class BOJ_9935 {
//     public static void main(String[] args) throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         char[] line = br.readLine().toCharArray();
//         String answer = "";
//         String word = br.readLine();
//         for(char x : line){
//             answer += x;
//             if(answer.contains(word)){
//                 // System.out.println(word + " check "+answer );
//                 answer = answer.replace(word, "");
//             }
//         }
//         if(answer.length() < 1) System.out.println("FRULA");
//         else System.out.println(answer);
//     }
// }

// containsAll 을 하게 되면  [a,a,a,a] 도 a 하나로 true가 된다. aaaa를 쳐내야 하는데 a로 인식하여 index Error 
// public class BOJ_9935 {
//     public static void main(String[] args) throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         char[] line = br.readLine().toCharArray();
//         ArrayList<Character> word = new ArrayList<>();
//         for(char x : br.readLine().toCharArray()) word.add(x);
//         StringBuilder sb = new StringBuilder();
//         Stack<Character> stack = new Stack<>();
//         int idx = word.size()-1;
//         for(char x : line){
//             stack.push(x);
//             if(stack.peek() == word.get(idx) && stack.containsAll(word)){
//                 // System.out.println(stack.containsAll(word)+ " word :" +word);
//                 // System.out.println("check " + stack);
//                 while(idx-->=0){stack.pop();} 
//                 idx = word.size()-1;
//                 // System.out.println(stack);
//             }
//         }
//         if(stack.isEmpty()) System.out.println("FRULA");
//         else{
//             for(char x : stack) sb.append(x);
//             System.out.println(sb);
//         }
//     }
// }
