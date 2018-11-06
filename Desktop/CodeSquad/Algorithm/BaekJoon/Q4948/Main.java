package Q4948;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {
	/*
	 	문제 : 베트르랑 공준
	 	url : https://www.acmicpc.net/problem/4948
	 	재풀이 : X
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 2018.08.11 */
		/*
		 1. 문제
			베르트랑 공준은 임의의 자연수 n에 대하여, n보다 크고, 2n보다 작거나 같은 소수는 적어도 하나 존재한다는 
			내용을 담고 있다. 예를 들어, 10보다 크고, 20보다 작거나 같은 소수는 4개가 있다. (11, 13, 17, 19) 
			또, 14보다 크고, 28보다 작거나 같은 소수는 3개가 있다. (17,19, 23)
			n이 주어졌을 때, n보다 크고, 2n보다 작거나 같은 소수의 개수를 구하는 프로그램을 작성하시오. 

		 2. 입력	
		 	입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 케이스는 n을 포함하며, 한 줄로 이루어져 있다. (n ≤ 123456)
			입력의 마지막에는 0이 주어진다.

		 3. 출력
			각 테스트 케이스에 대해서, n보다 크고, 2n보다 작거나 같은 소수의 개수를 출력한다.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		boolean[] flags = initPrimeNumber();
		
		int input = 0;
	
		while((input = Integer.parseInt(br.readLine())) != 0) {
			sb.append(countPrimeNumber(flags, input) + "\n");
		}
		
		bw.write(sb.toString());
		
		bw.close();
		br.close();
	}
	
	public static boolean[] initPrimeNumber() { //123456
		boolean[] flags = new boolean[123456 * 2 + 1];
		flags[0] = flags[1] = true;
		
		for(int i = 2; i < flags.length; i++) {
			if(!flags[i]) {
				for(int j = i + i; j <= flags.length; j += i)
					flags[j] = true;
			}
		}
		
		return flags;
	}
	
	public static int countPrimeNumber(boolean[] arr, int n) {
		int cnt = 0;
		for(int i = n + 1; i <= (n * 2); i++) {
			cnt = arr[i] == false ? cnt + 1 : cnt;
		}
		return cnt;
	}
}
