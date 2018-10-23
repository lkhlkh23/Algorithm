package Q0057;

import java.util.*;
import java.util.StringTokenizer;

public class Solution {
    /*  최대값과 최소값
    *    url  : https://programmers.co.kr/learn/courses/30/lessons/12939 */
    public static String solution(String s) {
        List<Integer> list = new ArrayList<>();
        StringTokenizer st = new StringTokenizer(s);
        while(st.hasMoreTokens()) {
            list.add(Integer.parseInt(st.nextToken()));
        }
        Collections.sort(list);
        return list.get(0) + " " + list.get(list.size() - 1);
    }

    public static String solution2(String s) {
        int max, min;
        StringTokenizer st = new StringTokenizer(s);
        max = min = Integer.parseInt(st.nextToken());
        while(st.hasMoreTokens()) {
            int num = Integer.parseInt(st.nextToken());
            max = Math.max(max, num);
            min = Math.min(min, num);
        }
        return min + " " + max;
    }

    public static void main(String[] args) {
        System.out.println(solution2("-1 -1"));
        System.out.println(solution2("-1 -2 -3 -4"));
        System.out.println(solution2("1 2 3 4"));
    }
}
