package Q2941;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {

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
