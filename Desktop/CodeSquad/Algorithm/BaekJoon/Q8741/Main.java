package Q8741;

import java.io.*;

public class Main {
   /*
       문제 : 이진수의합
       url : https://www.acmicpc.net/problem/8741
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n; i++)
            sb.append("1");

        for(int i = 0; i < n - 1; i++)
            sb.append("0");

        bw.write(sb.toString());
        bw.close();
    }


}