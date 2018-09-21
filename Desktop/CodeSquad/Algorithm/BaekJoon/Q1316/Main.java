package Q1316;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 2018.08.08 */
		/*
		 1. 문제
			그룹 단어란 단어에 존재하는 모든 문자에 대해서, 각 문자가 연속해서 나타나는 경우만을 말한다. 
			예를 들면, ccazzzzbb는 c, a, z, b가 모두 연속해서 나타나고, 
			kin도 k, i, n이 연속해서 나타나기 때문에 그룹 단어이지만, 
			aabbbccb는 b가 떨어져서 나타나기 때문에 그룹 단어가 아니다.

			단어 N개를 입력으로 받아 그룹 단어의 개수를 출력하는 프로그램을 작성하시오.

		 2. 입력
			첫째 줄에 단어의 개수 N이 들어온다. N은 100보다 작거나 같은 자연수이다. 
			둘째줄부터 N개의 줄에 단어가 들어온다. 단어는 알파벳 소문자로만 되어있고 중복되지 않으며, 길이는 최대 100이다.

		 3. 출력
			첫째 줄에 그룹 단어의 개수를 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		int caseNum = Integer.parseInt(getInput(sc));
		
		String[] strArr = getVariables(sc, caseNum);

		printReuslt(strArr);
	}
	
	public static String getInput(Scanner sc) {
		return sc.nextLine();
	}
	
	public static String[] getVariables(Scanner sc, int num) {
		String[] arr = new String[num];
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextLine();
		}
		return arr;
	}
	
	public static boolean getResult(String str) {
		List<String> list = new ArrayList<>();
		list.add(str.charAt(0) + "");
		
		for(int i = 1; i < str.length(); i++) {
			String element = str.charAt(i) + "";
			if(!list.get(i-1).equals(element) && list.contains(element)) {
				return false;
			}
			list.add(element);
		}
		return true;
	}
	
	public static void printReuslt(String[] str) {
		int success = 0;
		for(int i = 0; i < str.length; i++) {
			success = getResult(str[i]) == true ? (success + 1) : success;
		}
		System.out.println(success);
	}

}
