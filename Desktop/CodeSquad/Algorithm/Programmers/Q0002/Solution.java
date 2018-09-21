package Q0002;

class Solution {
	public String solution(int a, int b) {
		/* 2016년 https://programmers.co.kr/learn/courses/30/lessons/12901?language=java */
	      String answer = "";
	      int[] calendar = {31, 29, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
	      String[] days = {"THU", "FRI", "SAT", "SUN", "MON", "TUE", "WED"};
	      int daySum = 0;
	      for(int i = 0; i < a - 1; i++) {
	    	  daySum += calendar[i];
	      }
	      daySum += b;
	      answer = days[daySum % 7];
	      return answer;
	}
}