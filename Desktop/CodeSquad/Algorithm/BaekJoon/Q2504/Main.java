package Q2504;

import java.io.*;
import java.util.*;

public class Main {
	/*
	 	문제 : 괄호의 값
	 	url : https://www.acmicpc.net/problem/2504
	 	재풀이 : O
	*/

	public static void main(String[] args) throws IOException {
		/* 2018.08.14 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();//"(()[[]])([])"; // 28
		if(!checkValid(input)) {
			bw.write("0" + "\n");
		} else {
			input = input.replace("()", "2");
			input = input.replace("[]", "3");
			
			Stack<Integer> st = new Stack<>();
			char[] arr = input.toCharArray();
			int sum = 0;
			int removeItem;
			for(int i = 0; i < arr.length; i++) {
				if(arr[i] == ')') {
					/* 1. ) -> ( 나올때까지 remove , ] -> push ( 나올때까지 remove */
					sum = 0;
					while(st.size() > 0 && (removeItem = st.pop()) != -1) {
						sum = sum + 2 * (removeItem);
					}
					st.push(sum);
				} else if (arr[i] == ']') {
					sum = 0;
					while(st.size() > 0 && (removeItem = st.pop()) != -2) {
						sum = sum + 3 * (removeItem);
					}
					st.push(sum);
				} else {
					if(arr[i] == '(') {
						st.push(-1);
					} else if (arr[i] == '[') {
						st.push(-2);
					} else {
						st.push((int)arr[i] - 48);
					}
				}
			}
			
			int result = 0;
			while(!st.isEmpty()) {
				result += st.pop();
			}
			
			bw.write(result + "\n");
			
		
		}
		bw.close();
		br.close();
		
	}
	
	public static boolean checkValid(String str) {
		while(str.contains("()") || str.contains("[]")) {
			str = str.replace("()", "");
			str = str.replace("[]", "");
			System.out.println(str);
		}
		
		return str.equals("") ? true : false;
	}
	


}
