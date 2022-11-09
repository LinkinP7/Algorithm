package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;
// 실버 4 듣보잡
// ArrayList
public class BOJ_1764 {
    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        int N = Integer.parseInt(st.nextToken()); // 듣도못한
        int M = Integer.parseInt(st.nextToken()); // 보도못한
        Set<String> heard = new HashSet<>();
        ArrayList<String> HS = new ArrayList<>();

        while(N-->0)
            heard.add(br.readLine());
        
        while(M-->0){
            String name = br.readLine().toString();
            if(heard.contains(name)) HS.add(name);
        }

        Collections.sort(HS);
        sb.append(HS.size()).append("\n");
        for (String string : HS) {
            sb.append(string).append("\n");
        }

        System.out.println(sb);    
    }
}
