package Q11654;

import java.util.Scanner;

public class main {
	/*
	 	문제 : 아스키코드
	 	url : https://www.acmicpc.net/problem/11654
	 	재풀이 : X
	*/

	public static void main(String[] args) {
		/* 2018.08.03 */
		/*
		1. 문제
			알파벳 소문자, 대문자, 숫자 0-9중 하나가 주어졌을 때, 주어진 글자의 아스키 코드값을 출력하는 프로그램을 작성하시오.

		2. 입력
			알파벳 소문자, 대문자, 숫자 0-9 중 하나가 첫째 줄에 주어진다.

		3. 출력
			입력으로 주어진 글자의 아스키 코드 값을 출력한다.
		*/
		
		Scanner sc = new Scanner(System.in);
		char input = sc.next().charAt(0);
		
		int output = 0;
		output = (char) input;
		System.out.println(output);
	}
}
