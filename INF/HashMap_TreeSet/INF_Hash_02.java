package INF.HashMap_TreeSet;
import java.util.*;
// 인프런 32 아나그램(해쉬)
class INF_Hash_02{
	public String solution(String word_A, String word_B){
		String answer = "NO";
        char[] check_A = word_A.toCharArray();
        char[] check_B = word_B.toCharArray();
        HashMap<Character, Integer> hash_A = new HashMap<>();
        HashMap<Character, Integer> hash_B = new HashMap<>();

      	for(char x : check_A){
            if(hash_A.containsKey(x)){
                hash_A.put(x, hash_A.get(x)+1);
            }else hash_A.put(x, 1);
        }

      	for(char x : check_B){
            if(hash_B.containsKey(x)){
                hash_B.put(x, hash_B.get(x)+1);
            }else hash_B.put(x, 1);
        }

        boolean check = false;
        if(hash_A.keySet().equals(hash_B.keySet())){
            check = true;
            for(char x : hash_A.keySet()){
                if(hash_A.get(x) != hash_B.get(x)) check = false; 
            }
        }
        if(check) answer = "YES";
        // System.out.println(hash_A.keySet());
        // System.err.println(hash_A.values());
        // System.out.println(hash_B.keySet());
        // System.err.println(hash_B.values());
		return answer;
	}
	public static void main(String[] args){
		INF_Hash_02 T = new INF_Hash_02();
		Scanner sc = new Scanner(System.in);
		String word_A = sc.next();
		String word_B = sc.next();
		System.out.println(T.solution(word_A, word_B));  
        sc.close();
	}
}