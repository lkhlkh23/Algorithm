package Q1874;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 2018.08.14 */
		/*
		 1. 문제
			1부터 n까지의 수를 스택에 넣었다가 뽑아 늘어놓음으로써, 하나의 수열을 만들 수 있다. 
			이 때, 스택에 push하는 순서는 반드시 오름차순을 지키도록 한다고 하자. 
			임의의 수열이 주어졌을 때 스택을 이용해 그 수열을 만들 수 있는지 없는지, 있다면 어떤 순서로 
			push와 pop 연산을 수행해야 하는지를 알아낼 수 있다. 이를 계산하는 프로그램을 작성하라.

		 2. 입력
			첫 줄에 n (1 ≤ n ≤ 100,000)이 주어진다. 
			둘째 줄부터 n개의 줄에는 수열을 이루는 1이상 n이하의 정수가 하나씩 순서대로 주어진다. 
			물론 같은 정수가 두 번 나오는 일은 없다.

		 3. 출력
			입력된 수열을 만들기 위해 필요한 연산을 한 줄에 한 개씩 출력한다.
			 push연산은 +로, pop 연산은 -로 표현하도록 한다. 불가능한 경우 NO를 출력한다. 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int inputNum = Integer.parseInt(br.readLine());
		int[] inputArr = new int[inputNum];
		for(int i = 0; i < inputArr.length; i++) {
			inputArr[i] = Integer.parseInt(br.readLine());
		}

		List<Integer> stackList = new ArrayList<>();
		int inputIdx = 0; 
		int number = 1;
		int plus = 0; // push 횟수 
		int minus = 0; // pop 횟수 
		
		while(plus + minus < inputNum * 2) { 
			// 입력한 수열순으로 출력하기 위해서는 반드시 push, pop의 합을 수열의 갯수만큼 수행해야함!
			int stackIdx = stackList.size() - 1; // 리스트는 스택이기 때문에 인덱스는 반드시 가장 끝값!
			if(stackList.size() == 0 || stackList.get(stackIdx) != inputArr[inputIdx]) {
				// 스택이 비어있거나, 스택의 값과 수열의 값이 동일하지 않는 경우네는 push!
				stackList.add(number);
				sb.append("+" + "\n");
				number++;
				plus++;
			} else {
				stackList.remove(stackIdx);
				sb.append("-" + "\n");
				inputIdx++;
				minus++;
			}
		}
		
		if(plus - minus == 0) {
			bw.write(sb.toString());
		} else {
			bw.write("NO");
		}
		
		bw.close();
		br.close();
		
	}

}
