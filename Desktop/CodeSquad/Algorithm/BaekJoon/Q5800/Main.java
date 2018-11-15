package Q5800;

import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
	/*
 		문제 : 성정통계
 		url : https://www.acmicpc.net/problem/5800
 		재풀이 : X
	 */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());

        for(int i = 1; i <= n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int[] score = new int[Integer.parseInt(st.nextToken())];
            for (int j = 0; j < score.length; j++) {
                score[j] = Integer.parseInt(st.nextToken());
            }
            Arrays.sort(score);
            int gap = 0;
            for (int j = score.length - 1; j > 0; j--) {
                gap = Math.max(gap, score[j] - score[j - 1]);
            }
            sb.append(String.format("Class %d\n", i));
            sb.append(String.format("Max %d, Min %d, Largest gap %d\n", score[score.length - 1], score[0], gap));
        }

        bw.write(sb.toString());
        bw.close();
    }

}
