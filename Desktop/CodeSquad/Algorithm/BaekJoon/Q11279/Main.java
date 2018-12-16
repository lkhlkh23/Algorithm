package Q11279;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
   /*
       문제 : 최대힙
       url : https://www.acmicpc.net/problem/11279
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        /* 배열로 풀었더라면 계속 정렬을 해줘야하는데 이렇게 푸니까 시간복잡도가 적어지네!
            왜냐면 push pop의 시간복잡도는 logN이므로 n개의 수로 문제를 풀 경우 --> NlogN이다
            그러나 정렬을 사용한다면, 삽입, 삭제할때마다 정렬을 해야하기 때문에 N^2logN
        */
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
