package Q11401;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		/* 2018.08.21 */
		/*
		 1. 문제
			자연수 과 정수 가 주어졌을 때 이항 계수 를 1,000,000,007로 나눈 나머지를 구하는 프로그램을 작성하시오.

		 2. 입력
			첫째 줄에 N과 K가 주어진다. (1 ≤ N ≤ 4,000,000, 0 ≤ K ≤ N)

	     3. 출력
 			N, K 이항계수를 1,000,000,007로 나눈 나머지를 출력한다. (nCk)
		 */
		// nCk +nC(k+1) = (n+1)C(k+1)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		//int N = Integer.parseInt(st.nextToken());
		//int K = Integer.parseInt(st.nextToken());
		
		//bw.write(loopBinomial(N, K) + "\n");
		for(int i = 0; i <= 10; i++) {
			bw.write(loopBinomial2(10, i) + "\n");
		}
		//bw.write(loopBinomial2(N, K) + "\n");
		br.close();
		bw.close();
		
	}
	
	/* nCk = (n-1)Ck + (n-1C(k-1) */
	public static long loopBinomial(int n, int k) {
		/*
		 * java.lang.OutOfMemoryError: Java heap space 예외 발
		 *  원인 : 자바 힙이 일시적인 과도한 요구 또는 지속적인 누수로 인해 더 이상 요청한 메모리를 할당할 수 없을 때 발생
		 *        특정 프로그램에서 한번에 많은 메모리를 할당하는 경우라면 -Xmx 옵션으로 힙 크기를 늘려서 해결할 수 있으나, 
		 *        지속적 누수로 인한 경우라면 heap dump를 떠서 누수 포인트를 찾아야 한다.
		 * */
		if(n/2 < k) k = n - k;
		boolean state = true; 
		int[][] arr = new int[2][k + 2]; //입력받은 n만큼 배열을 만들면 메모리를 초과하기 때문에 2줄만 잡음! 
		arr[0][0] = 0;
		arr[0][1] = 1;
		for(int i = 1; i <= n; i++) {
			//System.out.print(i + " - > \t");
			for(int j = 1; j <= k+1; j++) {
				if(state) {
					arr[1][j] = (arr[0][j-1] + arr[0][j]) % 1000000007;
					//System.out.print(arr[1][j] + "\t");
				} else {
					arr[0][j] = (arr[1][j-1] + arr[1][j]) % 1000000007;
					//System.out.print(arr[0][j] + "\t");
				}
				if(arr[1][j] == 0) break;
			}
			state = !state;
			
			//System.out.println();
		}
		
		return !state ? arr[1][k+1] : arr[0][k+1];
	}
	
	public static String loopBinomial2(int n, int k) {
		BigInteger result = BigInteger.ONE;
		k = k > (n / 2) ? n - k : k;
		// long result = 1;
		for(int i = 1; i <=k; i++) {
			result = result.multiply(BigInteger.valueOf((n - i + 1))).divide(BigInteger.valueOf(i));
		} 
		return result.mod(BigInteger.valueOf(1000000007)).toString();
	}
	
	
}
