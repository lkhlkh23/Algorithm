package Q3943;

import java.io.*;

public class Main {
   /*
       문제 : 헤일스톤 수열
       url : https://www.acmicpc.net/problem/3943
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            int max = n;
            while(n != 1) {
                n = n % 2 == 0 ? n / 2 : n * 3 + 1;
                max = Math.max(max, n);
            }
            sb.append(max + "\n");
        }

        bw.write(sb.toString());
        bw.close();
    }


}