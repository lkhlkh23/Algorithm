package Q0005;

import java.util.*;

public class Solution {
	public int[] solution(int[] arr, int divisor) {
		/* 나누어 떨어지는 숫자 배열 
		 *  url : https://programmers.co.kr/learn/courses/30/lessons/12910?language=java */
		
		List<Integer> list = new ArrayList<>();
		int cnt = 0;
	    for(int num : arr) 
	    	if(num % divisor == 0) list.add(num); 
	    Collections.sort(list);
	    int[] answer = new int[list.size() > 0 ? list.size() : 1];
	    answer[0] = -1;
	    for(int num : list) answer[cnt++] = num;
	    
		return answer;
	}
}
