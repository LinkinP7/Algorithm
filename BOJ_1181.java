import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
// 실버 5 단어 정렬
public class BOJ_1181 {
	public static void main(String[] args) throws Exception{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int N = Integer.parseInt(br.readLine());
		
		String[] words = new String[N];
		
		for (int i = 0; i < words.length; i++) {
			words[i] = br.readLine();
		}
		
		
		String tmp;
		
		Arrays.sort(words);
		
		for (int i = 0; i < words.length; i++) {
			for (int j = 0; j < words.length-1; j++) {
				if(words[j].length() > words[j+1].length()) {
					tmp = words[j];
					words[j] = words[j+1];
					words[j+1] = tmp;
				}
			}
		}
		
		List<String> result = new ArrayList<String>();
		for (int i = 0; i < words.length; i++) {
			if(!result.contains(words[i])) {
				result.add(words[i]);
			}
		}
		
		for (int i = 0; i < result.size(); i++) {
			System.out.println(result.get(i));
		}
	}
}
