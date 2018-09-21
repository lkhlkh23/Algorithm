package Q2407;

import java.math.BigInteger;
import java.util.Scanner;

public class Another {
	public static void main(String[]args) {
		Scanner 	in 	= new Scanner(System.in);
		BigInteger 	ret = new BigInteger("1");
		int 		n	= in.nextInt(),
					r 	= in.nextInt();
		
		for (int i = 1; i <= r; i++) {
			ret = ret.multiply(BigInteger.valueOf(n - i + 1)).divide(BigInteger.valueOf(i));
		}
		System.out.println(ret);
	}
}