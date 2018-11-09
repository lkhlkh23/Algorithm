package Q1024;

import java.io.*;

public class Main {
    /*
       문제 : 수열의 합
       url : https://www.acmicpc.net/problem/1024
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int N = Integer.parseInt(input[0]);
        int L = Integer.parseInt(input[1]);
        boolean flag = true;
        for (int i = L; i <= 100 && flag; i++) {
            if((2 * N >= i * (i - 1)) && (2 * N - i * (i - 1)) % (2 * i) == 0) {
                int a = ((2 * N - i * (i - 1)) / (2 * i));
                for (int j = 0; j < i; j++) {
                    bw.write((a + j) + " ");
                }
                bw.write("\n");
                flag = false;
            }
        }

        if(flag) bw.write("-1 \n");
        bw.close();
    }
}
