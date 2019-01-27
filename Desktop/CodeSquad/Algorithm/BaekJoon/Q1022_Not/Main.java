package Q1022_Not;

import java.io.*;
import java.util.*;

public class Main {
	/*
	 	문제 : 소용돌이 예쁘게 출력하기
	 	url : https://www.acmicpc.net/problem/1022
	 	재풀이 : O
	*/

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int r1 = Integer.parseInt(st.nextToken());
		int c1 = Integer.parseInt(st.nextToken());;
		int r2 = Integer.parseInt(st.nextToken());;
		int c2 = Integer.parseInt(st.nextToken());;
		
		int max = Math.max(Math.abs(r1), Math.max(Math.abs(r2), Math.max(Math.abs(c1), Math.abs(c2))));
		int[][] arr = new int[max * 2 + 1][max * 2 + 1];
		arr[max][max] = 1;
		
		int num = arr.length * arr.length;
		for(int i = 0; i < max; i++) {
			int x = arr.length - 1 - i;
			int y = arr.length - 1 - i;
			for(int j = 0; j < max * 2 - i * 2; j++) {
				arr[x][y] = num;
				y--;
				num--;
			}
			for(int j = 0; j < max * 2 - i * 2; j++) {
				arr[x][y] = num;
				x--;
				num--;
			}
			
			
			for(int j = 0; j < max * 2 - i * 2; j++) {
				arr[x][y] = num;
				y++;
				num--;
			}
			
			
			for(int j = 0; j < max * 2 - i * 2; j++) {
				arr[x][y] = num;
				x++;
				num--;
			}
			
		}
		
		int size = getSize(arr, r1, r2, c1, c2, max);
		printResult(arr, r1, r2, c1, c2, size, max);
	}
	
	public static void printResult(int[][] arr, int r1, int r2, int c1, int c2, int size, int max) {
		for(int i = 0; i < r2 - r1 + 1; i++) {
			for(int j = 0; j < c2 - c1 + 1; j++) {
				System.out.printf("%"+ size +"d ", arr[r1 + max + i][c1 + max + j]);
			}
			System.out.println();
		}
	}
	
	public static int getSize(int[][] arr, int r1, int r2, int c1, int c2, int max) {
		int maxNum = Math.max(Math.max(arr[r1 + max][c1 + max], arr[r1 + max][c2 + max]), Math.max(arr[r2 + max][c1 + max], arr[r2 + max][c2 + max]));
		return Integer.toString(maxNum).length();
	}

}
