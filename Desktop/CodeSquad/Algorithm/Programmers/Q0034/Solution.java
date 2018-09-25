package Q0034;

public class Solution {
    /* x만큼 간격이 있는 n개의 숫자
     *    url : https://programmers.co.kr/learn/courses/30/lessons/12954?language=java */
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        answer[0] = x;
        for (int i = 1; i < n; i++)
            answer[i] = answer[i - 1] + x;

        return answer;
    }
}
