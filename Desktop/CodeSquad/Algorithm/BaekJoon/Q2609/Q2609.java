package Q2609;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Q2609 {

	public static void main(String[] args) throws IOException {
		/*
		 1. 문제
			두 개의 자연수를 입력받아 최대 공약수와 최소 공배수를 출력하는 프로그램을 작성하시오.

		 2. 입력
			첫째 줄에는 두 개의 자연수가 주어진다. 이 둘은 10,000이하의 자연수이며 사이에 한 칸의 공백이 주어진다.

		 3. 출력
			첫째 줄에는 입력으로 주어진 두 수의 최대공약수를,둘째 줄에는 입력으로 주어진 두 수의 최소 공배수를 출력한다. 
		 * */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

		StringTokenizer st = new StringTokenizer(br.readLine());
		long n1 = Long.parseLong(st.nextToken());
		long n2 = Long.parseLong(st.nextToken());
		
		bw.write(getGCD(n1, n2) + "\n");
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
