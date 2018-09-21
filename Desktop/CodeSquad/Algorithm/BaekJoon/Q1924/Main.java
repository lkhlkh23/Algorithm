package Q1924;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 2018.08.07 */
		/*
		 1. 문제
			오늘은 2007년 1월 1일 월요일이다. 그렇다면 2007년 x월 y일은 무슨 요일일까? 

		 2. 입력
			첫째 줄에 빈 칸을 사이에 두고 x(1≤x≤12)와 y(1≤y≤31)이 주어진다. 
			참고로 2007년에는 1, 3, 5, 7, 8, 10, 12월은 31일까지, 4, 6, 9, 11월은 30일까지, 2월은 28일까지 있다.

		3. 출력
			첫째 줄에 x월 y일이 무슨 요일인지에 따라 SUN, MON, TUE, WED, THU, FRI, SAT중 하나를 출력한다.
		 */
		
		int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
		String[] weeks = {
				"SUN" ,
				"MON" ,
				"TUE" ,
				"WED" ,
				"THU" ,
				"FRI" ,
				"SAT" 
		};
		
		Scanner sc = new Scanner(System.in);
		String input = getInput(sc);
		
		int month = getInputSplit(input, 0);
		int day = getInputSplit(input, 1);
		int sum = 0;
		
		for(int i = 0; i < month; i++) {
			sum += days[i];
		}
		
		sum += day;
		
		System.out.println(weeks[sum%7]);
	}
	
	public static int getInputSplit(String input, int idx) {
		return Integer.parseInt(input.split(" ")[idx]);
	}
	
	public static String getInput(Scanner sc) {
		String input = sc.nextLine();
		return input;
	}

}
