package Q0029;

public class Solution {
    /* 콜라츠의 추측
     *    url : https://programmers.co.kr/learn/courses/30/lessons/12943?language=java */
    public static int solution(int num) {
        int answer = 0;
        while(num != 1) {
            num = num % 2 == 0 ? num / 2 : num * 3 + 1;
            answer++;
            System.out.println(num + " : " + answer);
            if(answer == 500) return -1;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(626332));
        //solution(solution(16));
    }
}
