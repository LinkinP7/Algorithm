package INF;
import java.util.*;
// 인프런5 특정 문자 뒤집기
class INF_5{
	public String solution(String str){
		String answer = "";
     	int lt = 0, rt = str.length()-1;
        char[] c = str.toCharArray();
      	while(lt<rt){
        	if(c[lt]<65 || c[lt]>122 || c[lt] > 90 && c[lt] < 97)   // 특수문자 일때
              lt++;
            else if(c[rt]<65 || c[rt]>122 || c[rt] > 90 && c[rt] < 97)
              rt--;
            else{                         // 소문자,대문자 범위에 들어오는 char 문자만 해당되게
            	char tmp = c[lt];
                c[lt] = c[rt];
                c[rt] = tmp;
                lt++;
                rt--;
            }
        }
        answer = String.valueOf(c);
      
		return answer;
	}
	public static void main(String[] args){
		INF_5 T = new INF_5();
		Scanner sc = new Scanner(System.in);
      	String str = sc.next();
      	System.out.println(T.solution(str));
        sc.close();
	}
}

// 영어 알파벳과 특수문자로 구성된 문자열이 주어지면 영어 알파벳만 뒤집고, 특수문자는 자기 자리에 그대로 있는 문자열을 만들어 출력하는 프로그램을 작성하세요.
// a#b!GE*T@S   ->   S#T!EG*b@a

// #2
// import java.util.*;

// class INF_5{
// 	public String solution(String str){
// 		String answer = "";
//      	int lt = 0, rt = str.length()-1;
//         char[] c = str.toCharArray();
//       	while(lt<rt){
//         	if(!Character.isAlphabetic(c[lt]))
//               lt++;
//             else if(!Character.isAlphabetic(c[rt]))   // 아스키 범위 말고 isAlphabetic, isDigit 등으로 판별하기
//               rt--;
//             else{
//             	char tmp = c[lt];
//                 c[lt] = c[rt];
//                 c[rt] = tmp;
//                 lt++;
//                 rt--;
//             }
//         }
//         answer = String.valueOf(c);
      
// 		return answer;
// 	}

// 	public static void main(String[] args){
// 		INF_5 T = new INF_5();
// 		Scanner sc = new Scanner(System.in);
//       	String str = sc.next();
//       	System.out.println(T.solution(str));
// 	}
// }