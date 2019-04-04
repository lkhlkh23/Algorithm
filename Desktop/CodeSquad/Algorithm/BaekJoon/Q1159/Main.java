package Q1159;

import java.io.*;

public class Main {
   /*
      문제 : 농구경기
      url : https://www.acmicpc.net/problem/1159
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] counts = new int[('z' - 'a') + 1];
        for (int i = 0; i < n; i++)
            counts[br.readLine().charAt(0) - 'a']++;

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < counts.length; i++)
            if (counts[i] >= 5)
                sb.append((char) ('a' + i));

        bw.write(sb.toString().length() > 0 ? sb.toString() : "PREDAJA");
        bw.close();
    }
}
