package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;
// 실버 1 단축키 지정
// ArrayList, String
public class BOJ_1283 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        int T = Integer.parseInt(br.readLine());
        ArrayList<Character> list = new ArrayList<>();
        StringTokenizer st;
            
        while(T-->0){
            st = new StringTokenizer(br.readLine());
            int cnt = st.countTokens();
            String[] words = new String[cnt];
            boolean[] finish = new boolean[cnt];
            for(int i=0;i<cnt;i++)
                words[i] = st.nextToken();
            
            System.out.println("Input: " + Arrays.toString(words));

            boolean flag = true;
            int idx = 0, wordIdx = 0, wordCnt = 0, quickIdx = 0;
            Loop : 
            while(flag){
                if(wordCnt == cnt) flag = false;
                if(idx == cnt) idx = 0;
                if(wordIdx == 0){
                    char x = words[idx].charAt(wordIdx);
                    System.out.println(x);
                    char y;
                    if(Character.isUpperCase(x)) y = Character.toLowerCase(x);
                    else y = Character.toUpperCase(x);
                    if(!list.contains(x) && !list.contains(y)){
                        list.add(x);
                        String change = "";
                        for(int i=0;i<words[idx].length();i++){
                            if(i == wordIdx) change += "[" + x + "]";
                            else change += words[idx].charAt(i);
                        }
                        words[idx] = change;
                        break;
                    }else{
                        if(idx == cnt-1) wordIdx++; // 앞글자 전부 등록되어 있다면 다음 단계로
                    }
                }else{
                    if(wordIdx < words[idx].length()){ // 한글자가 아니라면
                        for(int i=1;i<words[idx].length();i++){ // 한단어 순회
                            char x = words[idx].charAt(i);
                            System.out.println(x);
                            char y;
                            if(Character.isUpperCase(x)) y = Character.toLowerCase(x);
                            else y = Character.toUpperCase(x);
                            if(!list.contains(x) && !list.contains(y)){
                                list.add(x);
                                String change = "";
                                for(int j=0;j<words[idx].length();j++){
                                    if(j == i) change += "[" + x + "]";
                                    else change += words[idx].charAt(j);
                                }
                                words[idx] = change;
                                break Loop;
                            }
                        }
                    }
                }

                if(wordIdx > 0 && !finish[idx]){
                    wordCnt++;
                    finish[idx] = false;
                } 
                idx++;
            }
            for(String word : words) sb.append(word).append(" ");
            sb.append("\n");
            System.out.println(Arrays.toString(words));
            System.out.println(list);
        }
        System.out.println(sb);
    }
}
// 무슨 프로그램 하나 짜는듯한 문제였다. 꿀잼~

// 제출하진 않았지만 다른 방법이므로 기록, 각 단어의 알파벳을 번갈아가면서 체크하기
// public class BOJ_1283 {
//     public static void main(String[] args) throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int T = Integer.parseInt(br.readLine());
//         ArrayList<Character> list = new ArrayList<>();
//         StringTokenizer st;
            
//         while(T-->0){
//             st = new StringTokenizer(br.readLine());
//             int cnt = st.countTokens();
//             String[] words = new String[cnt];
//             boolean[] finish = new boolean[cnt];
//             for(int i=0;i<cnt;i++)
//                 words[i] = st.nextToken();
            
//             System.out.println("Input: " + Arrays.toString(words));

//             boolean flag = true;
//             int idx = 0, wordIdx = 0, wordCnt = 0;
//             while(flag){
//                 if(wordCnt == cnt) flag = false;
//                 if(idx == cnt) idx = 0;
//                 if(wordIdx < words[idx].length()){
//                     char x = words[idx].charAt(wordIdx);
//                     System.out.println(x);
//                     char y;
//                     if(Character.isUpperCase(x)) y = Character.toLowerCase(x);
//                     else y = Character.toUpperCase(x);
//                     if(!list.contains(x) && !list.contains(y)){
//                         list.add(x);
//                         break;
//                     }else{
//                         if(idx == cnt-1) wordIdx++;
//                     }
//                 }

//                 if(wordIdx >= words[idx].length() && !finish[idx]) wordCnt++;
//                 idx++;
//             }
//             System.out.println(list);

//         }

//     }
// }
