package Q10869;

import java.util.Scanner;

public class Main {
    /*
	 	문제 : 사칙연산
	 	url : https://www.acmicpc.net/problem/10869
	 	재풀이 : X
	*/
    public static void main(String[] args) {
        /* A+B, A-B, A*B, A/B(몫), A%B */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);
    }
}
