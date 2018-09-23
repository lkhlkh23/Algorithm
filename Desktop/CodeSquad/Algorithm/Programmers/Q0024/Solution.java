package Q0024;

import java.util.Arrays;
import java.util.Collections;

public class Solution {
    /* 정수 내림차순으로 배치하기!
     *     url : https://programmers.co.kr/learn/courses/30/lessons/12933?language=java */
    public static long solution(long n) {
        long answer = 0;
        char[] arr = (n + "").toCharArray();
        Arrays.sort(arr);
        int cnt = 0;
        for(char c : arr) {
            answer += ((c - '0') * Math.pow(10, cnt++));
        }
        return answer;
    }

    public static long solution2(long n) {
        char[] arr = (n + "").toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder(new String(arr, 0, arr.length - 1));
        return Long.parseLong(sb.reverse().toString());
    }

    public static void main(String[] args) {
        System.out.println(solution2(1188372));

    }
}
