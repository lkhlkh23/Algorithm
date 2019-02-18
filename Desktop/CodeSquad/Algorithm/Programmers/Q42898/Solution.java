package Q42898;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution {
    /*
	 	문제 : 등굣길
	 	url : https://programmers.co.kr/learn/courses/30/lessons/42898
	 	재풀이 : X
	*/

    public int solution(int m, int n, int[][] puddles) {
        int answer = 0;
        /* 웅덩이 초기화 */
        boolean[][] visited = new boolean[n][m];
        for (int i = 0; i < puddles.length; i++)
            visited[puddles[i][1] - 1][puddles[i][0] - 1] = true;

        /* DP 배열 초기화 */
        int[][] dp = new int[n][m];
        for (int i = 0; i < dp.length; i++)
            for (int j = 0; j < dp[i].length; j++)
                dp[i][j] = Integer.MAX_VALUE;

        Queue<Point> queue = new ConcurrentLinkedQueue<>();
        queue.add(new Point(0,0));
        while(!queue.isEmpty()) {
            Point extract = queue.poll();
            if(extract.y > 0 && !visited[extract.y - 1][extract.x]) {
                visit(queue, extract.x, extract.y - 1, extract.x, extract.y, dp, visited);
            }
            if(extract.y < n - 1 && !visited[extract.y + 1][extract.x]) {
                visit(queue, extract.x, extract.y + 1, extract.x, extract.y, dp, visited);
            }
            if(extract.x > 0 && !visited[extract.y][extract.x - 1]) {
                visit(queue, extract.x - 1, extract.y, extract.x, extract.y, dp, visited);
            }
            if(extract.x < m - 1 && !visited[extract.y][extract.x + 1]) {
                visit(queue, extract.x + 1, extract.y, extract.x, extract.y, dp, visited);
            }
        }
        return dp[n - 2][m - 1] - 1;
    }

    public void visit(Queue<Point> queue, int x, int y, int prevX, int prevY, int[][] dp, boolean[][] visited) {
        dp[y][x] = Math.min(dp[prevY][prevX] + 1, dp[y][x]);
        queue.add(new Point(x, y));
        visited[y][x] = true;
    }

    public class Point {
        private int x;
        private int y;

        public Point(int x, int y) {
            this.x = x;
            this.y = y;
        }

        @Override
        public String toString() {
            return "Point{" +
                    "x=" + x +
                    ", y=" + y +
                    '}';
        }
    }

    public static void main(String[] args) {
        int[][] puddles = {{2, 2}};
        System.out.println(new Solution().solution(4, 3, puddles)); // Expected : 4
        System.out.println("X");
    }
}
