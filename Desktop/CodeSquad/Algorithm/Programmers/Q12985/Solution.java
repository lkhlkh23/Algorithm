package Q12985;

public class Solution {

    /*
      문제    : 예상 대진표
      url  : https://programmers.co.kr/learn/courses/30/lessons/12985?language=java
      재풀이 : X
    */
    public static int solution(int n, int a, int b) {
        int answer = 0;

        if(a > b) {
            int temp = a;
            a = b;
            b = temp;
        }

        while((n = n / 2) > 0) {
            if(b - a == 1 && a % 2 == 1 && b % 2 == 0) {
                break;
            }
            answer++;
            a = (int)Math.round((double)a / 2);
            b = (int)Math.round((double)b / 2);
        }

        return answer + 1;
    }

}
