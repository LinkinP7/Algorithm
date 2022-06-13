import java.util.*;
// 인프런8 유효한 팰린드롬
class INF_8{
	public String solution(String str){
        String answer = "NO";
        str = str.toUpperCase().replaceAll("[^A-Z]", "");    // 대문자 A ~ Z 가 아니면  "" 로 만들어라
        String s = new StringBuilder(str).reverse().toString();
      	if(s.equalsIgnoreCase(str)) answer = "YES";
        
      	return answer;
	}
	public static void main(String[] args){
		INF_8 T = new INF_8();
		Scanner sc = new Scanner(System.in);
      	String str = sc.nextLine();
		System.out.println(T.solution(str));          
        sc.close();
	}
}

// 문자열이 입력되면 해당 문자열이 팰린드롬(회문)이면 "YES", 아니면 “NO"를 출력하는 프로그램을 작성하세요.
// found7, time: study; Yduts; emit, 7Dnuof   ->    YES
// kdjg$@kjkldjkg%@dkjgkj   ->   NO

