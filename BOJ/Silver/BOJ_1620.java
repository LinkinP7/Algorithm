package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.StringTokenizer;
// 실버 4 나는야 포켓몬 마스터 이다솜
// HashMap
public class BOJ_1620 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, String> pokemon = new HashMap<>();
        String[] pokemon2 = new String[N+1];

        for(int i=1;i<=N;i++){
            String poke = br.readLine();
            pokemon.put(poke, String.valueOf(i));
            pokemon2[i] = poke;
        }
        
        while(M-->0){
            String poke = br.readLine();
            if(isNum(poke)) sb.append(pokemon2[Integer.parseInt(poke)]).append("\n");
            else sb.append(pokemon.get(poke)).append("\n");
        }
        System.out.println(sb);
    }

    static boolean isNum(String s){
        char a = s.charAt(0);
        if(a>=48 && a<=57) return true;
        else return false;
    }
}
// 자료구조의 문제가 아닌 조건문 때문에 시간초과가 발생했었음. 
// 아래의 3개의 case는 일단 이름부터 돌고 숫자를 찾으러 들어갔기에 최악의 경우 10만 * 10만 * 20(글자수) 로 2천억번의 연산이 들어가기에 시간초과
// 1억번에 1초정도 이다.
// 그래서 조건문을 나눠 각 10만번*20(글자수)씩만 태워보면 된다. 

// #3 시간 초과... 이게 무슨... contain 때문인가? 번호가 들어온 경우 일단 위에서 containKey로 인해 확인 후 들어가서 그런듯
// public class BOJ_1620 {
//     public static void main(String[] args) throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine());
//         StringBuilder sb = new StringBuilder();
//         int N = Integer.parseInt(st.nextToken());
//         int M = Integer.parseInt(st.nextToken());
//         HashMap<String, String> pokemon = new HashMap<>();
//         String[] pokemon2 = new String[N+1];
//         for(int i=1;i<=N;i++){
//             String poke = br.readLine();
//             pokemon.put(poke, String.valueOf(i));
//             pokemon2[i] = poke;
//         }

//         while(M-->0){
//             String poke = br.readLine();
//             if(pokemon.containsKey(poke))
//                 sb.append(pokemon.get(poke)).append("\n");
            
//             if(pokemon.containsValue(poke))
//                 sb.append(pokemon2[Integer.parseInt(poke)]).append("\n");
//         }
//         System.out.println(sb);
//     }
// }

// #2 시간 초과;;; 리스트 때문인가...
// public class BOJ_1620 {
//     public static void main(String[] args) throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine());
//         StringBuilder sb = new StringBuilder();
//         int N = Integer.parseInt(st.nextToken());
//         int M = Integer.parseInt(st.nextToken());
//         HashMap<String, String> pokemon = new HashMap<>();
//         LinkedList<String> pokemon2 = new LinkedList<>();
//         for(int i=1;i<=N;i++){
//             String poke = br.readLine();
//             pokemon.put(poke, String.valueOf(i));
//             pokemon2.add(poke);
//         }

//         while(M-->0){
//             String poke = br.readLine();
//             if(pokemon.containsKey(poke))
//                 sb.append(pokemon.get(poke)).append("\n");
            
//             if(pokemon.containsValue(poke))
//                 sb.append(pokemon2.get(Integer.parseInt(poke)-1)).append("\n");
//         }
//         System.out.println(sb);
//     }
// }

// #1 시간 초과
// public class BOJ_1620 {
//     public static void main(String[] args) throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine());
//         StringBuilder sb = new StringBuilder();
//         int N = Integer.parseInt(st.nextToken());
//         int M = Integer.parseInt(st.nextToken());
//         HashMap<String, String> pokemon = new HashMap<>();

//         for(int i=1;i<=N;i++){
//             String poke = br.readLine();
//             pokemon.put(poke, String.valueOf(i));
//         }

//         // System.out.println(pokemon);

//         while(M-->0){
//             String poke = br.readLine();
//             if(pokemon.containsKey(poke)){
//                 // System.out.println("@@@@@"+pokemon.get(poke));
//                 sb.append(pokemon.get(poke)).append("\n");
//                 continue;
//             } 
//             for (Map.Entry<String, String> entry : pokemon.entrySet()) {
//                 if (entry.getValue().equals(poke)){
//                     sb.append(entry.getKey()).append("\n");
//                     break;
//                 } 
//             }
//         }
//         System.out.println(sb);
//     }
// }
