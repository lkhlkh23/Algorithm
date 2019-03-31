package Q2749;

import java.util.Scanner;

public class Main {
	/*
	 	문제 : 피보나치수 3
	 	url : https://www.acmicpc.net/problem/2749
	 	재풀이 : O
	*/

	private static final int PERIOD = 1500000;
	private static final int DIVIDE = 1000000;

	public static void main(String[] args) {
		System.out.println(fibonacci(new Scanner(System.in).nextLong(), PERIOD, DIVIDE));
	}

	public static int fibonacci(long number, int period, int divide) {
		if(number <= 1) return (int)number;
		int[] fibonaccis = new int[(int)(number % period) + 1];
		fibonaccis[1] = fibonaccis[2] = 1;

		for (int i = 3; i < fibonaccis.length; i++)
			fibonaccis[i] = (fibonaccis[i - 2] + fibonaccis[i - 1]) % divide;

		return fibonaccis[fibonaccis.length - 1];
	}

}
