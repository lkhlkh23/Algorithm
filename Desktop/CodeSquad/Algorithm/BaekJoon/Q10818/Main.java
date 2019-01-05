package Q10818;

import java.io.*;
import java.util.Arrays;

public class Main {
   /*
      문제 : 최소, 최대
      url : https://www.acmicpc.net/problem/10818
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < input.length; i++) {
            min = Math.min(min, Integer.parseInt(input[i]));
            max = Math.max(max, Integer.parseInt(input[i]));
        }

        bw.write(min + " " + max + "\n");
        bw.close();
    }
}