package Q11718;

import java.io.*;

public class Main {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int a = 0;

		while((a = br.read())!= -1) {
			System.out.print((char)a);
		}
	}

}