package Q12982;

import java.util.Arrays;

public class Solution {
      /*
        문제    : KMP는 왜 KMP일까?
        url  : https://www.acmicpc.net/problem/2902
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
