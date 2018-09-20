package Q0010;

import java.util.*;

public class Solution {
	public static String solution(String[] participant, String[] completion) {
		/* 완주하지 못한 선수
		 *   url : https://programmers.co.kr/learn/courses/30/lessons/42576?language=java */
        Arrays.sort(participant);
        Arrays.sort(completion);
        for(int i = 0; i < completion.length; i++) {
        	if(!participant[i].equals(completion[i])) {
        		return participant[i];
        	}
        }
        return participant[participant.length - 1];
    }
	
	public static String solutionByHx(String[] participant, String[] completion) {
		String answer = "";
		Map<String, Integer> map = new HashMap<>();
		for(String person : participant) {
			if(map.containsKey(person)) map.put(person, map.get(person) + 1);
			else map.put(person, 1);
		}
		
		for(String person : completion) {
			if(map.get(person) > 1) map.put(person, map.get(person) - 1);
			else map.remove(person);
		}
		
		Set<String> keySet = map.keySet();
		Iterator<String> it = keySet.iterator();
		while(it.hasNext()) 
			answer = it.next();
		
		
		return answer;
	}
	
	public static void main(String[] args) {
		String[] a = {"l", "k", "e"};
		String[] b = {"e", "k"};
		String name = solutionByHx(a, b);
		System.out.println(name);
	}
}
