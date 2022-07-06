package INF.HashMap_TreeSet;
import java.util.HashMap;
import java.util.Scanner;
// 인프런 31 학급 회장(해쉬)
class INF_Hash_01{
	public String solution(int N, char[] vote){
		String answer = "";
        HashMap<Character, Integer> hash = new HashMap<>();

      	for(char x : vote){
            if(hash.containsKey(x)){
                hash.put(x, hash.get(x)+1);
            }else hash.put(x, 1);
        }
        System.out.println(hash.keySet());
        System.err.println(hash.values());

        int value = 0; char c  = ' ';
        for(char x : hash.keySet()){
            if(hash.get(x) > value){
                value = hash.get(x);
                c = x;
            }
        }
        answer += c;
		return answer;
	}
	public static void main(String[] args){
		INF_Hash_01 T = new INF_Hash_01();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        char[] vote = new char[N];
        vote = sc.next().toCharArray();
		System.out.println(T.solution(N, vote));  
        sc.close();
	}
}

// 학급 회장을 뽑는데 후보로 기호 A, B, C, D, E 후보가 등록을 했습니다.
// 투표용지에는 반 학생들이 자기가 선택한 후보의 기호(알파벳)가 쓰여져 있으며 선생님은 그 기호를 발표하고 있습니다.
// 선생님의 발표가 끝난 후 어떤 기호의 후보가 학급 회장이 되었는지 출력하는 프로그램을 작성하세요.
// 반드시 한 명의 학급회장이 선출되도록 투표결과가 나왔다고 가정합니다.

// 15
// BACBACCACCBDEDE      ->    C


// class Main {	
// 	public char solution(int n, String s){
// 		char answer=' ';
// 		HashMap<Character, Integer> map=new HashMap<>();
// 		for(char x : s.toCharArray())
// 			map.put(x, map.getOrDefault(x, 0)+1); // getOrDefault -> 키가 존재하면 값을 가져오고 아니라면 지정값을 리턴한다.
                                                  // 키가 없을 수도 있으므로 중요한 메소드이다. 굳이 조건문으로 나눠줄 필요 없다.
                                                  // 특정키 유무파악은 containsKey(x);                                                                
		
// 		int max=Integer.MIN_VALUE;
// 		for(char key : map.keySet()){
// 			if(map.get(key)>max){
// 				max=map.get(key);
// 				answer=key;
// 			}
// 		}
// 		return answer;
// 	}

// 	public static void main(String[] args){
// 		Main T = new Main();
// 		Scanner kb = new Scanner(System.in);
// 		int n=kb.nextInt();
// 		String str=kb.next();
// 		System.out.println(T.solution(n, str));
// 	}
// }