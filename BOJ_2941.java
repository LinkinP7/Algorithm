import java.util.*;
// 실버 5 크로아티아 알파벳
public class BOJ_2941 {
    public static void main(String[] args) {
        int answer = 0, idx = 0;
        Scanner sc = new Scanner(System.in);
        String str = sc.next(), tmp = "";
        String[] cro = {"dz=","c=","c-","d-","lj","nj","s=","z="};

        while(true){
            int t = str.length()-1, min = str.length()-1; idx = 0;
            boolean flag = false;

            for(int i=0;i<cro.length;i++){
                if(i==0 && str.contains(cro[0])){
                    t = str.indexOf(cro[0]);     
                    flag = true;
                }else if(str.contains(cro[i])){
                    if(min>str.indexOf(cro[i])){
                        idx = i;
                        min = str.indexOf(cro[i]);
                        flag = true;
                    }
                } 
                // System.out.println("t: "+t+" min: "+min);
            }

            if(!flag){
                answer += tmp.length() + str.length();
                // System.out.println("answer: "+answer+" tmp: "+tmp+ " str: "+str+"@@END@@");
                break;
            }else{
                if(t<=min){   // dz= 일 경우
                    tmp += str.substring(0,str.indexOf(cro[0]));
                    str = str.substring(str.indexOf(cro[0])+3);
                    answer += 1;
                }else{       // 나머지일 경우
                    tmp += str.substring(0,str.indexOf(cro[idx]));
                    str = str.substring(str.indexOf(cro[idx])+2);
                    answer += 1;
                }
            }
            // System.out.println("answer: "+answer+" tmp: "+tmp+ " str: "+str);
            // answer += tmp.length() + str.length();
        }
        System.out.println(answer);    
        sc.close();
    }
}