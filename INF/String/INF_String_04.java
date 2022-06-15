package INF.String;
import java.util.*;
// 인프런 4 단어 뒤집기
// #1
class INF_String_04{
	public ArrayList<String> solution(int n, String[] str){
		ArrayList<String> answer = new ArrayList<>();
      	for(String x : str){
         	String tmp = new StringBuilder(x).reverse().toString();   // StringBuilder  사용하기
            answer.add(tmp);
        }  
		return answer;
	}
	public static void main(String[] args){
		INF_String_04 T = new INF_String_04();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
      	String[] str = new String[n];
      	for(int i=0;i<n;i++){
        	str[i] = sc.next(); 
        }  
      	for(String x : T.solution(n,str)){
			System.out.println(x);          
        }  
        sc.close();
	}
}

// 3
// good
// Time
// Big
// -> 
// doog
// emiT
// giB
////////////////////////////////////////////////

// #2
// import java.util.*;

// class INF_4{
// 	public ArrayList<String> solution(int n, String[] str){
// 		ArrayList<String> answer = new ArrayList<>();   // 단어가 하나가 아닌 여러개를 받아 처리해야 하므로 ArrayList 사용
//       	for(String x : str){
//          	char[] s = x.toCharArray();
//             int lt = 0, rt = x.length()-1;   // 밖에서 부터 안으로 서로 바꿔들어간다.    0<->i, 1<->i-1 ....
//           	while(lt<rt){
//               char tmp = s[lt];
//               s[lt] = s[rt];
//               s[rt] = tmp;
//               lt++; rt--;
//             }
//           	String tmp = String.valueOf(s); // valueOf는 static 으로 선언된 메소드, char[] 도 String으로 변환 가능
//             answer.add(tmp);
//         }  
      	
// 		return answer;
// 	}

// 	public static void main(String[] args){
// 		INF_4 T = new INF_4();
// 		Scanner sc = new Scanner(System.in);
// 		int n = sc.nextInt();
//       	String[] str = new String[n];
//       	for(int i=0;i<n;i++){
//         	str[i] = sc.next(); 
//         }  
//       	for(String x : T.solution(n,str)){    // return 값이 ArrayList 이므로 for each 가능
// 			System.out.println(x);          
//         }  
// 	}
// }
