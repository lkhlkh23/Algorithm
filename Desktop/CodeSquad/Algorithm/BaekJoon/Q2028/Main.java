package Q2028;

import java.io.*;

public class Main {
   /*
      문제 : 자기복제수
      url : https://www.acmicpc.net/problem/2028
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            String str = String.valueOf(n);
            String pow = ((int)Math.pow(n, 2)) + "";
            bw.write((pow.substring(pow.length() - str.length()).equals(str) ? "YES" : "NO") + "\n");
        }

        bw.close();
    }
}

