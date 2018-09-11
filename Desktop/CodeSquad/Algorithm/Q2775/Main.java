package Q2775;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	/* 2018.08.07 */
	/*
	 1. 문제
		이 아파트에 거주를 하려면 조건이 있는데, “a층의 b호에 살려면 자신의 아래(a-1)층에 1호부터 b호까지 
		사람들의 수의 합만큼 사람들을 데려와 살아야한다” 는 계약 조항을 꼭 지키고 들어와야 한다.
		아파트에 비어있는 집은 없고 모든 거주민들이 이 계약 조건을 지키고 왔다고 가정했을 때, 
		주어지는 양의 정수 k와 n에 대해 k층에 n호에는 몇 명이 살고 있나를 출력하라. 
		단, 아파트에는 0층부터 있고 각층에는 1호부터 있으며, 0층에 i호에는 i명이 산다.

	 2. 입력
		첫 번째 줄에 Test case의 수 T가 주어진다. 그리고 각각의 케이스마다 입력으로 
		첫 번째 줄에 정수 k, 두 번째 줄에 정수 n이 주어진다. (1 <= k <= 14, 1 <= n <= 14)

	 3. 출력
		각각의 Test case에 대해서 해당 집에 거주민 수를 출력하라.
	 */
		
		Scanner sc = new Scanner(System.in);
		int caseNum = sc.nextInt();
		int[] floor = new int[caseNum];
		int[] roomNum = new int[caseNum]; // 10
		int[][] residents;
		
		for(int i = 0; i < caseNum; i++) {
			floor[i] = sc.nextInt();
			roomNum[i] = sc.nextInt();
		}
		
		residents = new int[getMax(floor)+1][getMax(roomNum)];
		
		for(int i = 0; i < residents[0].length; i++) {
			residents[0][i] = (i+1);
		}
		
		for(int j = 0; j < residents.length; j++) {
			residents[j][0] = 1;
		}
		
		for(int i = 1; i < residents.length; i++) {
			for(int j = 1; j < residents[i].length; j++) {
				residents[i][j] = residents[i][j-1] + residents[i-1][j];
			}
		}
		
		for(int i = 0; i < caseNum; i++) {	
			System.out.println(residents[floor[i]][roomNum[i]-1]);
		}
	
		
	}
	
	public static int getMax(int[] arr) {
		int max = 0;
		for(int i = 0; i < arr.length; i++) {
			max = max > arr[i] ? max : arr[i];
		}
		
		return max;
	}
	
}
