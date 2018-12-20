package Q11650;

import java.io.*;
import java.util.Arrays;

public class Main {
   /*
        문제 : 좌표정렬하기
        url : https://www.acmicpc.net/problem/11650
        재풀이 : X
   */

    public class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Point[] arr = new Point[n];
        for(int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            arr[i] = new Main().new Point(Integer.parseInt(input[0]), Integer.parseInt(input[1]));
        }
        Arrays.sort(arr, (o1, o2) -> (o1.x - o2.x > 0 || (o1.x -o2.x > 0 && o1.y - o2.y > 0) ? 1 : -1));

        for(int i = 0; i < arr.length; i++)
            sb.append(String.format("%d %d", arr[i].x, arr[i].y)).append(System.lineSeparator());

        bw.write(sb.toString());
        bw.close();
    }
}