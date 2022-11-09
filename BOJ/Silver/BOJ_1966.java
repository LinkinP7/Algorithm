package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.*;
// 실버 3 프린터 큐   ->  다시풀어보기...
// Queue
public class BOJ_1966 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringBuilder answer = new StringBuilder();
        System.out.println("N: "+N);
        
        while(N-- > 0){
            int count = 0;
            StringTokenizer st = new StringTokenizer(br.readLine());
            int number = Integer.parseInt(st.nextToken());
            int target = Integer.parseInt(st.nextToken());
            System.out.println("number: "+number+" target: "+ target);
            
            LinkedList<int[]> queue = new LinkedList<>();
            st = new StringTokenizer(br.readLine());

            if(number == 1){
                answer.append(number + "\n");
                continue; 
            }

            for(int i=0;i<number;i++){
                queue.offer(new int[] { i, Integer.parseInt(st.nextToken()) });    // get(큐index)[]  -> [0] 배열 인덱스, [1] 배열 값 
            } 

            while(!queue.isEmpty()){
                boolean flag = true;
                int[] check = queue.poll();
                
                for(int i=0;i<queue.size();i++){
                    // System.out.println(check[1] + " " + queue.get(i)[1]);
                    if(check[1] < queue.get(i)[1]){
                        queue.offer(check);
                        for(int j=0;j<i;j++){
                            queue.offer(queue.poll());
                        }
                        flag = false;
                        break;
                    }
                }
                if(!flag) continue;
                
                count++;
                if(check[0] == target){
                    answer.append(count + "\n");
                    break;
                }
            }
        }
        System.out.println(answer);
        // System.out.println(queue.get(0)[0]);
    }
}

// System.out.println(queue.get(0)[1]);
// System.out.println(queue.get(1)[0]);
// System.out.println(queue.get(1)[1]);
// System.out.println(queue.get(2)[0]);
// System.out.println(queue.get(2)[1]);
// System.out.println(queue.get(3)[0]);
// System.out.println(queue.get(3)[1]);
// System.out.println(queue.get(4)[0]);
// System.out.println(queue.get(4)[1]);
// System.out.println(queue.get(7)[1]); 