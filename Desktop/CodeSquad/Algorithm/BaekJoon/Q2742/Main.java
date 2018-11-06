package Q2742;

import java.util.Scanner;

public class Main {
    /*
	 	문제 : 기찍N
	 	url : https://www.acmicpc.net/problem/2742
	 	재풀이 : X
	*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        for(int i = n; i > 0; i--)
            sb.append(i).append("\n");

        System.out.println(sb.toString());
    }
}
