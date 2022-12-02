package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.StringTokenizer;
// 실버 1 Z
// 재귀
public class BOJ_1074 {

    static int r,c,cnt = 0,answer = 0;
    static int[] dx = {0, 0, 1, 1}; 
    static int[] dy = {0, 1, 0, 1}; 

    public static void main(String[] args) throws Exception{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        r = Integer.parseInt(st.nextToken());
        c = Integer.parseInt(st.nextToken());
        int M = (int)Math.pow((double)2,(double)N); // 2의 N승

        if(N == 1){
            for(int i=0;i<4;i++){
                int cx = 0+dx[i];
                int cy = 0+dy[i];
                cnt++;
                if(cx == r && cy == c){
                    answer = cnt;
                    System.out.println(answer == 0 ? 0 : answer-1);
                    return;
                } 
            }
        }

        if(r<M/2 && c<M/2) seperate(0, 0, M/2);
        else if(r<M/2 && c>=M/2){
            cnt = (M/2)*(M/2);
            seperate(0, M/2, M/2);
        }else if(r>=M/2 && c<M/2){
            cnt = (M/2)*(M/2)*2;
            seperate(M/2, 0, M/2);
        }else{
            cnt = (M/2)*(M/2)*3;
            seperate(M/2, M/2, M/2);
        } 
        System.out.println(answer == 0 ? 0 : answer-1);
        // System.out.println(answer-1);
    }

    static void seperate(int x, int y, int M){
        // System.out.println("현재좌표: "+x+" "+y);
        if(M>4){
            if(r<x+M/2 && c<y+M/2 && r>=x && c>=y) seperate(x, y, M/2);
            else if(r<x+M/2 && c>=y+M/2 && r>=x && c>=y){
                cnt += (M/2)*(M/2);
                seperate(x, y+M/2, M/2);
            }else if(r>=x+M/2 && c<y+M/2 && r>=x && c>=y){
                cnt += (M/2)*(M/2)*2;
                seperate(x+M/2, y, M/2);
            }else{
                cnt += (M/2)*(M/2)*3;
                seperate(x+M/2, y+M/2, M/2);
            } 
        }else if(M>2){
            seperate(x, y, M/2);
            seperate(x, y+M/2, M/2);
            seperate(x+M/2, y, M/2);
            seperate(x+M/2, y+M/2, M/2);
        }else if(M==2){
            for(int i=0;i<4;i++){
                int cx = x+dx[i];
                int cy = y+dy[i];
                cnt++;
                if(cx == r && cy == c){
                    answer = cnt;
                    return;
                } 
            }
        }
    }
}

// #1 시간 초과 1사분면 풀일때 너무 오래 걸린다.
// public class BOJ_1074 {

//     static int r,c,cnt = 0,answer = 0;
//     static int[] dx = {0, 0, 1, 1}; 
//     static int[] dy = {0, 1, 0, 1}; 

//     public static void main(String[] args) throws Exception{
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
//         StringTokenizer st = new StringTokenizer(br.readLine());
//         int N = Integer.parseInt(st.nextToken());
//         r = Integer.parseInt(st.nextToken());
//         c = Integer.parseInt(st.nextToken());
//         int M = (int)Math.pow((double)2,(double)N); // 2의 N승

//         if(r<M/2 && c<M/2) seperate(0, 0, M);
//         else if(r<M/2 && c>=M/2){
//             cnt = (M/2)*(M/2);
//             seperate(0, M/2, M/2);
//         }else if(r>=M/2 && c<M/2){
//             cnt = (M/2)*(M/2)*2;
//             seperate(M/2, 0, M/2);
//         }else{
//             cnt = (M/2)*(M/2)*3;
//             seperate(M/2, M/2, M/2);
//         } 
//         System.out.println(answer-1);
//     }

//     static void seperate(int x, int y, int M){
//         // System.out.println("현재좌표: "+x+" "+y);
//         if(M>2){
//             seperate(x, y, M/2);
//             seperate(x, y+M/2, M/2);
//             seperate(x+M/2, y, M/2);
//             seperate(x+M/2, y+M/2, M/2);
//         }if(M==2){
//             for(int i=0;i<4;i++){
//                 int cx = x+dx[i];
//                 int cy = y+dy[i];
//                 cnt++;
//                 if(cx == r && cy == c){
//                     answer = cnt;
//                     return;
//                 } 
//             }
//         }
//     }
// }
