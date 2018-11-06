package Q6591;

import java.io.*;

public class Main {
	/*
	 	문제 : 이항쇼다운
	 	url : https://www.acmicpc.net/problem/6591
	 	재풀이 : O
	*/

	public static void main(String[] args) throws IOException, InterruptedException {
		/* 2018.08.24 */
		/*
		 1. 문제
			n개의 원소 중에서 k개를 순서 없이 선택하는 방법의 수는 몇 가지 일까?

		 2. 입력
			입력은 하나 또는 그 이상의 테스트 케이스로 이루어져 있다.
			각 테스트 케이스는 한 줄로 이루어져 있으며, (2^31)-1 을 넘지 않는 
			두 자연수 n(n ≥ 1)과 k(0 ≤ k ≤n)로 이루어져 있다.
			입력의 마지막 줄에는 0이 두 개 주어진다.

		 3. 출력
			각 테스트 케이스에 대해서, 정답을 출력한다. 항상 정답이 2^31보다 작은 경우만 입력으로 주어진다. 
		 */
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		String str = "";
	
		int[][] arr = initArray();
		
		while(!(str = br.readLine()).equals("0 0")) {
			int n = Integer.parseInt(str.split(" ")[0]);
			int k = Integer.parseInt(str.split(" ")[1]);
			k = n/2 < k ? n - k : k;
			if(k == 0) {
				sb.append(1 + "\n");
			} else if(k == 1) {
				sb.append(n + "\n");
			} else {
				sb.append(arr[n][k] + "\n");
			}
		}
		
		bw.write(sb.toString());
		
		bw.close();
		br.close();
	}
	
	/* 1. 입력받는 즉시, 결과 출력하는 방식 ---> 테스트케이스가 많아지면 시간 초과!  */
	public static long getResult(int n, int k) {
		long result = 1;
		k = n/2 < k ? n - k : k;
		for(int i = 1; i <= k; i++) 
			result = result * (n - i + 1) / i;
		
		return result;
	}
	
	/* 2. 배열에 모든 결과 값을 저장하고 출력하는 방식 ---> 배열의 크기가 너무 커서 메모리 초과! */
	public static int[][] initArr(int n, int k) {
		int[][] arr = new int[n + 1][k + 1];
		int result = 1;
		for(int i = 1; i <= n; i++) {
			result = 1;
			int l = 1;
			arr[i][0] = 1;
			for(int j = 1; j <=k && i >= j; j++) {
				result = result * (i - j + 1) / l;
				arr[i][j] = result;
				l++;
			}
		}
		
		return arr;
	}
	
	/* 3. 배열의 크기를 작게 설정 --> 결과값이 Integer.MAX_VALUE 보다 값이 작다는 것을 이용 */
	public static int[][] initArray() throws InterruptedException {
		long result = 1;
		/* (n * (n-1)) / 2 <= Integer.MAX_VALUE 에서 나오는 n의 값은 nC2	가 가질 수 있는 최대 n값이다. */
		int max1 = (int)((Math.pow(Integer.MAX_VALUE, 0.5) + 1)*(Math.pow(2, 0.5)));

		/* nC(n/2) 에서 최대 n */
		int max2 = getMaxSize();
		int[][] arr = new int[max1 + 1][max2 + 1];
		for(int i = 1; i <= max1; i++) {
			result = 1;
			int l = 1;
			for(int j = 1; j <=i && j <= (int)(Math.round(i/2)); j++) {
				result = result * (i - j + 1) / l;
				if(result >= Integer.MAX_VALUE) break;
				l++;
				arr[i][j] = (int)result;
			}
		}
		return arr;
	}
	
	public static int getMaxSize() {
		int i = 2;
		while(true) {
			if(getResult(i, i/2) < 0) return i;
			i++;
		}
	}
}
