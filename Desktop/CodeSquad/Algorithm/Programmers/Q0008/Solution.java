package Q0008;

import java.util.*;

public class Solution {
	public static String[] solution(String[] strings, int n) {
		/* 문자열 내 마음대로
		 *    url : https://programmers.co.kr/learn/courses/30/lessons/12915?language=java */
		String[] answer = new String[strings.length];
		int idx = 0;
		
		for(String str : strings) 
			answer[idx++] = str.charAt(n) + str;
				
		Arrays.sort(answer);
		
		idx = 0;
		for(String str : answer) {
			answer[idx++] = str.substring(1, str.length());
		}
		
		return answer;
	}
	
	public static void main(String[] args) {
		String[] arr = new String[3];
		arr[0] = "SUN";
		arr[1] = "BED";
		arr[2] = "CAR";
		arr = solution(arr, 1);
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
}
