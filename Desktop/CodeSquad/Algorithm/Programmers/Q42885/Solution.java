package Q42885;

import java.util.Arrays;

public class Solution {
    /*
	 	문제 : 구명보트
	 	url : https://programmers.co.kr/learn/courses/30/lessons/42885
	 	재풀이 : X
	*/

    public static int solution(int[] people, int limit) {
        Arrays.sort(people);

        int answer = 0;
        int index = people.length - 1;
        for(int i = 0; i <= index; i++, answer++)
            while(index > i && people[i] + people[index--] > limit)
                answer++;

        return answer;
    }
}
