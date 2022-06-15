package INF.String;
import java.util.Scanner;
// 인프런 2 대소문자 변환
class INF_String_02{
	public String solution(String str){
		String answer = "";
      	for(char x : str.toCharArray()){
        	if(Character.isLowerCase(x)) answer += Character.toUpperCase(x);
          	else answer += Character.toLowerCase(x);    // String 은 바로 toUpperCase() 붙여 사용 가능하지만, char 는 Character.toUppercase(x) 로 사용해야 한다.
        }
		return answer;
	}
	public static void main(String[] args){
		INF_String_02 T = new INF_String_02();
		Scanner sc = new Scanner(System.in);
		String str = sc.next();
		System.out.println(T.solution(str)); 
        sc.close();
	}
}

// 대문자와 소문자가 같이 존재하는 문자열을 입력받아 대문자는 소문자로 소문자는 대문자로 변환하여 출력하는 프로그램을 작성하세요.
// StuDY   ->   sTUdy
