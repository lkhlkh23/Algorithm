package Q1934;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
	/*
	 	문제 : 최소공배수
	 	url : https://www.acmicpc.net/problem/1934
	 	재풀이 : X
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		/*
		 1. 문제
			두 자연수 A와 B에 대해서, A의 배수이면서 B의 배수인 자연수를 A와 B의 공배수라고 한다. 
			이런 공배수 중에서 가장 작은 수를 최소공배수라고 한다. 
			예를 들어, 6과 15의 공배수는 30, 60, 90등이 있으며, 최소 공배수는 30이다.
			두 자연수 A와 B가 주어졌을 때, A와 B의 최소공배수를 구하는 프로그램을 작성하시오.

		 2. 입력
			첫째 줄에 테스트 케이스의 개수 T(1 ≤ T ≤ 1,000)가 주어진다. 둘째 줄부터 T개의 줄에 걸쳐서 A와 B가 주어진다. (1 ≤ A, B ≤ 45,000)

		 3. 출력
			첫째 줄부터 T개의 줄에 A와 B의 최소공배수를 입력받은 순서대로 한 줄에 하나씩 출력한다. 
		 * */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		for(int i = 0; i < n; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int n1 = Integer.parseInt(st.nextToken());
			int n2 = Integer.parseInt(st.nextToken());
			
			sb.append(getLCD(n1, n2, getGCD(n1, n2))).append("\n");
		}
		
		bw.write(sb.toString());
		bw.close();
		

	}
	
	public static int getGCD(int n1, int n2) {
		int max = Math.max(n1, n2);
		int min = Math.min(n1, n2);
		if(max % min == 0) return min;
		else return getGCD(max % min, min);		
	}
	
	public static int getLCD(int n1, int n2, int gcd) {
		return n1 * n2 / gcd;
	}

}
