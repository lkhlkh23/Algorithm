package Q0003;

class Solution {
	public static String solution(String s) {
		/* 가운데 글자 가져오기!
		 *   url : https://programmers.co.kr/learn/courses/30/lessons/12903?language=java */
		if(s.length() % 2 == 0) {
			return s.charAt(s.length() / 2 - 1) + "" + s.charAt(s.length() / 2);
		} else {
			return s.charAt(s.length() / 2) + "";
		}
	}
	
	public static void main(String[] args) {
		System.out.println(solution("abcde"));
		System.out.println(solution("abcdef"));
	}
}
