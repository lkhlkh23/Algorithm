package Q0028;

public class Solution {
    /* 최대공약수 최소공배수
     *    url : https://programmers.co.kr/learn/courses/30/lessons/12940?language=java */
    public static int[] solution(int n, int m) {
        int[] answer = new int[2];
        answer[0] = getGCD(n, m);
        answer[1] = n * m / answer[0];
        return answer;
    }

    public static int getGCD(int n, int m) {
        int max = Math.max(n, m);
        int min = Math.min(n, m);
        if(max % min == 0) return min;
        else return getGCD(max - min, min);
    }
}
