package Q11286;

import java.io.*;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
   /*
       문제 : 절대값 힙
       url : https://www.acmicpc.net/problem/11286
       재풀이 : O
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Queue<Integer> pq = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (Math.abs(o1) > Math.abs(o2) || (Math.abs(o1) == Math.abs(o2) && o1 > o2)) return 1;
                else return -1;
            }
        });

        Queue<Integer> priorityQueue = new PriorityQueue<Integer>((a, b) ->
                Math.abs(a) > Math.abs(b) || (Math.abs(a) == Math.abs(b) && a > b) ? 1 : -1
        );

        for (int i = 0; i < n; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num == 0) sb.append((priorityQueue.isEmpty() ? 0 : priorityQueue.poll()) + "\n");
            else priorityQueue.add(num);
        }

        bw.write(sb.toString());
        bw.close();
    }
}
