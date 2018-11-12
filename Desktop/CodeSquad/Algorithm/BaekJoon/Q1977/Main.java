package Q1977;

import java.io.*;

public class Main {
    /*
       문제 : 완전재곱수
       url : https://www.acmicpc.net/problem/1977
       재풀이 : X
    */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int m = (int)Math.ceil(Math.sqrt(Double.parseDouble(br.readLine())));
        int n = (int)Math.sqrt(Double.parseDouble(br.readLine()));

        int sum = 0;
        for (int i = m; i <= n; i++) {
            sum += (i * i);
        }

        if(sum > 0) {
            bw.write(sum + "\n");
            bw.write((m * m) + "\n");
        } else {
            bw.write("-1" + "\n");
        }
        bw.close();

    }
}
