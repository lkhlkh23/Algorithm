package Q2440;

import java.util.Scanner;

public class Main {
    /*
	 	문제 : 별찍기 - 3
	 	url : https://www.acmicpc.net/problem/2440
	 	재풀이 : X
	*/
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int n = new Scanner(System.in).nextInt();
        for (int i = n; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
