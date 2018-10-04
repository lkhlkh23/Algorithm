package Q2448;

import java.util.*;

public class Main {
	static boolean[][] arr;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt(); // 3, 6, 12, 24, 48...
		arr = new boolean[2 * n][2 * n]; // 인덱스는 1부터 시작!
		for(int i = 1; i <=n; i+=3) {
			//init
		}
	}
	
	public static void initStar(int height, int n) {
		arr[height][n] = true;
		arr[height + 1][n - 1] = arr[height + 1][n + 1] = true;
		arr[height + 2][n - 2] = arr[height + 2][n - 1] = arr[height + 2][n] = arr[height + 2][n + 1] = arr[height + 2][n + 2] = true;
	}

	public static void printStar() {
		StringBuilder sb = new StringBuilder();
		for(int i = 1; i < arr.length; i++) {
			for(int j = 1; j < arr[i].length; j++) {
				sb.append(arr[i][j] ? '*' : ' ');
			}
			sb.append("\n");
		}
		System.out.println(sb.toString());
	}
}
