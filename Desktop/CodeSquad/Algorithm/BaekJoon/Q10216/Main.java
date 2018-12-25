package Q10216;

import java.io.*;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
public class Main {
   /*
      문제 : Count Circle Groups
      url : https://www.acmicpc.net/problem/10216
      재풀이 : O
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int  t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            int  n = Integer.parseInt(br.readLine());
            List<Point> points = new ArrayList<>();
            for(int j = 0; j < n; j++) {
                String[] input = br.readLine().split(" ");
                points.add(new Main().new Point(Integer.parseInt(input[0]), Integer.parseInt(input[1]), Integer.parseInt(input[2])));
            }

            boolean[] visited = new boolean[points.size()];
            int cnt = 0;
            for(int j = 0; j < points.size(); j++) {
                if(!visited[j]) {
                    visited[j] = true;
                    bfs(points, j, visited);
                    cnt++;
                }
            }
            sb.append(cnt + "\n");
        }
        bw.write(sb.toString());
        bw.close();
    }

    public static void bfs(List<Point> points, int index, boolean[] visited) {
        Queue<Point> temp = new ConcurrentLinkedQueue<>();
        temp.add(points.get(index));

        while(!temp.isEmpty()) {
            Point standard = temp.poll();
            for(int i = 0; i < points.size(); i++) {
                if(!visited[i] && standard.isContinous(points.get(i))) {
                    visited[i] = true;
                    temp.add(points.get(i));
                }
            }
        }
    }

    public class Point {
        private int x;
        private int y;
        private int r;

        public Point(int x, int y , int r) {
            this.x = x;
            this.y = y;
            this.r = r;
        }

        public boolean isContinous(Point point) {
            return Math.sqrt(Math.pow(this.x - point.x, 2) + Math.pow(this.y - point.y, 2)) <= this.r +point.r;
        }
    }
}
