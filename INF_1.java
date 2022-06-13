import java.util.Scanner;
// 인프런1 문자 찾기  
public class INF_1 {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);
    String input1 = in.next().toLowerCase();
    String input2 = in.next().toLowerCase();
    int count = 0;
    
    for(int i=0;i<input1.length();i++){
    	  if(input2.charAt(0) == input1.charAt(i))
            count++;
    }
    System.out.println(count);
    in.close();
    return ;
  }
}

// 한 개의 문자열을 입력받고, 특정 문자를 입력받아 해당 특정문자가 입력받은 문자열에 몇 개 존재하는지 알아내는 프로그램을 작성하세요. 대소문자를 구분하지 않습니다.문자열의 길이는 100을 넘지 않습니다.
// Computercooler
// c
// --> 2