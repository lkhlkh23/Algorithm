package Q2675;

import java.util.Scanner;

public class Main {
	/*
	 	문제 : 문자열 반복
	 	url : https://www.acmicpc.net/problem/2675
	 	재풀이 : X
	*/

	public static void main(String[] args) {
		/* 2018.08.08 */
		/*
		 1. 문제
			문자열 S를 입력받은 후에, 각 문자를 R번 반복해 새 문자열 T를 만든 후 출력하는 프로그램을 작성하시오.
			다시 설명하자면, 첫 번째 문자를 R번 반복하고, 두 번째 문자를 R번 반복하는 식으로 T를 만들면 된다. 
			S에는 QR Code "alphanumeric" 문자만 들어있다.
			QR Code "alphanumeric" 문자는 0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ$%*+-./: 이다.

		 2. 입력
			첫째 줄에 테스트 케이스의 개수 T(1 <= T <= 1,000)가 주어진다. 
			각 테스트 케이스는  반복 횟수 R(1 <= R <= 8), 문자열 S가 공백으로 구분되어 주어진다. 
			S의 길이는 적어도 1이며, 20글자를 넘지 않는다. 

		 3. 출력
			각 테스트 케이스에 대해 T를 출력한다
		 */
		
		Scanner sc = new Scanner(System.in);
		int caseNum = Integer.parseInt(getInput(sc));
		int[] loopArr = new int[caseNum];
		String[] strArr = new String[caseNum];
		getVariable(sc, caseNum, loopArr, strArr);
		
		printResult(caseNum, strArr, loopArr);
	}
	
	public static String getInput(Scanner sc) {
		return sc.nextLine();
	}
	
	public static void getVariable(Scanner sc, int caseNum, int[] intArr, String[] strArr) {
		for(int i = 0; i < caseNum; i++) {
			String input = getInput(sc);
			intArr[i] = Integer.parseInt(splitStr(input, 0));
			strArr[i] = splitStr(input, 1);
		}
	}
	
	public static String splitStr(String str, int idx) {
		return str.split(" ")[idx];
	}
	
	public static void setResult(char[] arr, String inputStr, int inputNum) {
		int index = 0;
		
		for(int i = 1; i <= arr.length; i++) {
			arr[i-1] = inputStr.charAt(index);
			index = i % inputNum == 0 ? (index + 1) : index;
		}
	}
	
	public static void getResult(char[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		System.out.println("");
	}
	
	public static void printResult(int caseNum,  String[] strArr, int[] intArr) {
		char[][] charArr = null;
		for(int i = 0; i < caseNum; i++) {
			charArr = new char[caseNum][intArr[i] * strArr[i].length()];
			
			setResult(charArr[i], strArr[i], intArr[i]);
			getResult(charArr[i]);
		}
	}

}
