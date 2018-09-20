package Q0009;

public class Solution {
	public long solution(int a, int b) {
		/* 두 정수 사이의 합! 
		 *    url : https://programmers.co.kr/learn/courses/30/lessons/12912?language=java
		 * */
		
		long answer = 0;
		for(int i = a; i <= b; i++) {
			answer += i;
		}
		
		return answer;
	}
}
