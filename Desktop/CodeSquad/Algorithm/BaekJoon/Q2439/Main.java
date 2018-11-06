package Q2439;

import java.util.Scanner;

public class Main {
    /*
	 	문제 : 별찍기 - 2
	 	url : https://www.acmicpc.net/problem/2439
	 	재풀이 : X
	*/
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j >= 0; j--) {
                if(i >= j) sb.append("*");
                else sb.append(" ");

            }
            sb.append("\n");
        }

        System.out.println(sb.toString());
    }
}
