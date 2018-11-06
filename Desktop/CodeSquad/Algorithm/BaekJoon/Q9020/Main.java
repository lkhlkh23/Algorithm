package Q9020;

import java.io.*;
import java.util.*;

public class Main {
	/*
	 	문제 : 골드바흐의 추측
	 	url : https://www.acmicpc.net/problem/9020
	 	재풀이 : X
	*/
	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 2018.08.11 */
		/*
		 1. 문제
			2보다 큰 모든 짝수는 두 소수의 합으로 나타낼 수 있다는 것이다. 이러한 숫자를 골드바흐 숫자라고 한다. 
			또, 짝수를 두 소수의 합으로 나타내는 표현을 그 숫자의 골드바흐 파티션이라고 한다. 
			예를 들면, 4 = 2 + 2, 6 = 3 + 3, 8 = 3 + 5, 10 = 5 + 5, 12 = 5 + 7, 14 = 3 + 11, 
			14 = 7 + 7이다. 10000보다 작은 모든 짝수 n에 대한 골드바흐 파티션은 존재한다.

			2보다 큰 짝수 n이 주어졌을 때, n의 골드바흐 파티션을 출력하는 프로그램을 작성하시오. 
			만약 가능한 n의 골드바흐 파티션이 여러가지인 경우에는 두 소수의 차이가 가장 작은 것을 출력한다.

		 2. 입력
			첫째 줄에 테스트 케이스의 개수 T가 주어진다. 
			각 테스트 케이스는 한 줄로 이루어져 있고 짝수 n이 주어진다. (4 ≤ n ≤ 10,000)

	     3. 출력
			각 테스트 케이스에 대해서 주어진 n의 골드바흐 파티션을 출력한다. 
			출력하는 소수는 작은 것부터 먼저 출력하며, 공백으로 구분한다.
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		boolean[] primeArr = initPrimeNumber();
		
		int caseNum = Integer.parseInt(br.readLine());
		for(int i = 0; i < caseNum; i++) {
			int input = Integer.parseInt(br.readLine());
			for(int j = (input / 2); j >= 2; j--) {
				if(primeArr[j] == false && primeArr[input - j] == false) {
					/* 각 값에 차이중 최소값을 검증하는 로직 불필요 
					 * ::j 와 n - j 의 차이는 2n - j 이므로 j가 가장 클때 차이가 가장 적음 
					 *   그렇기 때문에 j가장 클 때, 멈추면 그만!
					 */
					sb.append(j + " " + (input - j) + "\n");
					break;
				}
			}
		}
		
		bw.write(sb.toString());
		
		bw.close();
		br.close();
	}
	
	public static boolean[] initPrimeNumber() {
		boolean[] flags = new boolean[10000 + 1];
		flags[0] = flags[1] = true;
		for(int i = 2; i < flags.length; i++) {
			if(!flags[i]) {
				for(int j = i + i; j < flags.length; j+=i) {
					flags[j] = true;
				}
			}
		}
		
		return flags;
	}
}
