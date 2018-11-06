package Q1157;

import java.util.Scanner;

public class Main {
	/*
	 	문제 : 단어공부
	 	url : https://www.acmicpc.net/problem/1157
	 	재풀이 : O
	*/

	public static void main(String[] args) {
		/* 2018.08.08 */
		/*
		 1. 문제 
		 	알파벳 대소문자로 된 단어가 주어지면, 이 단어에서 가장 많이 사용된 알파벳이 무엇인지 알아내는 프로그램을 작성하시오.
		 	단, 대문자와 소문자를 구분하지 않는다.

		 2. 입력
			첫째 줄에 알파벳 대소문자로 이루어진 단어가 주어진다. 주어지는 단어의 길이는 1,000,000을 넘지 않는다.

		 3. 출력
			첫째 줄에 이 단어에서 가장 많이 사용된 알파벳을 대문자로 출력한다. 
			단, 가장 많이 사용된 알파벳이 여러 개 존재하는 경우에는 ?를 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		String input = getInput(sc);
		
		int[] cntArr = initArr(input);

		String result = getResult(cntArr);
		
		System.out.println(result);
	}
	
	public static String getInput(Scanner sc) {
		String input = sc.nextLine();
		return input.toUpperCase();
	}
	
	public static int[] initArr(String str) {
		int[] arr = new int[26];
		for(int i = 0; i < str.length(); i++) {
			int idx = str.charAt(i) - 65;
			arr[idx]++;
		}
		
		return arr;
	}
	
	public static String getResult(int[] arr) {
		String result = "";
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= max) {
				if(arr[i] == max) {
					result = "?";
				} else {
					result = (char)(i + 65) + "";
				}
				max = arr[i];
			}
		}
		return result;
	}

}
