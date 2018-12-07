package Q9288;

import java.io.*;
import java.util.Random;

public class Main {
   /*
       문제 : More dice
       url : https://www.acmicpc.net/problem/9288
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            sb.append(String.format("Case %d:\n", (i + 1)));
            for(int j = num > 7 ? num - 6 : 1; j <= num / 2; j++) {
                sb.append(String.format("(%d,%d)\n", j, (num - j)));
            }
        }
        bw.write(sb.toString());
        bw.close();
    }

}