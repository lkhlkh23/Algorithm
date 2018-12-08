package Q2495;

import java.io.*;

public class Main {
   /*
       문제 : 연속구간
       url : https://www.acmicpc.net/problem/2495
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        for (int i = 0; i < 3; i++) {
            char[] arr = br.readLine().toCharArray();
            int max = 0;
            for (int j = 0; j < arr.length - 1; j++) {
                int cnt = 1;
                for (int k = j; k < arr.length - 1; k++) {
                    if(arr[k] == arr[k + 1]) cnt++;
                    else break;
                }
                max = Math.max(max, cnt);
            }
            bw.write(max + "\n");
        }
        bw.close();
    }

}