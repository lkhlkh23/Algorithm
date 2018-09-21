package Q0019;

public class Solution {
    /* 문자열을 정수로 바꾸끼!
     *     url : https://programmers.co.kr/learn/courses/30/lessons/12925?language=java  */
    public static int solution(String s) {
        try {
            return Integer.parseInt(s);
        } catch (Exception e) {
            if(s.charAt(0) == '-') return Integer.parseInt(s.substring(1, s.length())) * -1;
            return Integer.parseInt(s.substring(1, s.length()));
        }
    }

    public static int solution2(String s) {
        return Integer.parseInt(s);
    }

    public static void main(String[] args) {
        System.out.println(solution("232"));
        System.out.println(solution("-232"));
        System.out.println(solution("+232"));
    }
}
