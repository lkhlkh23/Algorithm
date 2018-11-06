package Q1003;

import java.io.*;
public class Main {
	/*
	 	문제 : 피보나치수 함수
	 	url : https://www.acmicpc.net/problem/1003
	 	재풀이 : X
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 2018.08.12 */
		/*
		 1. 문제 
		 	fibonacci(3)을 호출하면 다음과 같은 일이 일어난다.
			 - fibonacci(3)은 fibonacci(2)와 fibonacci(1) (첫 번째 호출)을 호출한다.
			 - fibonacci(2)는 fibonacci(1) (두 번째 호출)과 fibonacci(0)을 호출한다.
			 - 두 번째 호출한 fibonacci(1)은 1을 출력하고 1을 리턴한다.
			 - fibonacci(0)은 0을 출력하고, 0을 리턴한다.
			 - fibonacci(2)는 fibonacci(1)과 fibonacci(0)의 결과를 얻고, 1을 리턴한다.
			 - 첫 번째 호출한 fibonacci(1)은 1을 출력하고, 1을 리턴한다.
			 - fibonacci(3)은 fibonacci(2)와 fibonacci(1)의 결과를 얻고, 2를 리턴한다.
			1은 2번 출력되고, 0은 1번 출력된다. 
			N이 주어졌을 때, fibonacci(N)을 호출했을 때, 0과 1이 각각 몇 번 출력되는지 구하는 프로그램을 작성하시오.

		 2. 입력
			첫째 줄에 테스트 케이스의 개수 T가 주어진다.
			각 테스트 케이스는 한 줄로 이루어져 있고, N이 주어진다. N은 40보다 작거나 같은 자연수 또는 0이다.

		 3. 출력
			각 테스트 케이스마다 0이 출력되는 횟수와 1이 출력되는 횟수를 공백으로 구분해서 출력한다. 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int[] zeroArr = new int[41];
		int[] oneArr = new int[41];
		initFibonaci(zeroArr, oneArr);
		
		int caseNum = Integer.parseInt(br.readLine());
		for(int i = 0; i < caseNum; i++) {
			int input = i;//Integer.parseInt(br.readLine());
			sb.append(zeroArr[input] + " " + oneArr[input] + "\n");
		}
		
		bw.write(sb.toString());
		
		bw.close();
		br.close();
	}
	
	public static void initFibonaci(int[] zero, int[] one) {
		for(int i = 0; i < zero.length; i++) {
			if(i == 0) zero[i]++;
			else if (i == 1) one[i]++;
			else {
				zero[i]= zero[i - 2] + zero[i - 1];
				one[i]= one[i - 2] + one[i - 1];
			}
		}
	}

}
