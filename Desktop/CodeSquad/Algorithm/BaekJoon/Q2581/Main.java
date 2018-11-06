package Q2581;

import java.io.*;

public class Main {
	/*
	 	문제 : 소수
	 	url : https://www.acmicpc.net/problem/2581
	 	재풀이 : O
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 2018.08.10 */
		/*
		 1. 문제
			자연수 M과 N이 주어질 때 M이상 N이하의 자연수 중 소수인 것을 모두 골라 이들 소수의 합과 최소값을 찾는 
			프로그램을 작성하시오. 예를 들어 M=60, N=100인 경우 60이상 100이하의 자연수 중 소수는 
			61, 67, 71, 73, 79, 83, 89, 97 총 8개가 있으므로, 이들 소수의 합은 620이고, 최소값은 61이 된다.

		 2. 입력
			입력의 첫째 줄에 M이, 둘째 줄에 N이 주어진다.
			M과 N은 10,000이하의 자연수이며, M은 N보다 작거나 같다.

		 3. 출력
			M이상 N이하의 자연수 중 소수인 것을 모두 찾아 첫째 줄에 그 합을, 둘째 줄에 그 중 최소값을 출력한다. 
			단, M이상 N이하의 자연수 중 소수가 없을 경우는 첫째 줄에 -1을 출력한다.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int M = Integer.parseInt(br.readLine());
		int N = Integer.parseInt(br.readLine());
		int sum = 0;
		int first = 0;
		
		for(int i = M; i < N + 1; i++) {
			boolean flag = checkNum(i) && i > 1; 
			sum = flag ? sum + i : sum;
			first = flag && first == 0 ? i : first;
		}
		
		if(sum > 0) {
			bw.write(sum + "\n");
			bw.write(first + "\n");
		} else {
			bw.write("-1" + "\n");
		}
		
		bw.close();
		br.close();
	}
	
	public static boolean checkNum(int n) {
		for(int i = 2; i < n; i++) {
			if(n % i == 0) return false;
		}
		return true;
	}

}
