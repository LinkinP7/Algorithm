package INF.String;
import java.util.Scanner;
// 인프런 3 문장 속 단어
class INF_String_03{
	public String solution(String str){
		String answer = "";
        int length = 0;
      	String[] word = str.split(" ");
      	for(String x : word){
        	if(x.length() > length){
            	answer = x;
                length = x.length();
            }
        }
		return answer;
	}
	public static void main(String[] args){
		INF_String_03 T = new INF_String_03();
		Scanner sc = new Scanner(System.in);
		String str = sc.nextLine();
		System.out.println(T.solution(str));  
        sc.close();
	}
}

//한 개의 문장이 주어지면 그 문장 속에서 가장 긴 단어를 출력하는 프로그램을 작성하세요. 문장속의 각 단어는 공백으로 구분됩니다.
// it is time to study
// -> study
// eitoiw iruow witouweiotwiowioei eiiuow e
// -> witouweiotwiowioei
