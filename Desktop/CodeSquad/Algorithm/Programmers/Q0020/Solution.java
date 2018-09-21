package Q0020;

public class Solution {
    public static int solution(int n) {
        int answer = 0;
        for(int i = 1; i <= n; i++) {
            if(n % i == 0) {
                answer += i;
                System.out.println(i);
            }
        }
        return answer;
    }

    public static int solution2(int n) {
        /* 2가 가장 작은수라서! 수의 절반이상부터는 약수가 존재할 수 없음! */
        int answer = 0;
        for(int i = 1; i <= n / 2; i++) {
            if(n % i == 0) {
                answer += i;
            }
        }
        return answer + n;
    }

    public static void main(String[] args) {
        System.out.println(solution(12));
    }
}
