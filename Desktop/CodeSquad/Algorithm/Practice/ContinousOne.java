package Practice;

import java.util.Scanner;

public class ContinousOne {
    /* 2.
        규칙 : 2진수로 표현했을 때 1이 연속으로 나오면 안된다.
        숫자 N을 입력받아 P + Q로 쪼개는데, P, Q가 모두 위 규칙을 만족하게 쪼개는 경우를 찾는경우 가능한 P값 1개를 출력하고, 찾을 수 없으면 -1을 출력하라.

        ex) N = 26 = 11010(2) = 16 + 10 = 10000(2) + 1010(2)  -> 16도 답 가능, 10도 답 가능, 이외에도 가능한 경우 전부 답 가능. */

    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        for (int i = 1; i < n; i++) {
            if(!Integer.toBinaryString(i).contains("11") && !Integer.toBinaryString(n - i).contains("11")) {
                System.out.println(i);
                break;
            }
        }
        /* n자리이면, n-2 ... 0 자리까지 비연속인 것들 */
        /*
        * 11111 연속
        * 11110 연속
        * 11101 연속
        * 11100 연속
        * 11011 연속
        * 11010 연속
        * 11001 연속
        * 11000 연속
        * 10111 연속
        * 10110 연속
        * 10101 비연속
        * 10100 비연속
        * 10011 연속
        * 10010 비연속
        * 10001 비연속
        * 10000 비연속
        * */

        /*
        * 1111 15 연속
        * 1110 14 연속
        * 1101 13 연속
        * 1100 12 연속
        * 1011 11 연속
        * 1010 10 비연속
        * 1001 9 비연속
        * 1000 8 비연속
        * */

        /*
        * 111 연속
        * 110 연속
        * 101 비연속
        * 100 비연속
        * */

        /*
        * 11 연속
        * 10 비연속
        * */
    }
}
