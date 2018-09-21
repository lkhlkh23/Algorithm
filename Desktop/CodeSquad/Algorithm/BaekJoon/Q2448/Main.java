package Q2448;

import java.util.*;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 3, 6, 12, 24, 48...
		
		printStar(n);
	}
	
	public static void printStar(int n) {
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < 2 * n -1; j++) {
				if(i == 0) {
					if(j == n - 1) System.out.print("*");
					else System.out.print(" ");
				} else if(i == 1) {
					if(j % 2 == 1) System.out.print("*");
					else System.out.print(" ");
				} else {
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
