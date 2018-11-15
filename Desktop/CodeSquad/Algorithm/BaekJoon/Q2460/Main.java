package Q2460;

import java.io.*;
import java.util.*;

public class Main {
	/*
 		문제 : 지능형 기차2
 		url : https://www.acmicpc.net/problem/2460
 		재풀이 : X
	 */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int max = 0;
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sum += (- Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken()));
            max = Math.max(max, sum);
        }

        bw.write(max + "\n");
        bw.close();
    }

}
