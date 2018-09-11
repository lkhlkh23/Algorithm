package Q11050;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws IOException {
		/* 2018.08.21 */
		
		// nCk +nC(k+1) = (n+1)C(k+1)
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringTokenizer st = new StringTokenizer(br.readLine());
		int N = Integer.parseInt(st.nextToken());
		int K = Integer.parseInt(st.nextToken());
		
		bw.write(loopBinomial(N, K) + "\n");
		
		br.close();
		bw.close();
		
	}

	public static long loopBinomial(int n, int k) {
		if(n/2 < k) k = n - k; // nCk = cC(n-k)
		long[][] arr = new long[n+2][n+2];
		arr[0][0] = 0;
		arr[0][1] = 1;
		for(int i = 1; i < arr.length; i++) {
			for(int j = 1; j <= i; j++) {
				arr[i][j] = (arr[i-1][j-1] + arr[i-1][j]);
			}
		}
		
		return arr[n+1][k+1];
	}

}
