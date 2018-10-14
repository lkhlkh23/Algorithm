package Q0048;

public class Solution {
    /* 124 나라의 숫자
     *    url : https://programmers.co.kr/learn/courses/30/lessons/12899?language=java */
    public static String solution(int n) {
        int[] rest = {1, 2, 4};
        int[] share = {4, 1, 2};
        if(n <= rest.length) {
            return rest[n - 1] + "";
        } else {
            if(n % 3 == 0) {
                return solution(n / 3 - 1) + "" +  share[n % 3];
            } else {
                return solution(n / 3) + "" +  share[n % 3];
            }
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(26));
        System.out.println(solution(25));
        System.out.println(solution(24));
    }
}