package Q1699;

import java.io.*;

public class Main {
   /*
       문제 : 제곱수의 합
       url : https://www.acmicpc.net/problem/1699
       재풀이 : X
    */

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n + 1];

        for (int i = 0; i < arr.length; i++)
            arr[i] = i;

        for (int i = 1; i < arr.length; i++)
            for (int j = 1; j * j <= i ; j++)
                arr[i] = Math.min(arr[i], arr[i - j * j] + 1);

        bw.write((arr[n]) + "\n");
        bw.close();
    }
}