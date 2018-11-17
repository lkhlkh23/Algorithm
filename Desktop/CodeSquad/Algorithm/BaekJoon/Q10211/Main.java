package Q10211;

import java.io.*;
import java.util.*;

public class Main {
   /*
       문제 : Maximum Subarray
       url : https://www.acmicpc.net/problem/10211
       재풀이 : X
    */

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int[] arr = new int[n];
            String[] input = br.readLine().split(" ");
            arr[0] = Integer.parseInt(input[0]);
            int max = arr[0];
            for (int j = 1; j < input.length; j++) {
                int num = Integer.parseInt(input[j]);
                arr[j] = Math.max(arr[j - 1] + num, num);
                max = Math.max(arr[j], max);
            }
            bw.write(max + "\n");
        }

        bw.close();
    }

}