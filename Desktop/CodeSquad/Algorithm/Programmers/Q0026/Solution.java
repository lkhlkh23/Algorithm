package Q0026;

import java.util.Arrays;

public class Solution {
    /* 제일 작은수 제거하기!
     *    url : https://programmers.co.kr/learn/courses/30/lessons/12935?language=java  */
    public int[] solution(int[] arr) {
        int min = Integer.MAX_VALUE;
        for(int n : arr)
            min = Math.min(min, n);


        int[] answer = new int[arr.length == 1 ? 1 : arr.length - 1];
        answer[0] = -1;
        int cnt = 0;
        for(int num : arr) {
            if(num == min) continue;
            answer[cnt++] = num;
        }
        return answer;
    }
}
