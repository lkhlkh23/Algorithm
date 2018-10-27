package Q11052;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    /* 카드구매하기
    *     url : https://www.acmicpc.net/problem/11052 */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] p = new int[st.countTokens()];
        int index = 0;
        while(st.hasMoreTokens()) {
            p[index++] = Integer.parseInt(st.nextToken());
        }

        int[] result = new int[n];
        result[0] = p[0];
        result[1] = Math.max(p[1], p[0] * 2);
        for(int i = 2; i < result.length; i++) {
            result[i] = Math.max(p[i], result[i - 2] + result[i - 1]);
        }

        for(int num : result) {
            System.out.println(num + "\t" + "!");
        }

        bw.write(result[n - 1] + "\n");
        bw.close();
    }
}
