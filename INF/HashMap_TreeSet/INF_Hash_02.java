package INF.HashMap_TreeSet;
import java.util.*;
// 인프런 32 아나그램(해쉬)
class INF_Hash_02{
	public String solution(String word_A, String word_B){
		String answer = "YES";
        HashMap<Character, Integer> hash = new HashMap<>();

      	for(char x : word_A.toCharArray())
            hash.put(x, hash.getOrDefault(x, 0)+1);   

      	for(char x : word_B.toCharArray()){
           if(!hash.containsKey(x) || hash.get(x) == 0) return "NO";
           else hash.put(x, hash.get(x)-1);
        }
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

// Anagram이란 두 문자열이 알파벳의 나열 순서를 다르지만 그 구성이 일치하면 두 단어는 아나그램이라고 합니다.
// 예를 들면 AbaAeCe 와 baeeACA 는 알파벳을 나열 순서는 다르지만 그 구성을 살펴보면 A(2), a(1), b(1), C(1), e(2)로
// 알파벳과 그 개수가 모두 일치합니다. 즉 어느 한 단어를 재 배열하면 상대편 단어가 될 수 있는 것을 아나그램이라 합니다.
// 길이가 같은 두 개의 단어가 주어지면 두 단어가 아나그램인지 판별하는 프로그램을 작성하세요. 아나그램 판별시 대소문자가 구분됩니다.

// AbaAeCe
// baeeACA    ->   YES
// abaCC
// Caaab      ->   NO


// 처음에 푼 것
// class INF_Hash_02{
// 	public String solution(String word_A, String word_B){
// 		String answer = "NO";
//         char[] check_A = word_A.toCharArray();
//         char[] check_B = word_B.toCharArray();
//         HashMap<Character, Integer> hash = new HashMap<>();
//         HashMap<Character, Integer> hash_B = new HashMap<>();

//       	for(char x : check_A){
//             if(hash.containsKey(x)){
//                 hash.put(x, hash.get(x)+1);
//             }else hash.put(x, 1);
//         }

//       	for(char x : check_B){
//             if(hash_B.containsKey(x)){
//                 hash_B.put(x, hash_B.get(x)+1);
//             }else hash_B.put(x, 1);
//         }

//         boolean check = false;
//         if(hash.keySet().equals(hash_B.keySet())){
//             check = true;
//             for(char x : hash.keySet()){
//                 if(hash.get(x) != hash_B.get(x)) check = false; 
//             }
//         }
//         if(check) answer = "YES";
//         // System.out.println(hash.keySet());
//         // System.err.println(hash.values());
//         // System.out.println(hash_B.keySet());
//         // System.err.println(hash_B.values());
// 		return answer;
// 	}
// 	public static void main(String[] args){
// 		INF_Hash_02 T = new INF_Hash_02();
// 		Scanner sc = new Scanner(System.in);
// 		String word_A = sc.next();
// 		String word_B = sc.next();
// 		System.out.println(T.solution(word_A, word_B));  
//         sc.close();
// 	}
// }

