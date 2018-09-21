package Q1260;

import java.util.*;
import java.io.*;
public class Main {

	public static void main(String[] args) throws IOException {
		/* 2018.08.15 */
		/*
		 1. 문제
			그래프를 DFS로 탐색한 결과와 BFS로 탐색한 결과를 출력하는 프로그램을 작성하시오. 
			단, 방문할 수 있는 정점이 여러 개인 경우에는 정점 번호가 작은 것을 먼저 방문하고, 
			더 이상 방문할 수 있는 점이 없는 경우 종료한다. 정점 번호는 1번부터 N번까지이다.

		 2. 입력
			첫째 줄에 정점의 개수 N(1 ≤ N ≤ 1,000), 간선의 개수 M(1 ≤ M ≤ 10,000), 
			탐색을 시작할 정점의 번호 V가 주어진다. 다음 M개의 줄에는 간선이 연결하는 두 정점의 번호가 주어진다. 
			한 간선이 여러 번 주어질 수도 있는데, 간선이 하나만 있는 것으로 생각하면 된다. 입력으로 주어지는 간선은 양방향이다.

		 3. 출력
			첫째 줄에 DFS를 수행한 결과를, 그 다음 줄에는 BFS를 수행한 결과를 출력한다. 
			V부터 방문된 점을 순서대로 출력하면 된다. 
		 */
		
		/*
		 * 개념 참고 : http://blog.eairship.kr/268
		 * */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int M = Integer.parseInt(st.nextToken());;
		int V = Integer.parseInt(st.nextToken());;
		
		boolean[][] flags = new boolean[N+1][N+1]; // 방문하지 않는 위치에는 true 
		boolean[] visited = new boolean[N+1];
		
		for(int i = 0; i < M; i++) {
			String[] input = br.readLine().split(" ");
			flags[Integer.parseInt(input[0])][Integer.parseInt(input[1])] = true;
			flags[Integer.parseInt(input[1])][Integer.parseInt(input[0])] = true;
		}
		
		/*flags[1][2] = true;
		flags[2][1] = true;
		flags[1][3] = true;
		flags[3][1] = true;
		flags[2][6] = true;
		flags[6][2] = true;
		flags[2][7] = true;
		flags[7][2] = true;
		flags[4][8] = true;
		flags[8][4] = true;
		flags[5][8] = true;
		flags[8][5] = true;
		flags[6][8] = true;
		flags[8][6] = true;
		flags[7][8] = true;
		flags[8][7] = true;
		flags[3][4] = true;
		flags[4][3] = true;
		flags[3][5] = true;
		flags[5][3] = true;*/
		
		//bw.write(DFS(flags, V, N) + "\n");
		recursive_DFS(flags, V, N, visited, sb);
		System.out.println();
		bw.write(BFS(flags, V, N) + "\n");

		bw.close();
		br.close();

	}
	
	public static String BFS(boolean[][] flags, int v, int n) {
		Queue<Integer> q = new LinkedList<>();
		StringBuilder sb = new StringBuilder();
		q.offer(v);

		while(!q.isEmpty()) {
			v = q.poll();
			sb.append(v).append(" ");
	
			for(int i = 1; i <= n; i++) {
				if(flags[v][i] && !q.contains(i)) {
					q.offer(i);
				}
				flags[v][i] = false; // 방문했던 정점 표시 
				flags[i][v] = false;
			}
		}		
		return sb.toString();
	}
	
	public static String DFS(boolean[][] flags, int v, int n) {
		Stack<Integer> st = new Stack<>();
		List<Integer> list = new ArrayList<>(); // 방문했던 정점을 저장하는 리스트 
		
		/* 1. 처음 방문하는 정점 스택 및 리스트에 저장 */
		st.push(v);
		list.add(v);
		
		/* 2. 모든 정점을 방문할때까지 반복문 동작 */
		while(list.size() < n) {
			for(int i = 1; i <= n; i++) {
				if(flags[v][i] == true && !list.contains(i)) {
					st.push(i);
					list.add(i);
					v = i;
					break;
				} 
				
				if(i == n) {
					/* 인근 정점을 다 방문했다면, 뒤로 Back! (Stack을 사용한 이유) */
					v = st.pop(); 
				}
			}
		}
		
		return list.toString().replace(",", "").replace("[", "").replace("]", "");
	}
	
	public static void recursive_DFS(boolean[][] flags , int v, int n, boolean[] visited, StringBuilder sb) {
		sb.append(v).append(" ");
		visited[v] = true;
		for(int i = 1; i <= n; i++) {
			if(flags[v][i] && !visited[i]) {
				recursive_DFS(flags, i, n, visited, sb);
			}
		}
	}

}
