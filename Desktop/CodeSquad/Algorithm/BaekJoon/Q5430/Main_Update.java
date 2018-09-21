package Q5430;

import java.io.*;
import java.util.*;

public class Main_Update {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 2018.08.18 */
		/*
		 1. 문제
			선영이는 주말에 할 일이 없어서 새로운 언어 AC를 만들었다. AC는 정수 배열에 연산을 하기 위해 만든 언어이다. 
			이 언어에는 두 가지 함수 R(뒤집기)과 D(버리기)가 있다.
			함수 R은 배열에 있는 숫자의 순서를 뒤집는 함수이고, D는 첫 번째 숫자를 버리는 함수이다. 
			배열이 비어있는데 D를 사용한 경우에는 에러가 발생한다.
			함수는 조합해서 한 번에 사용할 수 있다. 예를 들어, "AB"는 A를 수행한 다음에 바로 이어서 B를 수행하는 함수이다. 
			예를 들어, "RDD"는 배열을 뒤집은 다음 처음 두 숫자를 버리는 함수이다.
			배열의 초기값과 수행할 함수가 주어졌을 때, 최종 결과를 구하는 프로그램을 작성하시오.

		 2. 입력
			첫째 줄에 테스트 케이스의 개수 T가 주어진다. T는 최대 100이다.
			각 테스트 케이스의 첫째 줄에는 수행할 함수 p가 주어진다. p의 길이는 1보다 크거나 같고, 100,000보다 작거나 같다.
			다음 줄에는 배열에 들어있는 수의 개수 n이 주어진다. (0 ≤ n ≤ 100,000)
			다음 줄에는 [x1,...,xn]과 같은 형태로 배열에 들어있는 수가 주어진다. (1 ≤ xi ≤ 100)
			전체 테스트 케이스에 주어지는 p의 길이의 합과 n의 합은 70만을 넘지 않는다.

		 3. 출력
			각 테스트 케이스에 대해서, 입력으로 주어진 정수 배열에 함수를 수행한 결과를 출력한다. 
			만약, 에러가 발생한 경우에는 error를 출력한다. 
		 */
		
		StringBuilder sb = new StringBuilder();
		int caseNum = Integer.parseInt(br.readLine());
		for(int i = 0; i < caseNum; i++) {
			sb.append(getResult() + "\n");
		}
		System.out.println(sb.toString());
		
		br.close();
	}
	
	
	
	public static String getResult() {
		Deque<String> dq = new LinkedList<>();
		boolean flag = false; // reverse 하면 true, 하지 않으면 false. 
		try {
			/* 명령어를 문자 하나 하나 쪼개서 배열에 저장 */
			char[] cmd = br.readLine().toCharArray();
			int size = Integer.parseInt(br.readLine());	
			
			/* 입력받은 배열에서 [ , ] 3 특수문자를 제거해서 자연수만 리스트에 저장 */
			StringTokenizer st = new StringTokenizer(br.readLine().replace("[", "").replace("]", ""), ",");
		
			if(st.countTokens() != size) return "error";
		
			while(st.hasMoreTokens()) {
				dq.addLast(st.nextToken());
			}
			
			for(int j = 0; j < cmd.length; j++) {
				if(cmd[j] == 'R') flag = !flag;
				else {
					if(dq.isEmpty()) return "error";
					delete(dq, flag);
				}
			}
		} catch(Exception e) {
			return "error";
		}
		return printResult2(dq, flag);
	}
	
	public static void delete(Deque<String> dq, boolean flag) {
		if(flag) dq.pollLast();
		else dq.pollFirst();
	}
	
	public static String printResult(Deque<String> dq, boolean flag) {
		if(flag) {
			String str = dq.toString().replace(" ", "");
			return "[" + reverseStr(str.substring(1, str.length() - 1)) + "]";
		} else {
			return dq.toString().replace(" ", "");
		}
	}
	
	public static String printResult2(Deque<String> dq, boolean flag) {
		//String result = "";
		StringBuilder sb = new StringBuilder();
		if(dq.isEmpty()) return "[]";
		if(flag) {
			while(!dq.isEmpty()) {
				sb.append(dq.pollLast()).append(",");
				//result = result + dq.pollLast() + ",";
			}
		} else {
			while(!dq.isEmpty()) {
				sb.append(dq.pollFirst()).append(",");
				//result = result + dq.pollFirst() + ",";
			}
		}
		return "[" + sb.toString().substring(0, sb.toString().length() - 1) + "]";
	}
	
	public static String reverseStr(String str) {
		return new StringBuffer(str).reverse().toString();
	}

}
