package BOJ.Gold;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.*;

// 골드 4 PPAP
// Stack
public class BOJ_16120 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] input = br.readLine().toCharArray();
        Stack<Character> PPAP = new Stack<>();
        
        for(int i=0; i<input.length;i++){
            if(input[i]=='P')
                PPAP.add(input[i]);
            else{
                if(PPAP.size()>=2 && i<input.length-1 && input[i+1]=='P'){
                    PPAP.pop();
                    PPAP.pop();
                }else{
                    System.out.println("NP");
                    return;
                }
            }
        }

        if(PPAP.size()==1) System.out.println("PPAP");
        else System.out.println("NP");
    }
}
 
// PPAP 문법에 대해 다시 생각해보자. P P A P 형태로 반드시 맞아야 PPAP가 되며
// A 부분에서 잘못된 경우 다른것들이 잘 조합이 되어도 결국엔 NP가 된다. -> PPAAP , PPAPA
// 1. A 뒤에 P가 없을때
// 2. A 가 와야되는 순서(PP다음 3번째) 가 아닐때 -> PA 순으로 떨어지면 영영 PPAP가 될 수 없다.
// 두 가지의 경우가 되면 절대로 PPAP가 될 수 없으므로 for 문 중간에 return을 해줄 수 있다.
// A 하나만 들어왔을때 for 문에서 바로 리턴되므로, 마지막 결과 출력은 단순히 size 만 비교해주면 된다.  

// #2 예외처리 추가하였지만 시간초과... 재귀로 풀면 안되나? 걍 새로 시작 ㄱㄱ
// public class BOJ_16120 {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         char[] input = br.readLine().toCharArray();
//         long start = System.currentTimeMillis();
//         Stack<Character> PPAP = new Stack<>();
//         Stack<Character> exception = new Stack<>();
//         Stack<Character> inputStack = new Stack<>();
        
//         for(int i=0;i<4;i++){
//             if(i==2) exception.add('A');
//             else exception.add('P');
//         }
//         for (Character ch : input) inputStack.add(ch);
        
//         check(inputStack,PPAP);
//         // System.out.println("RESULT: "+PPAP);

//         // System.out.println(PPAP.equals(exception));

//         if(PPAP.equals(exception) || PPAP.size()==1 && PPAP.pop()=='P') System.out.println("PPAP");
//         else System.out.println("NP");
//         long end = System.currentTimeMillis();

//         System.out.println("실행시간: " + (end-start)/1000.0 +"초");

//         // case : PPPAPAPPAP
//     }

//     private static void check(Stack<Character> inputStack, Stack<Character> PPAP ){
//         int pCnt = 0;
//         boolean aFlag = true;
//         for(Character ch : inputStack) {
//             int N = 2;
//             if(ch == 'P'){
//                 if(pCnt != 2)
//                     pCnt++;
//             } 
//             else{
//                 if(pCnt == 2 && aFlag){
//                     pCnt=3; 
//                     aFlag = false;
//                 }else{
//                     pCnt = 0;
//                     aFlag = true;
//                 } 
//             }
//             if(pCnt == 4 && !aFlag){
//                 if(pCnt<=4) pCnt = 1;
//                 else pCnt -= 3;
//                 while(N-->0)
//                     PPAP.pop();
//                     System.out.println("@@@@:"+PPAP);
//                 // PPAP.add(ch);
//                 Stack<Character> tmp2 = new Stack<>();
//                 check(PPAP, tmp2);
//                 PPAP.clear();
//                 for (Character character : tmp2) 
//                     PPAP.add(character);
//                 tmp2.clear(); 
//                 aFlag = true;
//             }else
//                 PPAP.add(ch);
            
//             N=3; 
//             System.out.println(PPAP + " " + pCnt);
//         }
//     }
// }

// #1 시간초과 및 PPPPPPPPP일때도 PPAP가 성립됨. -> A 컨트롤 해야함, P도 PPAP 문자열이다.
// public class BOJ_16120 {
//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         char[] input = br.readLine().toCharArray();
//         long start = System.currentTimeMillis();
//         Stack<Character> PPAP = new Stack<>();
//         Stack<Character> exception = new Stack<>();
//         Stack<Character> inputStack = new Stack<>();
        
//         for(int i=0;i<4;i++){
//             if(i==2) exception.add('A');
//             else exception.add('P');
//         }
//         for (Character ch : input) inputStack.add(ch);
        
//         check(inputStack,PPAP);
//         // System.out.println("RESULT: "+PPAP);

//         // System.out.println(PPAP.equals(exception));

//         if(PPAP.equals(exception) || input.length > 1 && PPAP.size()==1 && PPAP.pop()=='P') System.out.println("PPAP");
//         else System.out.println("NP");
//         long end = System.currentTimeMillis();

//         System.out.println("실행시간: " + (end-start)/1000.0 +"초");
//         // case : PPPAPAPPAP
//     }

//     private static void check(Stack<Character> inputStack, Stack<Character> PPAP ){
//         int pCnt = 0;
//         boolean aFlag = true;
//         for(Character ch : inputStack) {
//             int N = 3;
//             if(ch == 'P') pCnt++;
//             else{
//                 if(pCnt >= 2 && aFlag){
//                     pCnt=3; 
//                     aFlag = false;
//                 }else{
//                     pCnt = 0;
//                     aFlag = true;
//                 } 
//             }
//             if(pCnt == 4){
//                 if(pCnt<=4) pCnt = 1;
//                 else pCnt -= 3;
//                 while(N-->0)
//                     PPAP.pop();
//                 PPAP.add(ch);
//                 Stack<Character> tmp2 = new Stack<>();
//                 check(PPAP, tmp2);
//                 PPAP.clear();
//                 for (Character character : tmp2) 
//                     PPAP.add(character);
//                 tmp2.clear(); 
//                 aFlag = true;
//             }else
//                 PPAP.add(ch);
            
//             N=3; 
//             System.out.println(PPAP + " " + pCnt);
//         }
//     }
// }
