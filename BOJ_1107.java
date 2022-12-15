import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
// 골드 5 리모컨
// 브루트포스
public class BOJ_1107 {
    static int MIN, MAX;

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String c = br.readLine();
        char[] Target = c.toCharArray();
        boolean[] isBroken = new boolean[10];
        int N = Integer.parseInt(br.readLine());
        if(N == 0){
            System.out.println(Target.length); return;
        }
        StringTokenizer st = new StringTokenizer(br.readLine());
        int cnt = 0;
        if(Integer.parseInt(c) == 100){
            System.out.println(cnt); return;
        }
        

        for(int i=0;i<N;i++){
            int k = Integer.parseInt(st.nextToken());    
            isBroken[k] = true;
        }
        
        for(int i=0;i<10;i++){
            if(!isBroken[i]){
                MIN = i; break;
            }  
        }
        
        for(int i=9;i>=0;i--){
            if(!isBroken[i]){
                MAX = i; break;
            }  
        }
        
        // System.out.println(Arrays.toString(isBroken));
        // System.out.println(Character.getNumericValue('0'));
        

        int answer = Math.abs(100-Integer.parseInt(c));   // +,- 버튼으로만 움직였을때
        answer = Math.min(answer, num_pad(Target, isBroken, c));
        System.out.println(answer);
    }
    
    static int num_pad(char[] Target, boolean[] isBroken, String c){
        String num_pad1 = "", num_pad2 = "";
        for(int i=0;i<Target.length;i++){
            int check = Character.getNumericValue(Target[i]);
            if(!isBroken[check]){
                num_pad1 += Target[i];
                num_pad2 += Target[i];
            }else{
                int cnt = Target.length - i - 1;
                
                for(int j=check+1;j<=10;j++){
                    if(j==10) break;
                    if(!isBroken[j]){
                        num_pad1 += j;
                        break;
                    } 
                }
                for(int j=check-1;j>=-1;j--){
                    if(j==-1) break;
                    if(!isBroken[j]){
                        num_pad2 += j;
                        break;
                    } 
                }
                
                while(cnt-->0){
                    num_pad1 += MIN;
                    num_pad2 += MAX;
                }

                if(check >= MAX){
                    int y = Target.length;
                    num_pad1 = "";
                    for(int k=1;k<=9;k++){
                        if(!isBroken[k]){
                            num_pad1 += k;
                            break;
                        } 
                    }
                    while(y-->0)
                        num_pad1 += MIN;
                }
                break;
            } 
        }

        int min = Integer.MAX_VALUE;
        if((num_pad1.length() >= 1 && Integer.parseInt(num_pad1) == Integer.parseInt(c)) || (num_pad2.length() >= 1 && Integer.parseInt(num_pad2) == Integer.parseInt(c))){
            return Target.length;
        }else{
            if(num_pad1.length()>0 && Integer.parseInt(num_pad1) > 0)
                min = Math.min(min, Math.abs(Integer.parseInt(c) - Integer.parseInt(num_pad1)) + num_pad1.length());
            
            if(num_pad2.length()>0 && Integer.parseInt(num_pad2) > 0)
                min = Math.min(min, Math.abs(Integer.parseInt(c) - Integer.parseInt(num_pad2)) + num_pad2.length());
        }
        return min;
    }
}


// 가장 큰자리 숫자부터 탐색 

// 1555
// 3
// 0 1 9
// -> 670 이 나와야 한다.

// 99999
// 8
// 2 3 4 5 6 7 8 9
// -> 7

// 500000
// 7
// 1 2 4 5 7 8 9   ->  num_pad 를 타면 안됨

// 500000
// 9
// 1 2 3 4 5 6 7 8 9