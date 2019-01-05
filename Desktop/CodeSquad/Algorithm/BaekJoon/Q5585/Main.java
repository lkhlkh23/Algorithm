package Q5585;

import java.io.*;

public class Main {
   /*
      문제 : 거스름돈
      url : https://www.acmicpc.net/problem/5585
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int rest = 1000 - Integer.parseInt(br.readLine());
        int cnt = 0;
        while(rest > 0) {
            rest -= (rest >= 500 ? 500 : rest >= 100 ? 100 : rest >= 50 ? 50 : rest >= 10 ? 10 : rest >= 5 ? 5 : 1);
            cnt++;
        }

        bw.write(cnt + "\n");
        bw.close();
    }
}