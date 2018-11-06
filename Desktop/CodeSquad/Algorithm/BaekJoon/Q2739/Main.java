package Q2739;

import java.util.Scanner;

public class Main {
    /*
	 	문제 : 구구단
	 	url : https://www.acmicpc.net/problem/2739
	 	재풀이 : X
	*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for(int i = 1; i < 10; i++)
            System.out.printf("%d * %d = %d \n", n, i, n * i);
    }
}
