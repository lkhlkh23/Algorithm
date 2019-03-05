package Q12982;

import java.util.Arrays;

public class Solution {
      /*
      문제    : 예산
      url  : https://programmers.co.kr/learn/courses/30/lessons/12982?language=java
      재풀이 : X
   */

    public static int solution(int[] d, int budget) {
        Arrays.sort(d);
        int index = 0;

        while(index < d.length && (budget = budget - d[index]) >= 0)
            index++;

        return index;
    }
}
