package INF.Stack_Queue;

import java.util.*;

public class INF_Stack_01 {
    public static void main(String[] args) {
        Queue<Integer>[] q = new Queue[10];

        for(int i=0;i<10;i++)
            q[i] = new LinkedList<>();

        for(int i=0;i<10;i++)
            q[i].offer(i);

        System.out.println(q[2].poll());    
        System.out.println(q[5].poll());    
        System.out.println(q[8].poll());    
    }
}



// 큐로 
// public static void main(String[] args) {
//     Queue<Integer>[] q = new Queue[10];

//     for(int i=0;i<10;i++)
//         q[i] = new LinkedList<>();

//     for(int i=0;i<10;i++)
//         q[i].offer(i);

//     System.out.println(q[2].poll());    
//     System.out.println(q[5].poll());    
//     System.out.println(q[8].poll());    
// }