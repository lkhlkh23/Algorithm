package Q2749;

import java.io.*;
import java.math.*;

public class Main {

	public static void main(String[] args) throws IOException {
		/* 2018.08.12 */
		/*
		 1. 문제
			피보나치 수는 0과 1로 시작한다. 0번째 피보나치 수는 0이고, 1번째 피보나치 수는 1이다. 
			그 다음 2번째 부터는 바로 앞 두 피보나치 수의 합이 된다.
			이를 식으로 써보면 Fn = Fn-1 + Fn-2 (n>=2)가 된다.
			n=17일때 까지 피보나치 수를 써보면 다음과 같다.
			0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597
			n이 주어졌을 때, n번째 피보나치 수를 구하는 프로그램을 작성하시오.

		 2. 입력
			첫째 줄에 n이 주어진다. n은 1,000,000,000,000,000,000보다 작거나 같은 자연수이다.

		 3. 출력
			첫째 줄에 n번째 피보나치 수를 1,000,000으로 나눈 나머지를 출력한다. 
		 */
		
		/*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int f1 = 0;
		int f2 = 1;
		int result = 0;
		BigInteger bnum = new BigInteger(br.readLine());
		BigInteger cnt = new BigInteger("0");
		int i = 0;
		StringBuilder sb = new StringBuilder();
		while(bnum.compareTo(cnt) >= 0) {
			if(cnt.equals(BigInteger.ZERO)) {
				result = f1;
			} else if (cnt.equals(BigInteger.ONE)) {
				result = f2;
			} else {
				result = (f1 + f2)%1000000;
				f1 = f2;
				f2 = result;
			}
			cnt = cnt.add(BigInteger.ONE);
			bw.write(result );
		}
		
		bw.write(result + "\n");
		
		bw.close();
		br.close(); */
		getPeriod(300);

	}
	
	public static int getPeriod(int n) {
		int f1 = 0;
		int f2 = 1;
		int num = 0;
		for(int i = 0; i <=n; i++) {
			if(i == 0 || i == 1) num = i;
			else {
				num = (f1 + f2)%4;
				f1 = f2;
				f2 = num;
			}
			System.out.println(num);
		}
		
		return 0;
	}

}
