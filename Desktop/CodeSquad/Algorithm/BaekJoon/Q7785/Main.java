package Q7785;

import java.io.*;
import java.util.*;

public class Main {
   /*
      문제 : 회사에 있는 사람
      url : https://www.acmicpc.net/problem/7785
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Queue<String> enters = new PriorityQueue<>(Collections.reverseOrder());
        Queue<String> leaves = new PriorityQueue<>(Collections.reverseOrder());

        for(int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            if(input[1].equals("enter")) enters.add(input[0]);
            else leaves.add(input[0]);
        }

        while(!enters.isEmpty()) {
            if(leaves.isEmpty() || !enters.peek().equals(leaves.peek())) {
                sb.append(enters.poll()).append(System.lineSeparator());
            } else {
                enters.poll();
                leaves.poll();
            }
        }

        bw.write(sb.toString());
        bw.close();
    }
}