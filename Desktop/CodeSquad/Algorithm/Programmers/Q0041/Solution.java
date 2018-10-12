package Q0041;

import java.util.Arrays;

public class Solution {
    /* H-index
        url : https://programmers.co.kr/learn/courses/30/lessons/42747?language=java */
    public static int solution(int[] citations) {
        int answer = 0;
        Arrays.sort(citations);
        for(int i = citations.length - 1; i >= 0; i--) {
            if(citations[i] < answer)
                return answer;

            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 6, 1, 5};
        System.out.println(solution(arr));

        int[] arr2 = {0, 0, 0, 0};
        System.out.println(solution(arr2));
    }

}