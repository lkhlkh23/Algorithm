package Q0014;

import java.util.*;

public class Solution {
	/* 문자열 내림차순으로 배치하기 
	 *    url : https://programmers.co.kr/learn/courses/30/lessons/12917?language=java */
	
	public static String solution(String s) {
		  char[] arr = s.toCharArray();
		  List<Character> list = new ArrayList<>();
		  for(int i = 0; i < s.length(); i++)
			  list.add(s.charAt(i));
		  
		  Collections.sort(list);
		  Collections.reverse(list);
		  
		  StringBuilder sb = new StringBuilder();
		  for(char c : list)
			  sb.append(c);

	      return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(solution("Zbcdefg"));

	}

}
