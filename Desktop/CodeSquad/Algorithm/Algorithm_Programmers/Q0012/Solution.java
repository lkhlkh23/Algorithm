package Q0012;

public class Solution {
	/* 수박수박 
	 *   url : https://programmers.co.kr/learn/courses/30/lessons/12922?language=java
	 * */
	public static String solution(int n) {
	      StringBuilder sb = new StringBuilder();
	      for(int i = 0; i < n / 2; i++) 
	    	  sb.append("수박");
	      
	      if(n % 2 == 1) sb.append("수");
	      
	      return sb.toString();
	}

	public static void main(String[] args) {
		System.out.println(solution(4));
		System.out.println(solution(3));
		System.out.println(solution(1));

	}

}
