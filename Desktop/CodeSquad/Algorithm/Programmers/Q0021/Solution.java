package Q0021;

public class Solution {
    /* 자릿수 더하기
     *    url :  https://programmers.co.kr/learn/courses/30/lessons/12931?language=java */
    public static int solution(int n) {
        int answer = 0;

        char[] arr = (n + "").toCharArray();
        for(char c : arr)
            answer += (int)c - '0';


        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(123));
    }
}
