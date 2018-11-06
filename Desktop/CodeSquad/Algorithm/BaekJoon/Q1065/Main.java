package Q1065;

import java.io.*;

public class Main {
	/*
	 	문제 : 한수
	 	url : https://www.acmicpc.net/problem/1065
	 	재풀이 : X
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 2018.08.25 */
		/*
		 1. 문제
			어떤 양의 정수 X의 자리수가 등차수열을 이룬다면, 그 수를 한수라고 한다. 
			등차수열은 연속된 두 개의 수의 차이가 일정한 수열을 말한다. 
			N이 주어졌을 때, 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력하는 프로그램을 작성하시오. 

		 2. 입력
			첫째 줄에 1,000보다 작거나 같은 자연수 N이 주어진다.

		 3. 출력
			첫째 줄에 1보다 크거나 같고, N보다 작거나 같은 한수의 개수를 출력한다. 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		
		bw.write(getResult(n) + "\n");
		
		bw.close();
		br.close();
	}
	
	public static int getResult(int n) {
		boolean[] arr = new boolean[n + 1];
		int cnt = 99;
		for(int i = 100; i < arr.length; i++) {
			int first = i / 100; 
			int third = i % 10;
			int second = (i % 100 - third) / 10;;
			if(second - first == third - second) {
				//System.out.println(i);
				cnt++;
			}
			
		}
		
		return n < 100 ? n : cnt;
	}

}
