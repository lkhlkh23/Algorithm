package Q2941;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	/*
	 	문제 : 크로아티아 알파벳
	 	url : https://www.acmicpc.net/problem/2941
	 	재풀이 : X
	*/

	public static void main(String[] args) {
		/* 2018.08.08 */
		String[] alphaArr = {
			"c=", 
			"c-",
			"dz=",
			"d-",
			"lj",
			"nj",
			"s=",
			"z="
		};
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();  
		
		printResult(alphaArr, input);
	}
	
	public static void printResult(String[] arr, String str) {
		for(int i = 0; i < arr.length; i++) {
			str = str.replace(arr[i], "*");
		}
		
		System.out.println(str.length());
	}

}
