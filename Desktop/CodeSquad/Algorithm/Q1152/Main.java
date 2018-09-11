package Q1152;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		/* 2018.08.08 */
		/*
		 1. 문제
			영어 대소문자와 띄어쓰기만으로 이루어진 문장이 주어진다. 이 문장에는 몇 개의 단어가 있을까? 
			이를 구하는 프로그램을 작성하시오.

		 2. 입력
			첫 줄에 영어 대소문자와 띄어쓰기로 이루어진 문장이 주어진다. 이 문장의 길이는 1,000,000을 넘지 않는다. 
			단어는 띄어쓰기 한 개로 구분되며, 공백이 연속해서 나오는 경우는 없다.

		 3. 출력
			첫째 줄에 단어의 개수를 출력한다.
		 */
		// 396
		/*Scanner sc = new Scanner(System.in);
		String input = getInput(sc);
		
		if(input.charAt(0) == ' ') {
			input = input.substring(1, input.length());
		}
		
		System.out.println(getResult(input));*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		/*int cnt = 0;
		while(st.hasMoreTokens()) {
			st.nextToken();
			cnt++;
		}
		
		bw.write(cnt + "\n");*/
		
		bw.write(st.countTokens() + "\n");
		
		bw.close();
		br.close();

	}
	
	public static String getInput(Scanner sc) {
		return sc.nextLine();
	}
	
	public static boolean checkExcept(String str) {
		if(str.length() >= 1000000) {
			return false;
		} else if(str.contains("  ")) {
			return false;
		} 
		return true;
	}
	
	public static int getResult(String str) {
		String[] splitArr = str.split(" ");

		return splitArr[0].equals("") ? 0: splitArr.length;
	}

}
