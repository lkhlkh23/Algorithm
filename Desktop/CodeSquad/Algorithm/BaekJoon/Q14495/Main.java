package Q14495;

import java.io.*;

public class Main {
   /*
       문제 : 피보나치 비스무리한 수열
       url : https://www.acmicpc.net/problem/14495
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        long[] arr = new long[116 + 1];
        arr[1] = arr[2] = arr[3] = 1;
        for(int i = 4; i <= n; i++) {
            arr[i] = arr[i - 1] + arr[i - 3];
        }
        bw.write(arr[n] + "\n");
        bw.close();
    }

}