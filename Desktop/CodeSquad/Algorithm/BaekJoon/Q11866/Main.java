package Q11866;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		/* 2018.08.16 */
		/*
		 1. 문제
			조세퍼스 문제는 다음과 같다. 1번부터 N번까지 N명의 사람이 원을 이루면서 앉아있고, 양의 정수 M(≤ N)이 주어진다. 
			이제 순서대로 M번째 사람을 제거한다. 한 사람이 제거되면 남은 사람들로 이루어진 원을 따라 이 과정을 계속해 나간다. 
			이 과정은 N명의 사람이 모두 제거될 때까지 계속된다. 
			원에서 사람들이 제거되는 순서를 (N, M)-조세퍼스 순열이라고 한다. 
			예를 들어 (7, 3)-조세퍼스 순열은 <3, 6, 2, 7, 5, 1, 4>이다.

			N과 M이 주어지면 (N,M)-조세퍼스 순열을 구하는 프로그램을 작성하시오.

		 2. 입력
			첫째 줄에 N과 M이 빈 칸을 사이에 두고 순서대로 주어진다. (1 ≤ M ≤ N ≤ 1,000)

 		 3. 출력
			예제와 같이 조세퍼스 순열을 출력한다. 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		
		/* 1. 입력값 설정 */
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		/* 2. 큐 초기화 */
		Queue<Integer> q = initQueue(M);
		
		/* 3. 입력값에 맞게 계산 */
		bw.write(getReulst(q, N) + "\n");
		
		bw.close();
		br.close();
		
	}
	
	public static Queue<Integer> initQueue(int m) {
		Queue<Integer> q = new LinkedList<>();
		for(int i = 1; i <= m; i++) 
			q.offer(i);
		
		return q;
	}

	public static String getReulst(Queue<Integer> q, int n) {
		StringBuilder sb = new StringBuilder();
		int cnt = 1;
		int out = 0;
		sb.append("<");
		while(!q.isEmpty()) {
			out = q.remove();
			
			if(cnt % n == 0) sb.append(out + ", ");
			else q.offer(out);
			
			cnt++;
		}
		
		String result = sb.toString().substring(0, sb.toString().length() - 2);
		result = result + ">";
		
		return result;
	}

}
