package Q2445;

import java.io.*;

public class Main {
   /*
       문제 : 별찍기 - 8
       url : https://www.acmicpc.net/problem/2445
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n - 1; i++) {
            for(int j = 0; j <= i; j++) {
                sb.append("*");
            }

            for(int j = 0; j < 2 * n - (i + 1) * 2; j++) {
                sb.append(" ");
            }

            for(int j = 0; j <= i; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }

        bw.write(sb.toString());
        for(int i = 0; i < 2 * n; i++) {
            sb.append("*");
        }
        bw.write(sb.reverse().toString());

        bw.close();
    }
}