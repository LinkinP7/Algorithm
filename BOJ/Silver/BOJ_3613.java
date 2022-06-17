package BOJ.Silver;
import java.util.*;;
// 실버 3 Java vs C++
public class BOJ_3613 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        sc.close();
        String answer = "";
        String status = "Java";
        // 자바 - 첫 단어 소문자, 그 뒤로는 카멜표기법 -> only alphabet      C++ - 소문자와 '_' 만 사용
        // Input Vaildation Check //////////////
        if(Character.isUpperCase(str.charAt(0)) || !Character.isAlphabetic(str.charAt(0))){
            answer = "Error!";
            System.out.println(answer); return;
        }else if(str.length()>0){
            if(!Character.isAlphabetic(str.charAt(str.length()-1))){
                answer = "Error!";
                System.out.println(answer); return; 
            }
        }
        for(int i=0;i<str.length();i++){
            if(!Character.isAlphabetic(str.charAt(i))){
                if(str.charAt(i) != '_'){
                    answer = "Error!";
                    System.out.println(answer); return;
                }else{
                    if(i>0){
                        if(str.charAt(i-1) == '_'){
                            answer = "Error!";
                            System.out.println(answer); return;
                        }
                    }
                }
                status = "C++";
            }
        }
        ///////////////////////////////////////
        if(status.equals("C++")){
            for(int i=0;i<str.length();i++){
                if(Character.isAlphabetic(str.charAt(i)) && !Character.isLowerCase(str.charAt(i))){
                    answer = "Error!";
                    System.out.println(answer); return; 
                }
            }
            String[] word = str.split("_");
            answer += word[0];
            for(int i=1;i<word.length;i++){
                word[i] = String.valueOf(word[i].charAt(0)).toUpperCase() + word[i].substring(1);
                answer += word[i];
            }
            System.out.println(answer);
        }else if(status.equals("Java")){
            List<Integer> upper = new ArrayList<Integer>();
            System.out.println(upper.size());
            for(int i=0;i<str.length();i++){
                if(!Character.isAlphabetic(str.charAt(i))){
                    answer = "Error!";
                    System.out.println(answer); return; 
                }
                if(Character.isUpperCase(str.charAt(i))) upper.add(i);
            }
            System.out.println(upper.size());
            if(upper.size()>=1){
                int st = 0;
                for(int i=0;i<upper.size();i++){
                    answer += str.substring(st, upper.get(i)).toLowerCase() + "_";
                    st = upper.get(i);
                }
                answer += str.substring(upper.get(upper.size()-1)).toLowerCase();
            }else answer += str;
            System.out.println(answer);
        }
        // System.out.println(status);
        return;
    }
}
