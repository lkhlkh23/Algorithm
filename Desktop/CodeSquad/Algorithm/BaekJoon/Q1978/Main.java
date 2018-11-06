package Q1978;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	/*
	 	문제 : 소수찾기
	 	url : https://www.acmicpc.net/problem/1978
	 	재풀이 : X
	*/

	public static void main(String[] args) throws IOException {
		/* 2018.08.10 */
		/*
		 1. 문제
			주어진 수 N개 중에서 소수가 몇 개인지 찾아서 출력하는 프로그램을 작성하시오.

		 2. 입력
			첫 줄에 수의 개수 N이 주어진다. N은 100이하이다. 다음으로 N개의 수가 주어지는데 수는 1,000 이하의 자연수이다.

		 3. 출력
			주어진 수들 중 소수의 개수를 출력한다. 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cnt = 0;
		int N = Integer.parseInt(br.readLine());
		StringTokenizer st = new StringTokenizer(br.readLine());
		while(st.hasMoreTokens()) {
			int n = Integer.parseInt(st.nextToken());
			cnt = checkNum(n) & n > 1 ? cnt + 1 : cnt;
		}
		bw.write(cnt + "");
		
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
