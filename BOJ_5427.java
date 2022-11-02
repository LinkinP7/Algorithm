import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

// 골드 4 불
public class BOJ_5427 {

    static int M,N,cnt,answer;
    static char[][] map;
    static boolean[][] fire;
    static int[] dx = {0, -1, 0, 1};
    static int[] dy = {-1, 0, 1, 0};
    // static Queue<int[]> Q = new LinkedList<int[]>();
    static Queue<int[]> Q;
    static boolean survived;

    static void BFS(){
        while(!Q.isEmpty()){
            // System.out.println(Arrays.deepToString(map));
            int[] escape = Q.poll();
            int x = escape[0];
            int y = escape[1];
            int isFire = escape[2];
            
            System.out.println(map[x][y]);
            if(map[x][y] != '*'){
                if(x==0 || y==0 || x==N-1 || y==M-1){
                    survived = true;
                    answer = map[x][y]-'@';
                    Q.clear();
                    break;
                }
            }

            for(int i=0;i<4;i++){
                int cx = x + dx[i];
                int cy = y + dy[i];
                if(cx>=0 && cy>=0 && cx<N && cy<M){
                    if(isFire == 0){
                        if(map[cx][cy] == '.'){
                            map[cx][cy] = (char) (map[x][y] + 1);
                            Q.offer(new int[] {cx, cy, 0});
                        }
                    }else{
                        if(map[cx][cy] != '#' && !fire[cx][cy]){
                            fire[cx][cy] = true;
                            map[cx][cy] = '*';
                            Q.offer(new int[] {cx, cy, 1});
                        }
                    }
                }
            }
        }
    }

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        StringTokenizer st;
        while(T-->0){
            st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            Q = new LinkedList<int[]>();
            map = new char[N][M];
            fire = new boolean[N][M];
            cnt = 1;
            answer = -1;
            survived = false; 

            for(int i=0;i<N;i++){
                map[i] = br.readLine().toCharArray();
                for(int j=0;j<M;j++){
                    if(map[i][j] == '*') Q.offer(new int[] {i,j,1});
                }
            }

            for(int i=0;i<N;i++){
                for(int j=0;j<M;j++){
                    if(map[i][j] == '@'){
                        Q.offer(new int[] {i,j,0});
                        fire[i][j] = true;
                    } 
                }
            }

            BFS();

            // System.out.println("살았니? " + survived + " answer: " + answer);
            // System.out.println(Survived ? answer+1 : "IMPOSSIBLE");

            sb.append(survived ? answer+1 : "IMPOSSIBLE").append("\n");
            // System.out.println(Arrays.deepToString(map));
        }
        System.out.println(sb);
    }
}

// #2 첫 실패에서 반례를 찾을 수 없었다.. 풀이는 다 되나, 출구에 도착했을때 바로 나가야 되는데 옆에 길이 있으면 그것도 타더라;;; 
// Q.clear() 이후 break를 안걸어줘서 밑의 로직에서 다시 큐에 값이 채워져 종료되지 않았다.
// 반레
// 1     
// 3 3
// ..#
// #@#
// ###         
// -->>  3
// 1
// 4 4
// ....
// ....
// ....
// ...@
// -->> 11

// 처음 진행할때 두개의 큐를 썻지만 불이 순서를 안지키고 퍼져버려 길이 막혀버렸다...
// 속성값을 추가해야된다 생각하여 3차원배열을 이용하려 했으나 그냥 큐값에 속성키를 추가해보기로 하였다.
// public class BOJ_5427 {

//     static int M,N,cnt,answer;
//     static char[][] map;
//     static int[] dx = {0, -1, 0, 1};
//     static int[] dy = {-1, 0, 1, 0};
//     static Queue<int[]> Q = new LinkedList<int[]>();
//     static Queue<int[]> Fire = new LinkedList<int[]>();
//     static boolean isSafe, Survived;

//     static void BFS(){
//         while(!Q.isEmpty()){
//             System.out.println(Arrays.deepToString(map));
//             int[] escape = Q.poll();
//             boolean setFire = false;
//             int[] fire;
//             int fX = -1,fY = -1, fCX= -1, fCY = -1;
//             if(!Fire.isEmpty()){
//                 fire = Fire.poll();
//                 fX = fire[0];
//                 fY = fire[1];
//                 setFire = true;
//             } 
//             int eX = escape[0];
//             int eY = escape[1];

//             System.out.println(map[eX][eY]);

//             if(map[eX][eY] == '*') isSafe = false; // 생존체크?
//             else{
//                 isSafe = true;
//                 if(eX==0 || eY==0 || eX==N-1 || eY==M-1){
//                     Survived = true;
//                     answer = map[eX][eY]-'@';
//                     break;
//                 }
//             } 
            
//             for(int i=0;i<4;i++){
//                 if(isSafe){
//                     int eCX = eX + dx[i];
//                     int eCY = eY + dy[i];
//                     if(eCX>=0 && eCY>=0 && eCX<N && eCY<M){
//                         if(map[eCX][eCY] == '.'){
//                             map[eCX][eCY] = (char) (map[eX][eY] + 1);
//                             Q.offer(new int[] {eCX, eCY});
//                         }
//                     }
//                 }
//             }
            
//             for(int i=0;i<4;i++){    
//                 if(setFire){
//                     fCX = fX + dx[i];
//                     fCY = fY + dy[i];
//                     if(fCX>=0 && fCY>=0 && fCX<N && fCY<M){
//                         // System.out.println("TEST ==>>>>> " + map[fCX][fCY]);
//                         if(map[fCX][fCY] != '#'){
//                             if(map[fCX][fCY] != '*'){
//                                 map[fCX][fCY] = '*';
//                                 Fire.add(new int[] {fCX, fCY});
//                             }
//                         }
//                     }    
//                 }
//             }
            
            
//         }
//     }

//     public static void main(String[] args) throws Exception {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         int T = Integer.parseInt(br.readLine());
//         StringBuilder sb = new StringBuilder();
//         StringTokenizer st;
//         while(T-->0){
//             st = new StringTokenizer(br.readLine());
//             M = Integer.parseInt(st.nextToken());
//             N = Integer.parseInt(st.nextToken());
//             map = new char[N][M];
//             cnt = 1;
//             answer = -1;
//             isSafe = true; Survived = false;

//             for(int i=0;i<N;i++){
//                 map[i] = br.readLine().toCharArray();
//                 for(int j=0;j<M;j++){
//                     if(map[i][j] == '@') Q.offer(new int[] {i,j});
//                     else if(map[i][j] == '*') Fire.offer(new int[] {i,j});
//                 }
//             }
//             BFS();
//             System.out.println("살았니? " + Survived + " answer: " + answer);
//             // System.out.println(Survived ? answer+1 : "IMPOSSIBLE");
//             sb.append(Survived ? answer+1 : "IMPOSSIBLE").append("\n");
//             // System.out.println(Arrays.deepToString(map));
//         }
//         System.out.println(sb);
//     }
// }

// 큐를 두개써야할까?
// @ 는 . 을 찾아 이동하며 @가 이동시 기존 자리를 . 으로 바꿔주어야 한다.
// @ 가 이동시 # 이 없는 곳을 찾는다면 탈출 -> OutOfBound 나오지 않을까 걱정?
// * 는 . 을 찾아  * 로 바꿈, @을 찾아버리면 return 해야될듯
// 전체 돌려서 탈출이 된다면 count, 탈출이 안된다면 IMPOSSIBLE