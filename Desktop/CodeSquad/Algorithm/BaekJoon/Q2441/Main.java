package Q2441;

import java.util.Scanner;

public class Main {
    /*
	 	문제 : 별찍기 - 4
	 	url : https://www.acmicpc.net/problem/2441
	 	재풀이 : X
	*/
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        int n = new Scanner(System.in).nextInt();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if(i <= j) sb.append("*");
                else sb.append(" ");
            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
