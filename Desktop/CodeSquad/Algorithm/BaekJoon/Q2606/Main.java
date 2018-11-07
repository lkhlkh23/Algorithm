package Q2606;

import java.io.*;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {
    /*
	 	문제 : 바이러스
	 	url : https://www.acmicpc.net/problem/2606
	 	재풀이 : X
	*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 입력값 초기화 //
        int countOfComputer = Integer.parseInt(br.readLine());
        int countOfPair = Integer.parseInt(br.readLine());
        int[][] arr = new int[countOfPair + 1][2];
        for (int i = 1; i < arr.length; i++) {
            String[] line = br.readLine().split(" ");
            arr[i][0] = Integer.parseInt(line[0]);
            arr[i][1] = Integer.parseInt(line[1]);
        }

        // 2. BFS 알고리즘 //
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        boolean[] visited = new boolean[countOfComputer + 1];

        queue.add(1);
        visited[1] = true;
        int answer = 0;
        while(!queue.isEmpty()) {
            int node = queue.poll();
            for(int i = 1; i < arr.length; i++) {
                if(arr[i][0] == node && visited[arr[i][1]] == false) {
                    visited[arr[i][1]] = true;
                    queue.add(arr[i][1]);
                    answer++;
                }
                if(arr[i][1] == node && visited[arr[i][0]] == false) {
                    visited[arr[i][0]] = true;
                    queue.add(arr[i][0]);
                    answer++;
                }
            }
        }

        System.out.println(answer);

    }
}
