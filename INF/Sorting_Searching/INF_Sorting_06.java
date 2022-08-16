package INF.Sorting_Searching;
import java.util.*;
// 인프런 49 장난꾸러기
class INF_Sorting_06{
	public String solution(int N, int[] arr){
		String answer = "";
        boolean Flag = false, find = true;
        int dupIdx = 0;

        for(int i=0;i<N-1;i++){
            if(arr[i] > arr[i+1]){
                if(Flag && find){
                    answer = dupIdx+1 + " " + (i+2);
                    break;    
                }
                
                if(i == N-2 && find){
                    answer = (i+1) + " " + (i+2);
                }else{
                    if(find){
                        answer += (i+1);
                        find = false;
                    }else{
                        answer += " " + (i+2);
                        break;
                    } 
                }
            }else if(arr[i] == arr[i+1]){  // 중복일때 처음 인덱스 저장
                if(!Flag){
                    dupIdx = i;
                    Flag = true;
                } 
            }else Flag = false;
        }
        return answer;
	}
	public static void main(String[] args){
		INF_Sorting_06 T = new INF_Sorting_06();
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
        int[] arr = new int[N];
        for(int i=0;i<N;i++) arr[i] = sc.nextInt();
		System.out.println(T.solution(N, arr));  
        sc.close();
	}
}

// 런타임 에러 -> 1 2 3 5 4 같이 맨 끝에서 둘이 바꾼 경우를 생각 못함, 아마 이것 때문일것이다. 아니었다.. 중복을 컨트롤 못함.. 
// class INF_Sorting_06{
// 	public String solution(int N, int[] arr){
// 		StringBuilder sb = new StringBuilder();
//         boolean Flag = true;
//         for(int i=0;i<N;i++){
//             if(arr[i] > arr[i+1]){
//                 if(Flag){
//                     sb.append(i+1).append(" ");
//                     Flag = false;
//                 }else{
//                     sb.append(i+2); 
//                     break;
//                 } 
//             } 
//         }
//         return sb.toString();
// 	}
// 	public static void main(String[] args){
// 		INF_Sorting_06 T = new INF_Sorting_06();
// 		Scanner sc = new Scanner(System.in);
// 		int N = sc.nextInt();
//         int[] arr = new int[N];
//         for(int i=0;i<N;i++) arr[i] = sc.nextInt();
// 		System.out.println(T.solution(N, arr));  
//         sc.close();
// 	}
// }

// 여기서 런타임 에러
// 30
// 122 123 125 125 128 130 133 137 138 138 140 141 142 143 145 147 149 149 154 154 155 157 161 167 167 167 161 170 173 173  -> 24 27
// 161 161 167 167 167 -> 161 167 167 167 161 이 된 경우 161과 167 을 잡아내야 한다. 

// 새 학기가 시작되었습니다. 철수는 새 짝꿍을 만나 너무 신이 났습니다.
// 철수네 반에는 N명의 학생들이 있습니다.
// 선생님은 반 학생들에게 반 번호를 정해 주기 위해 운동장에 반 학생들을 키가 가장 작은 학생부터 일렬로 키순으로 세웠습니다.
// 제일 앞에 가장 작은 학생부터 반 번호를 1번부터 N번까지 부여합니다. 철수는 짝꿍보다 키가 큽니다.
// 그런데 철수가 앞 번호를 받고 싶어 짝꿍과 자리를 바꿨습니다.
// 선생님은 이 사실을 모르고 학생들에게 서있는 순서대로 번호를 부여했습니다.
// 철수와 짝꿍이 자리를 바꾼 반 학생들의 일렬로 서있는 키 정보가 주어질 때 철수가 받은 번호와 철수 짝꿍이 받은 번호를
// 차례로 출력하는 프로그램을 작성하세요.

// 9
// 120 125 152 130 135 135 143 127 160    ->    3 8

// 오름차순으로 정렬되어있는데 안맞는 곳이 두 곳 존재한다. 이걸 캐치해라, 버블써보자
