package Q11005;

import java.io.*;

public class Main {
	/*
	 	문제 : 진법변환2
	 	url : https://www.acmicpc.net/problem/11005
	 	재풀이 : X
	*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        char[] arr = {
                '0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H',
                'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z'
        };

        String[] input = br.readLine().split(" ");
        double n = Double.parseDouble(input[0]);
        int b = Integer.parseInt(input[1]);

        while(n >= b) {
            sb.append(arr[(int)(n % b)]);
            n = Math.floor(n / b);
        }
        sb.append(arr[(int)n]);

        System.out.println(sb.reverse().toString());
    }


}
