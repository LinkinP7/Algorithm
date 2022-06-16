
import java.util.*;
// 실버 3 풍선 터뜨리기
public class BOJ_2346 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        LinkedList<Integer> balloon = new LinkedList<>();
        String answer = "";

        for(int i=1;i<=N;i++)
            balloon.add(sc.nextInt());
            
        for(int i=0;i<N;i++){
            
        }


    }

}




// public class BOJ_2346 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int N = sc.nextInt();
//         List<Integer> balloon = new ArrayList<Integer>();
//         List<Integer> pop = new ArrayList<Integer>();
//         int[] check = new int[N];
//         String answer = "";

//         for(int i=0;i<N;i++){
//             check[i] = sc.nextInt();
//             balloon.add(check[i]);
//         }
//         sc.close();

//         answer += 1+" ";
//         check[0] = 0;
//         int idx = 0, x=1, rank = 0;
//         pop.add(balloon.get(0));
//         while(x<N){
//             if(idx+balloon.get(idx) > balloon.size()-1){
//                 if((idx+balloon.get(idx))%balloon.size() == 0){
//                     rank = idx+1;
//                 }else{
//                     rank = (idx+balloon.get(idx))%balloon.size();
//                 }
//             }else if(idx+balloon.get(idx) < 0){
//                 if(Math.abs(balloon.get(idx)) == balloon.size()){
//                     rank = idx-1;
//                 }else{
//                     rank = balloon.size() - 1 - (Math.abs(idx+balloon.get(idx))%balloon.size());
//                 }
//             }else{
//                 rank = idx+balloon.get(idx);
//             }
//             pop.add(balloon.get(rank));

//             // for(int i=0;i<N;i++){
//             //     if(check[i]==balloon.get(rank)){
//             //         answer += i+1+" ";
//             //         check[i] = 0;
//             //         break;
//             //     } 
//             // }

//             balloon.remove(idx);
//             idx = rank-1;
//             x++;
//         }
//         System.out.println(pop);
//         System.out.println(answer);
//     }
// }
