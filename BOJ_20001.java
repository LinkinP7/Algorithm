import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 브론즈 1 고무오리 디버깅
// 굳이 스택쓸 필요도 없는 문제
public class BOJ_20001 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in, "euc-kr"));
        Stack<String> duck = new Stack<>();
        String start = br.readLine(); if()
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
        if(duck.isEmpty()) System.out.println("고무오리야 사랑해");
        else System.out.println("힝구");
    }
}
