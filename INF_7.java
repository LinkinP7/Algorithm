import java.util.*;
// 인프런7 회문 문자열
class INF_7{
	public String solution(String str){
        String answer = "YES";
      	str = str.toUpperCase();
      	char[] c = str.toCharArray();
        int lt = 0, rt = str.length() - 1;
      
      	while(lt < rt){
        	if(c[lt] != c[rt]) answer = "NO";    // 한번이라도 다르면 NO
            lt++; rt--; 
        }
      	return answer;
	}
	public static void main(String[] args){
		INF_7 T = new INF_7();
		Scanner sc = new Scanner(System.in);
      	String str = sc.next();
		System.out.println(T.solution(str));          
        sc.close();
	}
}


// 앞에서 읽을 때나 뒤에서 읽을 때나 같은 문자열을 회문 문자열이라고 합니다. 문자열이 입력되면 해당 문자열이 회문 문자열이면 "YES", 회문 문자열이 아니면 “NO"를 출력하는 프로그램을 작성하세요.
// 단 회문을 검사할 때 대소문자를 구분하지 않습니다.  (토마토, 기러기, 쀼쀼쀼쀼)
// gooG  ->  YES


// #2
// import java.util.*;
// class INF_7{
// 	public String solution(String str){
//         String answer = "NO";
//         str = str.toUpperCase();
//         String s = new StringBuilder(str).reverse().toString();  // StringBuilder로 reverse 시켜 원형과 같나 비교
//       	if(s.equals(str)) answer = "YES";
//       	return answer;
// 	}
// 	public static void main(String[] args){
// 		INF_7 T = new INF_7();
// 		Scanner sc = new Scanner(System.in);
//       	String str = sc.next();
// 		System.out.println(T.solution(str));          
// 	}
// }

// #3
// import java.util.*;
// class INF_7{
// 	public String solution(String str){
//         String answer = "NO";
//         String s = new StringBuilder(str).reverse().toString();
//       	if(s.equalsIgnoreCase(str)) answer = "YES";                  // toUpperCase()를 안해주고 equalIgnoreCase로 비교한다.
//       	return answer;
// 	}
// 	public static void main(String[] args){
// 		INF_7 T = new INF_7();
// 		Scanner sc = new Scanner(System.in);
//       	String str = sc.next();
// 		System.out.println(T.solution(str));          
// 	}
// }