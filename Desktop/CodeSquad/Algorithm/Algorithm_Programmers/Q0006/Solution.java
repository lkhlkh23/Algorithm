package Q0006;

public class Solution {
	public String solution(String[] seoul) {
		/* 서울에서 김서방 찾기! 
		 *  url : https://programmers.co.kr/learn/courses/30/lessons/12919?language=java*/
	      String answer = "";
	      int index = 0;
	      for(String str : seoul) {
	    	  if(str.equals("Kim")) return "김서방은 " + index + "에 있다";
	    	  index++;
	      }
	      return answer;
	}
}
