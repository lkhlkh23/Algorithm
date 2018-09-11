package Q1966;

import java.io.*;
import java.util.*;

public class Main {
	
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 2018.08.15 */
		/*
		 1. 문제
			여러분도 알다시피 여러분의 프린터 기기는 여러분이 인쇄하고자 하는 문서를 인쇄 명령을 받은 ‘순서대로’, 
			즉 먼저 요청된 것을 먼저 인쇄한다. 여러 개의 문서가 쌓인다면 Queue 자료구조에 쌓여서 
			FIFO - First In First Out - 에 따라 인쇄가 되게 된다. 
			하지만 상근이는 새로운 프린터기 내부 소프트웨어를 개발하였는데, 이 프린터기는 다음과 같은 조건에 따라 인쇄를 하게 된다.

			현재 Queue의 가장 앞에 있는 문서의 ‘중요도’를 확인한다.
			나머지 문서들 중 현재 문서보다 중요도가 높은 문서가 하나라도 있다면, 이 문서를 인쇄하지 않고 Queue의 
			가장 뒤에 재배치 한다. 그렇지 않다면 바로 인쇄를 한다.
			예를 들어 Queue에 4개의 문서(A B C D)가 있고, 중요도가 2 1 4 3 라면 C를 인쇄하고, 
			다음으로 D를 인쇄하고 A, B를 인쇄하게 된다.

			여러분이 할 일은, 현재 Queue에 있는 문서의 수와 중요도가 주어졌을 때, 어떤 한 문서가 몇 번째로 인쇄되는지 
			알아내는 것이다. 예를 들어 위의 예에서 C문서는 1번째로, A문서는 3번째로 인쇄되게 된다.

		 2. 입력
			첫 줄에 test case의 수가 주어진다. 각 test case에 대해서 문서의 수 N(100이하)와 몇 번째로 
			인쇄되었는지 궁금한 문서가 현재 Queue의 어떤 위치에 있는지를 알려주는 M(0이상 N미만)이 주어진다. 
			다음줄에 N개 문서의 중요도가 주어지는데, 중요도는 적절한 범위의 int형으로 주어진다. 
			중요도가 같은 문서가 여러 개 있을 수도 있다. 위의 예는 N=4, M=0(A문서가 궁금하다면), 
			중요도는 2 1 4 3이 된다.

		 3. 출력
			각 test case에 대해 문서가 몇 번째로 인쇄되는지 출력한다. 
		 */
		StringBuilder sb = new StringBuilder();
		int caseNum = (Integer.parseInt(br.readLine()));
		
		for(int i = 0; i < caseNum; i++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			int N = Integer.parseInt(st.nextToken());
			int M = Integer.parseInt(st.nextToken());
			Queue<Integer> queue = new LinkedList<>();
			int compare = getInput(queue, M);
			sb.append(getResult(queue, compare, M) + "\n");
		
		}
		bw.write(sb.toString());
		
		bw.close();
		br.close();
	}
	
	public static int getInput(Queue<Integer> q, int M) throws IOException {
		int compare = 0;
		// 큐 초기화, 대상값 리턴 
		StringTokenizer st = new StringTokenizer(br.readLine());
		for(int j = 0; st.hasMoreTokens(); j++) {
			int num = Integer.parseInt(st.nextToken());
			q.offer(num);
			compare = j == M ? num : compare;
		}		
		return compare;
	}
	
	public static int getResult(Queue<Integer> q, int compare, int idx) {
		int max = 0;
		int cnt = 0;
		int num = 0;
		while(!q.isEmpty()) {
			for(int i = 0; i < q.size(); i++) {
				max = getMaxValue(q);
				num = q.poll();
				if(max == num) {
					cnt++;
					idx = idx - 1;
					break; 
				} else {
					q.offer(num);
					idx = idx == 0 ? q.size() - 1 : idx - 1;
				}
			}
			if(num == compare && idx == -1) return cnt;	
		}
		
		return 0;
	}
	
	public static int getMaxValue(Queue<Integer> q) {
		int max = 0;
		for(int i = 0; i < q.size(); i++) {
			int num = q.poll();
			max = max > num ? max : num;
			q.offer(num);
		}
		
		return max;
	}

}
