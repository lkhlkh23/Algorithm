package Q1181;
import java.io.*;
import java.util.*;

public class Main {
	/*
	 	문제 : 단어정렬
	 	url : https://www.acmicpc.net/problem/1181
	 	재풀이 : O
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 1. 문제
		 	알파벳 소문자로 이루어진 N개의 단어가 들어오면 아래와 같은 조건에 따라 정렬하는 프로그램을 작성하시오.

				길이가 짧은 것부터
				길이가 같으면 사전 순으로
		 2. 입력
			첫째 줄에 단어의 개수 N이 주어진다. (1≤N≤20,000) 
			둘째 줄부터 N개의 줄에 걸쳐 알파벳 소문자로 이루어진 단어가 한 줄에 하나씩 주어진다. 
			주어지는 문자열의 길이는 50을 넘지 않는다.
		 

		 3. 출력
			조건에 따라 정렬하여 단어들을 출력한다. 단, 같은 단어가 여러 번 입력된 경우에는 한 번씩만 출력한다.
		*/
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		/* 1. 단어의 갯수 입력 */
		int N = Integer.parseInt(br.readLine());
		/* 2 정렬대상인 단어를 입력하고, Set에 저장 (중복제거를 위해 SET 사용) */
		Set<String> set = new HashSet<>();
		for(int i = 0; i < N; i++) {
			String str = plusLenString(br.readLine());
			set.add(str);
		}
		
		/* 3. 중복 제거를 진행한 입력값을 정렬을 위해 배열에 대입 */
		String[] resultArr = new String[set.size()];
		Iterator<String> it = set.iterator();
		int j = 0;
		while(it.hasNext()) {
			resultArr[j] = it.next();
			j++;
		}
		
		Arrays.sort(resultArr);
		
		for(int i = 0; i < resultArr.length; i++) {
			bw.write(resultArr[i].replaceAll("가", "") + "\n");
		}
		
		bw.close();
		br.close();
	}
	
	public static String plusLenString(String str) {
		int len = str.length();
		for(int i = 0; i < len; i++) {
			str = "가" + str;
		}
		
		return str;
	}
}
