package Q0070;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Solution {
    /* 네트워크
     *    url : https://programmers.co.kr/learn/courses/30/lessons/43162 */

    public int solution(int n, int[][] computers) {
        int answer = 0;
        List<Pair> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                list.add(new Pair(computers[i][j], computers[i][j + 1]));
            }
        }
        return answer;
    }

    public class Pair {
        private int first;
        private int second;

        public Pair(int first, int second) {
            this.first = first;
            this.second = second;
        }
    }
}
