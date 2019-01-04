package Q4458;

import java.io.*;

public class Main {
   /*
      문제 : 첫 글자를 대문자로
      url : https://www.acmicpc.net/problem/4458
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String input = br.readLine();
            sb.append(input.substring(0, 1).toUpperCase()).append(input.substring(1)).append("\n");
        }
        bw.write(sb.toString());
        bw.close();
    }
}