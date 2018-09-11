package Q2407;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 2018.08.23 */
		/*
		 1. 문제
			nCm을 출력한다.

		 2. 입력
			n과 m이 주어진다. (5 ≤ n ≤ 100, 5 ≤ m ≤ 100, m ≤ n)

		 3. 출력
			nCm을 출력한다.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int n = Integer.parseInt(st.nextToken());
		int m = Integer.parseInt(st.nextToken());
		
		bw.write(getResult(n, m)+ "\n");
		
		bw.close();
		br.close(); 
	}
	
	public static String getResult(int n, int m) {
		/* (n-1)C(k-1) + (n-1)Ck = nCk */
		long mulNum1 = 1000000000;
		long mulNum2 = 1000000000;
		if(n/2 < m) m = n - m;
		long[][] arr = new long[n + 1][m + 1];
		long[][] mulArr1 = new long[n + 1][m + 1];
		long[][] mulArr2 = new long[n + 1][m + 1];
		arr[0][0] = 1;
		for(int i = 1; i <= n; i++) {
			arr[i][0] = 1;
			for(int j = 1; j <= m; j++) {
				arr[i][j] = (arr[i-1][j-1] + arr[i-1][j]);
				mulArr1[i][j] = mulArr1[i-1][j-1] + mulArr1[i-1][j];
				mulArr2[i][j] = mulArr2[i-1][j-1] + mulArr2[i-1][j];
				while(arr[i][j] > mulNum1) {
					arr[i][j] = arr[i][j] - mulNum1;
					mulArr1[i][j]++;
				} 
				while(mulArr1[i][j] > mulNum2) {
					mulArr1[i][j] = mulArr1[i][j] - mulNum2;
					mulArr2[i][j]++;
				}
			}
		}
		return printResult(mulArr1[n][m], mulArr2[n][m], arr[n][m]);
	}
	
	public static String printResult(long arr1, long arr2, long num) {
		String str = String.valueOf(num);
		String backString = str.length() > 8 ? str.substring(0, str.length()) : addZero(str, 9);
		String frontString = addZero(String.valueOf(arr1), 9);
		String result = arr2 + frontString + backString;

		return removeZero(result);
	}
	
	public static String addZero(String str, int num) {
		String result = str;
		for(int i = 0; i < num - str.length(); i++) {
			result = "0" + result; 
		}
		return result;
	}
	
	public static String removeZero(String str) {
		int i = 0;
		while(str.charAt(i) == '0') {
			i++;
		}
		return str.substring(i, str.length());
	}
}
