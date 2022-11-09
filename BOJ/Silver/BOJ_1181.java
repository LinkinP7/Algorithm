package BOJ.Silver;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
// 실버 5 단어 정렬
// Set, List
public class BOJ_1181 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int N = Integer.parseInt(br.readLine());
		StringBuilder sb = new StringBuilder();

		List<String> words = new ArrayList<>();
		for(int i=0;i<N;i++){
			String word = br.readLine();
			if(!words.contains(word))
				words.add(word);
		}
		
		Collections.sort(words);

		for(int i=0; i<words.size();i++){
			for(int j=0;j<words.size()-i-1;j++){
				if(words.get(j).length() > words.get(j+1).length()){
					String tmp = words.get(j);
					words.set(j, words.get(j+1));
					words.set(j+1, tmp);
				}
			}
		}
		
		for(String x : words)
			sb.append(x).append("\n");
		
		System.out.println(sb);
	}
}


// public class BOJ_1181 {
// 	public static void main(String[] args) throws Exception{
// 		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
// 		int N = Integer.parseInt(br.readLine());
		
// 		String[] words = new String[N];
		
// 		for (int i = 0; i < words.length; i++) {
// 			words[i] = br.readLine();
// 		}
		
		
// 		String tmp;
		
// 		Arrays.sort(words);
		
// 		for (int i = 0; i < words.length; i++) {
// 			for (int j = 0; j < words.length-1; j++) {
// 				if(words[j].length() > words[j+1].length()) {
// 					tmp = words[j];
// 					words[j] = words[j+1];
// 					words[j+1] = tmp;
// 				}
// 			}
// 		}
		
// 		List<String> result = new ArrayList<String>();
// 		for (int i = 0; i < words.length; i++) {
// 			if(!result.contains(words[i])) {
// 				result.add(words[i]);
// 			}
// 		}
		
// 		for (int i = 0; i < result.size(); i++) {
// 			System.out.println(result.get(i));
// 		}
// 	}
// }
