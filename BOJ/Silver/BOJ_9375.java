package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.StringTokenizer;
// 실버 3 패션왕 신해빈
public class BOJ_9375 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int Case = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while(Case-->0){
            int N = Integer.parseInt(br.readLine());
            HashMap<String, Integer> hash = new HashMap<>();
            ArrayList<String> al = new ArrayList<>();
            int answer = 1;

            for(int i=0;i<N;i++){
                st= new StringTokenizer(br.readLine());
                String item = st.nextToken();
                String cate = st.nextToken();
                if(!al.contains(item)){
                    al.add(item);
                    if(hash.get(cate) == null)
                        hash.put(cate, 1);
                    else hash.put(cate, hash.get(cate)+1);
                }
            }
            for (int val : hash.values()) 
                answer *= val+1;    
            sb.append(answer-1).append("\n");
            // System.out.println(hash.values());
            // System.out.println(hash.keySet());
            // System.out.println(answer-1);
        }
        System.out.println(sb);
    }
}
