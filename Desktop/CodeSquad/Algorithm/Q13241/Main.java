package Q13241;

import java.io.*;
import java.util.StringTokenizer;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		long n1 = Long.parseLong(st.nextToken());
		long n2 = Long.parseLong(st.nextToken());
		
		bw.write(getLCD(n1, n2, getGCD(n1, n2)) + "\n");
		bw.close();
		

	}
	
	public static Long getGCD(long n1, long n2) {
		long max = Math.max(n1, n2);
		long min = Math.min(n1, n2);
		if(max % min == 0) return min;
		else return getGCD(max % min, min);		
	}
	
	public static long getLCD(long n1, long n2, long gcd) {
		return n1 * n2 / gcd;
	}

}
