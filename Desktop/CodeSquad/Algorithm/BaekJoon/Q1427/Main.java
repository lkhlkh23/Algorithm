package Q1427;

import java.io.*;
import java.util.*;

public class Main {
	/*
	 	문제 : 소트인사이드
	 	url : https://www.acmicpc.net/problem/1427
	 	재풀이 : X
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 2018.08.10 */
		/*
		 1. 문제
			배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

		 2. 입력
			첫째 줄에 정렬하고자하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

		 3. 출력
			첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int input = Integer.parseInt(br.readLine());
		
		/* char[] arr = sc.nextLine().toCharArray(); 로 char 배열 생성 가능 */
		ArrayList<Integer> resultList = makeArr(input);
		Collections.sort(resultList, Collections.reverseOrder());
		
		for(int i = 0; i < resultList.size(); i++) {
			bw.write(resultList.get(i) + "");
		}
		bw.close();
		br.close();

	}
	
	public static ArrayList<Integer> makeArr(int num) {
		/* 입력받은 정수의 자릿수 출력 */
		int len = getLength(num);
		ArrayList<Integer> list = new ArrayList<>();
		/* 입력받은 정수의 각 자리를 리스트에 저장 */
		for(int i = (len - 1); i > -1; i--) {
			list.add(num / (int)Math.pow(10, i));
			num %= (int)Math.pow(10, i);
		}
		return list;
	}
	
	public static int getLength(int num) {
		int cnt = 0;
		do {
			num /= 10;
			cnt++;
		} while(num > 0);
		
		return cnt;
	}

}
