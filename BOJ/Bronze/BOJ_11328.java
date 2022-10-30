package BOJ.Bronze;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.StringTokenizer;
// 브론즈 2 Strfry
public class BOJ_11328 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;

        while(N-->0){
            st = new StringTokenizer(br.readLine());
            char[] input1 = st.nextToken().toCharArray();
            char[] input2 = st.nextToken().toCharArray();
            HashMap<Character, Integer> hash1 = new HashMap<>();
            HashMap<Character, Integer> hash2 = new HashMap<>();

            for (char c : input1) {
                if(hash1.get(c) == null) hash1.put(c, 1);
                else hash1.put(c, hash1.get(c)+1);
            }
            
            for (char c : input2) {
                if(hash2.get(c) == null) hash2.put(c, 1);
                else hash2.put(c, hash2.get(c)+1);
            }

            if(hash1.equals(hash2)) sb.append("Possible").append("\n");
            else sb.append("Impossible").append("\n");

            // System.out.println(hash1);
            // System.out.println(hash2);
            // System.out.println(hash1.equals(hash2));
        }
        System.out.println(sb);

    }
}
