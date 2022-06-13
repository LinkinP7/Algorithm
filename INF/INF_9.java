package INF;
import java.util.*;
// 인프런9 숫자만 추출
class INF_9{
	public int solution(String str){
        int answer = 0;
		for(char x : str.toCharArray()){
        	// if(x>=48 && x<= 57) answer = answer*10 + (x - 48);   // 문자형 숫자이면 추출, 문자를 숫자로 바꿔서 숫자로 계산
            if(Character.isDigit(x)) answer = answer*10 + (x - 48);
        }
      	return answer;
	}
	public static void main(String[] args){
		INF_9 T = new INF_9();
		Scanner sc = new Scanner(System.in);
      	String str = sc.nextLine();
		System.out.println(T.solution(str));      
        sc.close();    
	}
}
// 문자와 숫자가 섞여있는 문자열이 주어지면 그 중 숫자만 추출하여 그 순서대로 자연수를 만듭니다. 만약 “tge0a1h205er”에서 숫자만 추출하면 0, 1, 2, 0, 5이고 이것을 자연수를 만들면 1205이 됩니다.
// g0en2T0s8eSoft  --> 208


// #2
// import java.util.*;

// class INF_9{
// 	public int solution(String str){
//         int answer = 0;
//         String tmp = "";
// 		for(char x : str.toCharArray()){
//         	if(x>=48 && x<= 57) tmp += x;       // 문자로 받고 숫자로 형변환
//         }
//         answer = Integer.parseInt(tmp);
//       	return answer;
// 	}

// 	public static void main(String[] args){
// 		INF_9 T = new INF_9();
// 		Scanner sc = new Scanner(System.in);
//       	String str = sc.nextLine();
// 		System.out.println(T.solution(str));          
// 	}
// }