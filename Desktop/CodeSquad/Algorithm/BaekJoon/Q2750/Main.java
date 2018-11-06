package Q2750;

import java.io.*;
import java.util.*;

public class Main {
	/*
	 	문제 : 수 정렬하기
	 	url : https://www.acmicpc.net/problem/2750
	 	재풀이 : X
	*/
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	static StringBuilder sb = new StringBuilder();
	
	public static void main(String[] args) throws IOException {
		/* 2018.08.09 */
		/*
		 1. 문제
			N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

		 2. 입력
			첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 숫자가 주어진다. 
			이 수는 절대값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

		 3. 출력
			첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
		 */
		int N = Integer.parseInt(br.readLine());
		int[] numArr = new int[N];
		
		getInput(numArr, N);
		
		sortArray(numArr);
		
		printList(numArr);
		
		bw.close();
		br.close();
	}
	
	public static void getInput(int[] arr, int n) throws IOException {
		for(int i = 0; i < n; i++) {
			int num = Integer.parseInt(br.readLine());
			arr[i] = num;
		}
	}
	
	public static void sortArray(int[] arr) {
		Arrays.sort(arr);
	}
	
	public static void printList(int[] arr) throws IOException {
		for(int i = 0; i < arr.length; i++) {
			//bw.write(list.get(i) + "\n");
			sb.append(arr[i] + "\n");
		}
		bw.write(sb.toString());
	}

}
