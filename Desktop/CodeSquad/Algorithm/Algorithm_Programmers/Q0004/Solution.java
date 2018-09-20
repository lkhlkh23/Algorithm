package Q0004;

import java.util.*;

public class Solution {
	public static int[] solution(int[] arr) {
		List<Integer> list = new ArrayList<>();
		list.add(arr[0]);
		for(int i = 1; i < arr.length; i++) {
			if(arr[i - 1] != arr[i]) {
				list.add(arr[i]);
			}
		}
		
		int[] answer = new int[list.size()];
		int cnt = 0;
		for(int num : list) {
			answer[cnt] = list.get(cnt++);
		}
		return answer;
	}
	
	public static void main(String[] args) {
		int[] arr = {1, 1, 3, 3, 0, 1, 1};
		solution(arr);
	}
}