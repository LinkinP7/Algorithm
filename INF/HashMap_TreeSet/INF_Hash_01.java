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