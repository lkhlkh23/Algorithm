package Q10872;

import java.io.*;

public class Main {
	/*
	 	문제 : 팩토리얼
	 	url : https://www.acmicpc.net/problem/10872
	 	재풀이 : X
	*/
	public static void main(String[] args) throws IOException {
		/* 2018.08.23 */
		/*
		 1. 문제
			0보다 크거나 같은 정수 N이 주어진다. 이 때, N!을 출력하는 프로그램을 작성하시오.

	     2. 입력
			첫째 줄에 정수 N(0 ≤ N ≤ 12)가 주어진다.

		 3. 출력
			첫째 줄에 N!을 출력한다. 
		 * */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int num = Integer.parseInt(br.readLine());

		bw.write(loopFactorial(num) + "\n");
		bw.close();
		br.close();
	}
	
	public static long loopFactorial(int n) { // 76ms
		long result = 1;
		long a = 1000000000;
		int cnt = 0;
		for(int i = 2; i <= n; i++) {
			result = (result * i) % a;
			System.out.print(i + " :: "+result + " :: ");
			while(result%10 == 0) {
				result /= 10;
				cnt++;
			}
			System.out.println(" :: "+result + " :: " + cnt);
			
		}
		System.out.println(n/5);
		return cnt;
	}
}
