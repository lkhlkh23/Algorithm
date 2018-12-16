package Q1927;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
   /*
       문제 : 최대힙
       url : https://www.acmicpc.net/problem/1927
       재풀이 : O
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num > 0) pq.add(num);
            else sb.append(pq.isEmpty() ? 0 : pq.poll()).append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }
}
