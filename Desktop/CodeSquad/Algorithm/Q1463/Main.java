package Q1463;

import java.io.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 2018.09.04 */
		/*
		 1. 문제
			정수 X에 사용할 수 있는 연산은 다음과 같이 세 가지 이다.
			 a. X가 3으로 나누어 떨어지면, 3으로 나눈다. 
			 b. X가 2로 나누어 떨어지면, 2로 나눈다. 
			 c. 1을 뺀다.
		    정수 N이 주어졌을 때, 위와 같은 연산 세 개를 적절히 사용해서 1을 만들려고 한다. 연산을 사용하는 횟수의 최솟값을 출력하시오.

		 2. 입력
			첫째 줄에 1보다 크거나 같고, 106보다 작거나 같은 자연수 N이 주어진다.

		 3. 출력
			첫째 줄에 연산을 하는 횟수의 최솟값을 출력한다. 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		int[] arr = initArr(n);
		for(int i = 1; i < 100; i++) {
			System.out.println(i + " : " + arr[i]);
		}
		bw.close();
		
	}
	
	public static int getResult(int n) {
		int answer = 0;
		int[] arr = new int[1000000 + 1];
		arr[2] = arr[3] = 1;
		for(int i = 4; i <= n; i++) {
			int num = i;
			answer = 0;
			while(num > 1) {
				if(num % 3 == 0) {
					num /= 3;
				} else if(num % 2 == 0) {
					num /= 2;
				} else {
					break;
				}
				answer++;
			}
			arr[i] = num == 1 ? answer : Math.min(arr[i - 1] + 1, arr[i - 2] + 2) + answer;
		}

		return arr[n];
	}
	
	public static int[] initArr(int n) {
		int[] arr = new int[n + 1];
		
		int result = 0;
		for(int i = 0; (int)Math.pow(2, i) <= n; i++) {
			for(int j = 0; (result = ((int)Math.pow(2, i)) * ((int)Math.pow(3, j))) <= n; j++) {
				arr[result] = i + j;
			}
		}
		
		return arr;
	}

}
