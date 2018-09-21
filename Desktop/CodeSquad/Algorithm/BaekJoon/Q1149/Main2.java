package Q1149;

import java.io.*;

public class Main2 {

	public static void main(String[] args) throws IOException {
		/* 2018.08.27 */
		/* [동적계획법 이론 : http://secom.hanbat.ac.kr/or/ch10/right04.html] */
		/*
		 1. 문제
			RGB거리에 사는 사람들은 집을 빨강, 초록, 파랑중에 하나로 칠하려고 한다. 
			또한, 그들은 모든 이웃은 같은 색으로 칠할 수 없다는 규칙도 정했다. 
			집 i의 이웃은 집 i-1과 집 i+1이다. 처음 집과 마지막 집은 이웃이 아니다.
			각 집을 빨강으로 칠할 때 드는 비용, 초록으로 칠할 때 드는 비용, 파랑으로 드는 비용이 주어질 때, 
			모든 집을 칠할 때 드는 비용의 최솟값을 구하는 프로그램을 작성하시오.

		 2. 입력
			첫째 줄에 집의 수 N이 주어진다. N은 1,000보다 작거나 같다. 
			둘째 줄부터 N개의 줄에 각 집을 빨강으로 칠할 때, 초록으로 칠할 때, 파랑으로 칠할 때 드는 비용이 주어진다. 
			비용은 1,000보다 작거나 같은 자연수이다.

		 3. 출력
			첫째 줄에 모든 집을 칠할 때 드는 비용의 최솟값을 출력한다. 
		 * */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	
		/* 1. 입력값 초기화 */
		int homeNum = Integer.parseInt(br.readLine());
		int[][] arr = new int[homeNum][3];
		for(int i = 0; i < homeNum; i++) {
			String[] input = br.readLine().split((" "));
			for(int j = 0; j < input.length; j++) {
				arr[i][j] = Integer.parseInt(input[j]);
			}
		}
		
		bw.write(getPrint(arr, homeNum) + "\n");
		
		bw.close();
		br.close();

	}
	
	public static int[] getResult(int[] arr, int[] arr2, int stage) {
		int[] result = new int[arr.length];
		for(int i = 0; i < result.length; i++) {
			if(i == 0) result[i] = Math.min(arr2[1], arr2[2]) + arr[i];
			else if(i == 1) result[i] = Math.min(arr2[0], arr2[2]) + arr[i];
			else result[i] = Math.min(arr2[0], arr2[1]) + arr[i];
		}
		return result;
	}
	
	public static int getPrint(int[][] arr, int num) {
		int[][] result = new int[num][3];
		for(int i = 0; i < arr[0].length; i++) {
			result[0][i] = arr[0][i];
		}
		
		for(int i = 1; i < num; i++) {
			result[i] = getResult(arr[i], result[i - 1], i);
		}
		
		return Math.min(result[num - 1][0], Math.min(result[num - 1][1], result[num - 1][2]));
	}

}
