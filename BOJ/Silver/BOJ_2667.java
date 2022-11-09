package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 실버 1 단지번호붙이기
// DFS
public class BOJ_2667 {

    static int N, cnt=0;
    static char[][] oMap;
    static ArrayList<Integer> size = new ArrayList<>();

    static boolean DFS(int x, int y){
        if(x<=0 || x>N || y<=0 || y>N) return false;
        else{
            if(oMap[x][y] == '1'){
                oMap[x][y] = '0';
                cnt++;
                DFS(x, y-1);
                DFS(x, y+1);
                DFS(x+1, y);
                DFS(x-1, y);
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        N = Integer.parseInt(br.readLine());
        oMap = new char[N+1][N+1];
        int c = 1;
        while(c <= N){
            char[] row = br.readLine().toCharArray();
            for(int i=1;i<=N;i++)
                oMap[c][i] = row[i-1];
            c++;
        }
        int result = 0;
        for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                cnt = 0;
                if(DFS(i, j)){
                    result++;
                    if(cnt > 0) size.add(cnt);
                    // System.out.println(Arrays.deepToString(oMap));
                }
            }
        }
        Collections.sort(size);
        sb.append(result).append("\n");
        for (int a  : size) {
            sb.append(a).append("\n");
        }
        System.out.println(sb);

        // System.out.println("result: " + result);
        // System.out.println(size);
        // System.out.println(Arrays.deepToString(oMap));
    }
}
