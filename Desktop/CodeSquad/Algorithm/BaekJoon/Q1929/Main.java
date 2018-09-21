package Q1929;

import java.io.*;
import java.util.*;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		StringTokenizer st = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st.nextToken());
		int N = Integer.parseInt(st.nextToken());
		
		boolean[] flags = (initPrime(N));
		
		bw.write(printPrimeNumber(flags, M));

		br.close();
	}
	
	public static boolean[] initPrime(int n) {
		boolean[] arr = new boolean[n + 1];
		arr[0] = arr[1] = true;
		for(int i = 2; i <= n; i++) {
			if(!arr[i]) {
				for(int j = i + i; j <= n; j+=i) 
					arr[j] = true;
			}
		}
		
		return arr;
	}	
	
	public static String printPrimeNumber(boolean[] arr, int m) {
		StringBuilder sb = new StringBuilder();
		for(int i = m; i < arr.length; i++) 
			if(!arr[i]) sb.append(i + "\n");
		
		return sb.toString();
	}
}
