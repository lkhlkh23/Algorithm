package Q11051;

import java.io.*;
import java.util.*;

public class Main {
	/*
	 	문제 : 이항계수 2
	 	url : https://www.acmicpc.net/problem/11051
	 	재풀이 : O
	*/

	public static void main(String[] args) throws IOException {
		/* 2018.08.21 */
		/*
		 1. 문제
			자연수 과 정수 가 주어졌을 때 이항 계수 를 1,007로 나눈 나머지를 구하는 프로그램을 작성하시오.

		 2. 입력
			첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 1,000, 0 ≤ K ≤ N)

	     3. 출력
 			N, K 이항계수를 1,007로 나눈 나머지를 출력한다. (nCk)
		 */
		// nCk +nC(k+1) = (n+1)C(k+1)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		bw.write(loopBinomial(N, K) + "\n");
		
		br.close();
		bw.close();
		
	}
	
	/* 1. 재귀함수로 구현 --> 재귀횟수가 많아지면 스택오버플로우 발생 */
	public static long binomialRecursive(int n, int k) {
		if(k > n/2) k = n - k;
		if(k < 0 || k > n) {
			return 0;
		} else if (k == 1) {
			return n;
		} else {
			return binomialRecursive(n-1, k-1)%1000000007 + binomialRecursive(n-1, k)%1000000007;
		}
	}
	
	/* 2. n!/(k!*(n-k)!) 를 이용해서 구현 --> 숫자가 커지면 오류 발생 */
	public static long binomial(int n, int k) {
		long[] factorialArr = new long[n + 1];
		long result = 1;
		if(n/2 < k) k= n-k; // nCk = nC(n-k)
		for(int i = 1; i <= n; i++) {
			result = (result * i);
			factorialArr[i] = result;
			System.out.println("i : "+ i + "   " + factorialArr[i]);
		}
		
		return (factorialArr[n] / (factorialArr[k] * factorialArr[n - k]))%1000000007;
	}
	
	/* nCk = (n-1)Ck + (n-1C(k-1) */
	public static long loopBinomial(int n, int k) {
		if(n/2 < k) k = n - k;
		long[][] arr = new long[n+2][n+2];
		arr[0][0] = 0;
		arr[0][1] = 1;
		for(int i = 1; i < arr.length; i++) {
			for(int j = 1; j <= i; j++) {
				arr[i][j] = (arr[i-1][j-1] + arr[i-1][j]) % 10007;
			}
		}
		
		return arr[n+1][k+1];
	}

}
