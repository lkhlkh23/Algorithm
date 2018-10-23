package Q0058;

import java.util.*;

public class Solution {

    public static int solution(int n) {
        /* 피보나치수
         *    url : https://programmers.co.kr/learn/courses/30/lessons/12945 */
        int[] arr = new int[100000 + 1];
        arr[0] = 0; arr[1] = 1;
        for(int i = 2; i < arr.length; i++) {
            arr[i] = (arr[i - 1] % 1234567 + arr[i - 2] % 1234567) % 1234567;
        }
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(solution(3));

    }

}
