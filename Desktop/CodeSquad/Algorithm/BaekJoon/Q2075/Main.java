package Q2075;

import java.io.*;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
   /*
       문제 : N번째 큰수
       url : https://www.acmicpc.net/problem/2075
       재풀이 : O
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        PriorityQueue<Integer>[] arr = new PriorityQueue[n];

        for (int i = 0; i < n; i++) {
            arr[i] = new PriorityQueue<>(Collections.reverseOrder());
            String[] input = br.readLine().split(" ");
            for (int j = 0; j < input.length; j++) {
                arr[i].add(Integer.parseInt(input[j]));
            }
        }

        int index = 0, count = 0, num = 0;

        while(count < n) {
            num = arr[0].peek();
            index = 0;
            for (int i = 1; i < n; i++) {
                if(num < arr[i].peek()) {
                    num = arr[i].peek();
                    index = i;
                }
            }
            arr[index].poll();
            count++;
        }

        bw.write(num + "\n");
        bw.close();
    }
}
