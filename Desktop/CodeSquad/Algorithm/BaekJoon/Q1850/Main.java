package Q1850;
import java.util.*;

public class Main {
	/*
	 	문제 : 최대공약수
	 	url : https://www.acmicpc.net/problem/1850
	 	재풀이 : X
	*/

	public static void main(String[] args) {
		/*
		 1. 문제
			모든 자리가 1로만 이루어져있는 두 자연수 A와 B가 주어진다. 이 때, A와 B의 최대 공약수를 구하는 프로그램을 작성하시오.
			예를 들어, A가 111이고, B가 1111인 경우에 A와 B의 최대공약수는 1이고, A가 111이고, B가 111111인 경우에는 최대공약수가 111이다.

		 2. 입력
			첫째 줄에 두 자연수 A와 B를 이루는 1의 개수가 주어진다. 입력되는 수는 263보다 작은 자연수이다.

		 3. 출력
			첫째 줄에 A와 B의 최대공약수를 출력한다. 정답은 천만 자리를 넘지 않는다. 
		 * */   
	    Scanner sc = new Scanner(System.in);
	    long a = sc.nextLong();
	    long b = sc.nextLong();
	    
	    System.out.println(getResult(getGCD(a, b)));
	    sc.close();

	}
	
	public static long getGCD(long a, long b) {
		long max = Math.max(a, b);
		long min = Math.min(a, b);
		
		if (max % min == 0) return min;
		else return getGCD(max % min, min);
	}
	
	public static String getResult(long n) {
		StringBuilder sb = new StringBuilder();
		for(int i = 0; i < n; i++)
			sb.append("1");
		
		return sb.toString();
	}	

}
