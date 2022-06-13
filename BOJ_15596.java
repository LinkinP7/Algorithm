// 브론즈 2 정수 N개의 합
public class BOJ_15596 {
    long sum(int[] a){
        long answer = 0;
        for(int i=0;i<a.length;i++)
            answer += a[i];            
        return answer;
    }
}
