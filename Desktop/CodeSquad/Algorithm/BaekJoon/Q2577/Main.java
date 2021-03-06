package Q2577;

import java.io.*;

public class Main {
	/*
	 	문제 : 숫자의 갯수
	 	url : https://www.acmicpc.net/problem/2577
	 	재풀이 : X
	*/

	public static void main(String[] args) throws IOException {
		/* 2018.08.12 */
		/*
		 1. 문제
			세 개의 자연수 A, B, C가 주어질 때 A×B×C를 계산한 결과에 0부터 9까지 각각의 숫자가 몇 번씩 쓰였는지를 
			구하는 프로그램을 작성하시오.
			예를 들어 A = 150, B = 266, C = 427 이라면  A × B × C = 150 × 266 × 427 = 17037300 이 되고, 
			계산한 결과 17037300 에는 0이 3번, 1이 1번, 3이 2번, 7이 2번 쓰였다.

		 2. 입력
			첫째 줄에 A, 둘째 줄에 B, 셋째 줄에 C가 주어진다. A, B, C는 모두 100보다 같거나 크고, 
			1,000보다 작은 자연수이다.

	     3. 출력
			첫째 줄에는 A×B×C의 결과에 0 이 몇 번 쓰였는지 출력한다. 마찬가지로 둘째 줄부터 열 번째 줄까지 
			A×B×C의 결과에 1부터 9까지의 숫자가 각각 몇 번 쓰였는지 차례로 한 줄에 하나씩 출력한다.
		*/
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		int C = Integer.parseInt(br.readLine());
		
		String numStr = (A * B * C) + "";
		int[] resultArr = new int[10];
		
		for(int i = 0; i < numStr.length(); i++) {
			resultArr[numStr.charAt(i) - 48]++;
		}
		
		for(int i = 0; i < resultArr.length; i++) {
			sb.append(resultArr[i] + "\n");
		}
		
		bw.write(sb.toString());
		
		bw.close();
		br.close();
		

	}

}
