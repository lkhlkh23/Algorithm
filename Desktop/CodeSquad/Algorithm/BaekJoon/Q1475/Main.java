package Q1475;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		/* 2018.08.06 */
		/*
		 1. 문제
			다솜이는 은진이의 옆집에 새로 이사왔다. 다솜이는 자기 방 번호를 예쁜 플라스틱 숫자로 문에 붙이려고 한다.
			다솜이의 옆집에서는 플라스틱 숫자를 한 세트로 판다. 한 세트에는 0번부터 9번까지 숫자가 하나씩 들어있다. 
			다솜이의 방 번호가 주어졌을 때, 필요한 세트의 개수의 최소값을 출력하시오. 
			(6은 9를 뒤집어서 이용할 수 있고, 9는 6을 뒤집어서 이용할 수 있다.)

		 2. 입력
			첫째 줄에 다솜이의 방 번호 N이 주어진다. N은 1,000,000보다 작거나 같은 자연수 또는 0이다.

		 3. 출력
			첫째 줄에 필요한 세트의 개수를 출력한다.
		 */
		
		Scanner sc = new Scanner(System.in);
		String input = sc.nextLine();
		
		/* 1. 6과 9는 똑같이 이용이 가능하기 때문에 9를 6으로 대체. */
		input = input.replace("9", "6");
		
		/* 2. 각 문자가 나오는 횟수를 배열에 저장 (단, 6과 9는 동일) */ 
		int[] numArr = new int[9];
		for(int i = 0; i < input.length(); i ++) {
			int idx = input.charAt(i) - 48;
			numArr[idx]++;
		}
		
		/* 3. 6과 9 한 셋트를 이용해서 두번 표현이 가능하기 때문에 나누기
		      단, 올림 (6, 9, 6 은 3셋트가 필요하기 때문에)
		 */
		numArr[6] = (int)Math.ceil((double)numArr[6]/2);
		
		/* 4. 최대값 출력 */
		System.out.println(getMax(numArr));

	}
	
	public static int getMax(int[] arr) {
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			max = max > arr[i] ? max : arr[i];
		}
		return max;
	}

}
