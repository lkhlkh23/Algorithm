package Q2193;

import java.io.*;

public class Main {
   /*
       문제 : 이친수
       url : https://www.acmicpc.net/problem/2193
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[90 + 1];
        arr[1] = 2;
        arr[2] = 1;

        for(int i = 3; i <= n; i++) {
            for(int j = i - 2; j > 0 - 1; j--) {
                arr[i] += arr[j];
            }
        }

        bw.write((n == 1 ? 1 : arr[n]) + "\n");
        bw.close();
    }

}