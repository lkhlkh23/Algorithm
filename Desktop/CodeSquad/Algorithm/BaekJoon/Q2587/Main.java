package Q2587;

import java.io.*;
import java.util.Arrays;

public class Main {
   /*
      문제 : 대표값2
      url : https://www.acmicpc.net/problem/2587
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[5];
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            sum += arr[i];
        }

        Arrays.sort(arr);

        bw.write((sum / arr.length) + " " + arr[2] + "\n");
        bw.close();
    }
}