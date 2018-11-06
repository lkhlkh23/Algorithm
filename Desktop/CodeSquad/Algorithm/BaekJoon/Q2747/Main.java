package Q2747;

import java.io.*;

public class Main {
	/*
	 	문제 : 피보나치수
	 	url : https://www.acmicpc.net/problem/2747
	 	재풀이 : X
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 2018.08.12 */
		/*
		 1. 문제
			피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 
			그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.

			이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다. n=17일때 까지 피보나치 수를 써보면 다음과 같다.
			0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597

			n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

		 2. 입력
			첫째 줄에 n이 주어진다. n은 45보다 작거나 같은 자연수이다.

 		 3. 출력
			첫째 줄에 n번째 피보나치 수를 출력한다. 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		/* 재귀함수를 사용할 경우 : 5636ms */
		//bw.write(Fibonaci(input) + "\n");
		
		/* 반복문을 사용할 경우 : 80ms */
		bw.write(Fibonaci2(input) + "\n");
		
		bw.close();
		br.close();
	}
	
	public static int Fibonaci(int n) {
		if(n == 0 || n == 1) {
			return n;
		} else {
			return Fibonaci(n - 1) + Fibonaci(n - 2);
		}
	}
	
	public static long Fibonaci2(int n) {
		long[] arr = new long[n + 1];
		for(int i = 0; i < arr.length; i++) {
			if(i == 0 || i == 1) arr[i] = i;
			else arr[i]= arr[i - 2] + arr[i - 1];
		}
		
		return arr[n];
	}
}
