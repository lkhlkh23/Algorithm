package Q1149;

import java.io.*;

public class Main3 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        /* 1. 입력값 초기화 */
        int homeNum = Integer.parseInt(br.readLine());
        int[][] arr = new int[homeNum][3];
        for(int i = 0; i < homeNum; i++) {
            String[] input = br.readLine().split((" "));
            for(int j = 0; j < input.length; j++) {
                arr[i][j] = Integer.parseInt(input[j]);
            }
        }

        int[][] result = new int[homeNum][3];
        for(int i = 0; i < 3; i++) {
            result[0][i] = arr[0][i];
        }

        for (int i = 1; i < homeNum; i++) {
            result[i][0] += (Math.min(result[i - 1][1], result[i - 1][2]) + arr[i][0]);
            result[i][1] += (Math.min(result[i - 1][0], result[i - 1][2]) + arr[i][1]);
            result[i][2] += (Math.min(result[i - 1][1], result[i - 1][0]) + arr[i][2]);
        }

        bw.write(Math.min(result[homeNum - 1][0], Math.min(result[homeNum - 1][1], result[homeNum - 1][0])) + "\n");
        bw.close();
    }
}
