package Q0030;

public class Solution {
    /* 평균구하기!
    *    url : https://programmers.co.kr/learn/courses/30/lessons/12944?language=java */
    public double solution(int[] arr) {
        double answer = 0;
        for(int num : arr) {
            answer += num;
        }
        return answer / arr.length;
    }
}
