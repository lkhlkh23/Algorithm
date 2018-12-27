package Q11650;

import java.io.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Main {
   /*
      문제 : 좌표 정렬하기
      url : https://www.acmicpc.net/problem/11650
      재풀이 : O
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        List<Point> points = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            points.add(new Main().new Point(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
        }

        Collections.sort(points, (o1, o2) -> o1.x - o2.x > 0 || (o1.x - o2.x == 0 && o1.y - o2.y > 0) ? 1 : -1);

        for(Point point : points)
            sb.append(point.x).append(" ").append(point.y).append("\n");

        bw.write(sb.toString());
        bw.close();
    }

    public class Point {
        public int x;
        public int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }
    }
}