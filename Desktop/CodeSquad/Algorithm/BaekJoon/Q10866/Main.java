package Q10866;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.*;

public class Main {
	/*
	 	문제 : 덱
	 	url : https://www.acmicpc.net/problem/10866
	 	재풀이 : X
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 2018.08.18 */
		/*
		 1. 문제
			정수를 저장하는 덱(Deque)를 구현한 다음, 입력으로 주어지는 명령을 처리하는 프로그램을 작성하시오.
			명령은 총 여덟 가지이다.

			 - push_front X: 정수 X를 덱의 앞에 넣는다.
			 - push_back X: 정수 X를 덱의 뒤에 넣는다.
			 - pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			 - pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			 - size: 덱에 들어있는 정수의 개수를 출력한다.
			 - empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
			 - front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
			 - back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
		 2. 입력
			첫째 줄에 주어지는 명령의 수 N (1 ≤ N ≤ 10,000)이 주어진다. 둘쨰 줄부터 N개의 줄에는 명령이 하나씩 주어진다. 
			주어지는 정수는 1보다 크거나 같고, 100,000보다 작거나 같다. 문제에 나와있지 않은 명령이 주어지는 경우는 없다.

		 3. 출력
			출력해야하는 명령이 주어질 때마다, 한 줄에 하나씩 출력한다. 
		 */
		
		List<Integer> list = new ArrayList<>();
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int cmdNum = Integer.parseInt(br.readLine());
		
		for(int i = 0; i < cmdNum; i++) {
			String cmd = br.readLine();
			selectCommand(cmd, list, sb);
		}
		
		bw.write(sb.toString());
		
		bw.close();
		br.close();
		

	}
	
	public static void selectCommand(String cmd, List<Integer> list, StringBuilder sb) {
		if(cmd.contains("push_front")) {
			push_front(list, Integer.parseInt(cmd.split(" ")[1]));
		} else if(cmd.contains("push_back")) {
			push_back(list, Integer.parseInt(cmd.split(" ")[1]));
		} else if(cmd.equals("pop_front")) {
			sb.append(pop_front(list) + "\n");
		} else if(cmd.equals("pop_back")) {
			sb.append(pop_back(list) + "\n");
		} else if(cmd.equals("size")) {
			sb.append(size(list) + "\n");
		} else if(cmd.equals("empty")) {
			sb.append(empty(list) + "\n");
		} else if(cmd.equals("front")) {
			sb.append(front(list) + "\n");
		} else if(cmd.equals("back")) {
			sb.append(back(list) + "\n");
		}
	}
	
	public static int empty(List<Integer> list) {
		return list.isEmpty() ? 1 : 0; 
	}
	
	public static int size(List<Integer> list) {
		return list.size();
	}
	
	public static void push_front(List<Integer> list, int x) {
		list.add(0, x);
	}
	
	public static void push_back(List<Integer> list, int x) {
		list.add(list.size(), x);
	}
	
	public static int front(List<Integer> list) {
		return empty(list) == 1 ? -1 : list.get(0);
	}
	
	public static int back(List<Integer> list) {
		return empty(list) == 1 ? -1 : list.get(size(list) - 1);
	}
	
	public static int pop_front(List<Integer> list) {
		return empty(list) == 1 ? -1 : list.remove(0);
	}
	
	public static int pop_back(List<Integer> list) {
		return empty(list) == 1 ? -1 : list.remove(size(list) - 1);
	}

}
