package Q2231;

import java.io.*;

public class Main {
   /*
      문제 : 분해합
      url : https://www.acmicpc.net/problem/2231
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        boolean flag = true;
        int i;
        for(i = n - (9 * String.valueOf(n).length()); i <= n && flag; i++) {
            int sum = i;
            char[] arr = String.valueOf(i).toCharArray();
            for(int j = 0; j < arr.length; j++)
                sum += (arr[j] - '0');

            flag = sum == n ? false : true;
        }

        bw.write((flag ? 0 : i - 1) + "\n");
        bw.close();
    }
}

