package Q2309;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	/*
	 	문제 : 일곱난장이
	 	url : https://www.acmicpc.net/problem/2309
	 	재풀이 : O
	*/

	public static void main(String[] args) {
		/* 2018.09.19 */
		/*
		 1. 문제
			왕비를 피해 일곱 난쟁이들과 함께 평화롭게 생활하고 있던 백설공주에게 위기가 찾아왔다. 일과를 마치고 돌아온 난쟁이가 일곱 명이 아닌 아홉 명이었던 것이다.
			아홉 명의 난쟁이는 모두 자신이 "백설 공주와 일곱 난쟁이"의 주인공이라고 주장했다. 
			뛰어난 수학적 직관력을 가지고 있던 백설공주는, 다행스럽게도 일곱 난쟁이의 키의 합이 100이 됨을 기억해 냈다.
			아홉 난쟁이의 키가 주어졌을 때, 백설공주를 도와 일곱 난쟁이를 찾는 프로그램을 작성하시오.

		 2. 입력
			아홉 개의 줄에 걸쳐 난쟁이들의 키가 주어진다. 주어지는 키는 100을 넘지 않는 자연수이며, 
			아홉 난쟁이의 키는 모두 다르며, 가능한 정답이 여러 가지인 경우에는 아무거나 출력한다.

		 3. 출력
			일곱 난쟁이의 키를 오름차순으로 출력한다. 일곱 난쟁이를 찾을 수 없는 경우는 없다. 
		 * */
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[9];
		int sum = 0;
		int rest = 0;
		/* 1. 난쟁이의 키를 입력받는다. */
		for(int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
			sum += arr[i];
		}
		rest = sum - 100;

		/* 2. rest 보다 큰 두 사람을 찾아서, 찾으면 flag를 통해 바로 출력한다. */
		int i = 0;
		int j = 0;
		int[] result = new int[7];
		boolean flag = true;
		for(i = 0; i < arr.length && flag; i++) {
			for(j = 0; j < arr.length && i != j && flag; j++) {
				if(arr[i] + arr[j] == rest) {
					flag = false;
				}
			}
		}
		
		int cnt = 0;
		for(int k = 0; k < arr.length; k++) {
			if(k == (i - 1) || k == (j - 1)) continue;
			result[cnt++] = arr[k];
		}
		
		Arrays.sort(result);
		for(int num : result)
			System.out.println(num);
		
	}

}
