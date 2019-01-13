package Q11659;

import java.io.*;
public class Main {
   /*
      문제 : 구간 합 구하기
      url : https://www.acmicpc.net/problem/11659
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[1]);


        input = br.readLine().split(" ");
        int[] arr = new int[Integer.parseInt(input[0]) + 1];
        for (int i = 1; i < arr.length; i++)
            arr[i] = Integer.parseInt(input[i - 1]);

        int[] sum = new int[arr.length + 1];
        for (int i = 1; i < input.length; i++)
            sum[i] = arr[i] + sum[i - 1];

        for (int i = 0; i < m; i++) {
            input = br.readLine().split(" ");
            sb.append(-sum[Integer.parseInt(input[0])] + sum[Integer.parseInt(input[1]) - 1] + arr[Integer.parseInt(input[0])])
                    .append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }
}
