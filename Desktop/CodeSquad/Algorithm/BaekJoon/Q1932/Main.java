package Q1932;

import java.io.*;

public class Main {
	/*
	 	문제 : 정수삼각형
	 	url : https://www.acmicpc.net/problem/1932
	 	재풀이 : X
	*/

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 2018.08.28 */
		/*
		 1. 문제
        	7
      		3   8
    		8   1   0
  			2   7   4   4
			4   5   2   6   5
			위 그림은 크기가 5인 정수 삼각형의 한 모습이다.
			맨 위층 7부터 시작해서 아래에 있는 수 중 하나를 선택하여 아래층으로 내려올 때, 이제까지 선택된 수의 합이 
			최대가 되는 경로를 구하는 프로그램을 작성하라. 
			아래층에 있는 수는 현재 층에서 선택된 수의 대각선 왼쪽 또는 대각선 오른쪽에 있는 것 중에서만 선택할 수 있다.
			삼각형의 크기는 1 이상 500 이하이다. 삼각형을 이루고 있는 각 수는 모두 정수이며, 범위는 0 이상 9999 이하이다.

		 2. 입력
			첫째 줄에 삼각형의 크기 n(1 ≤ n ≤ 500)이 주어지고, 둘째 줄부터 n+1번째 줄까지 정수 삼각형이 주어진다.

		 3. 출력
			첫째 줄에 합이 최대가 되는 경로에 있는 수의 합을 출력한다 
		 * */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int[][] triangle = new int[n][n];
		triangle[0][0] = Integer.parseInt(br.readLine());
		for(int i = 1; i < triangle.length; i++) {
			String[] str = br.readLine().split(" ");
			for(int j = 0; j <=i; j++) {
				triangle[i][j] = Integer.parseInt(str[j]);
			}
		}
		
		int[][] path = new int[n][n];
		
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				path[i][j] = -1;
			}
		}
		
		int max = 0;
		for(int i = 0; i < n; i++) {
			int len = getMaxPath(n - 1, i, triangle, path);
			max = max > len ? max : len;
		}
		
		bw.write(max + "\n");
		
		bw.close();
		br.close();
		
	}
	
	public static int getMaxPath(int s, int e, int[][] arr, int[][] path) {
		if(path[s][e] > -1) { // 중복제거를 위한 로직 (이전에 계산했던 부분은 계산 또 하지 않고, 불러오기!)
			return path[s][e];
		} else {
			if(s == 0) {
				path[s][e] = arr[s][e];
			} else if(e == 0) {
				path[s][e] = getMaxPath(s - 1, e, arr, path) + arr[s][e];
			} else {
				path[s][e] = Math.max(getMaxPath(s - 1, e - 1 , arr, path), getMaxPath(s - 1, e, arr, path)) + arr[s][e];
			}
		}
		return path[s][e];
	}

}
