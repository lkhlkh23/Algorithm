package Q0025;

public class Solution {
    /* 정수 제곱근 판별!
     *    url : https://programmers.co.kr/learn/courses/30/lessons/12934?language=java */
    public static long solution(long n) {
        double num = Math.pow(n, 0.5);
        if(num == Math.round(num)) return (long)Math.pow(num + 1, 2);
        return -1;
    }

    public static void main(String[] args) {
        System.out.println(solution(90));
        System.out.println(solution(121));
    }
}
