package Q1037;

import java.io.*;
import java.util.Arrays;

public class Main {
   /*
      문제 : 약수
      url : https://www.acmicpc.net/problem/1037
      재풀이 : X
   */

    private static final String BLANK = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(BLANK);
        int[] arr = new int[n];
        for(int i = 0; i < arr.length; i++)
            arr[i] = Integer.parseInt(input[i]);

        Arrays.sort(arr);

        bw.write((arr[0] * arr[arr.length - 1]) + "\n");
        bw.close();
    }
}