package Q10430;

import java.util.Scanner;

public class Main {
    /*
	 	문제 : 나머지
	 	url : https://www.acmicpc.net/problem/10430
	 	재풀이 : X
	*/
    public static void main(String[] args) {
        /* 첫째 줄에 (A+B)%C, 둘째 줄에 (A%C + B%C)%C, 셋째 줄에 (A×B)%C, 넷째 줄에 (A%C × B%C)%C를 출력한다. */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        System.out.println((a + b) % c);
        System.out.println((a % c + b % c) % c);
        System.out.println((a * b) % c);
        System.out.println((a % c * b % c) % c);
    }
}
