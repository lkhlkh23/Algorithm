package Q0023;

import java.util.*;

public class Solution {
    /* 예산
     *      url  : https://programmers.co.kr/learn/courses/30/lessons/12982?language=java */
    public static int solution(int[] d, int budget) {
        int answer = 0;
        int sum = 0;
        for(int n : d)
            sum += n;

        int rest = budget - sum;
        sum = 0;
        for(int i = 0; i < d.length; i++) {
            for(int j = 0; j < d.length; j++) {
                //if(rest == sum)
            }
        }

        Arrays.sort(d);
        return answer;
    }

    public static int recursive(List<Integer> list, int n, int complete) {
        int[] arr = new int[3];
        for(int i = 1; i <= n; i++) {
            arr.
        }
    }

    public static void main(String[] args) {
        int[] d = {1,3,2,5,4};
        System.out.println(solution(d, 9)); // 1 3 5

        int[] d2 = {1,1,1,5,4};
        System.out.println(solution(d2, 9)); // 4 5
    }
}
