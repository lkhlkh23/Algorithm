package Q5988;

import java.io.*;

public class Main {
	/*
 		문제 : 홀수일까? 짝수일까?
 		url : https://www.acmicpc.net/problem/5988
 		재풀이 : X
	 */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String input = br.readLine();
            if((input.charAt(input.length() - 1) - '0') % 2 == 0) {
                sb.append("even\n");
            } else {
                sb.append("odd\n");
            }
        }

        bw.write(sb.toString());
        bw.close();
    }

}
