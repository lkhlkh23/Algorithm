package Q0011;

import java.util.ArrayList;
import java.util.Collections;

public class Solution {
	/* k 번쨰  
	 *   url : https://programmers.co.kr/learn/courses/30/lessons/42748?language=java */
	
	public static int[] solution(int[] array, int[][] commands) {
        int[] answer = new int[commands.length];
        for(int i = 0; i < commands.length; i++) {
        	int first = commands[i][0] - 1;
        	int last = commands[i][1] - 1;
        	int k = commands[i][2] - 1;
        	ArrayList<Integer> list = new ArrayList<>();
        	for(int j = first; j <= last; j++) 
        		list.add(array[j]);
        	
        	Collections.sort(list);
        	answer[i] = list.get(k);
        }
        return answer;
    }

	public static void main(String[] args) {
		//[1, 5, 2, 6, 3, 7, 4]	[[2, 5, 3], [4, 4, 1], [1, 7, 3]]	[5, 6, 3]
		int[] arr = {1, 5, 2, 6, 3, 7, 4};
		int[][] cmd = {{2, 5, 3}, {4, 4, 1}, {1, 7, 3}};
		int[] result = solution(arr, cmd);
		for(int a : result)
			System.out.print(a + "\t");
	}

}
