package BOJ.Bronze;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 브론즈 1 고무오리 디버깅
// 굳이 스택쓸 필요도 없는 문제
public class BOJ_20001 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        // BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "euc-kr"));   charset 을 설정해야 내가 테스트가 가능한데 제출할땐 또 넣으면 틀리네....
        Stack<String> duck = new Stack<>(); 
        String start = br.readLine();
        String input = "";        
        while((input = br.readLine()) != null){
            if(input.equals("고무오리 디버깅 끝")) break;
            if(input.equals("문제")) duck.push(input);
            else{
                if(duck.isEmpty()){
                    duck.push(input);
                    duck.push(input);
                }else duck.pop();
            } 
        }
        System.out.println(duck.isEmpty() ? "고무오리야 사랑해" : "힝구");
    }
}
