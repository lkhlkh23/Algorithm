package Q2178;

import java.io.*;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Main {

    /*
	 	문제 : 미로탐색
	 	url : https://www.acmicpc.net/problem/2178
	 	재풀이 : O
	*/
    private static boolean isComplete = false;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        // 1. 입력 초기화 //
        String[] line = br.readLine().split(" ");
        int m = Integer.parseInt(line[0]);
        int n = Integer.parseInt(line[1]);
        boolean[][] maze = new boolean[m][n];
        for (int i = 0; i < maze.length; i++) {
            char[] splited = br.readLine().toCharArray();
            for (int j = 0; j < splited.length; j++) {
                maze[i][j] = splited[j] == '1' ? true : false;
            }
        }

        // 2. BFS 알고리즘 //
        boolean[][] visited = new boolean[m][n];
        int[][] result = new int[m][n];
        Queue<Integer> xs = new ConcurrentLinkedQueue<>();
        Queue<Integer> ys = new ConcurrentLinkedQueue<>();

        visited[0][0] = true;
        xs.add(0);
        ys.add(0);
        result[0][0] = 1;

        while(!xs.isEmpty()) {
            int x = xs.poll();
            int y = ys.poll();
            if(y > 0 && maze[y - 1][x] && visited[y - 1][x] == false) {
                plus(visited, xs, ys, result, x, y - 1, result[y][x]);
            }
            if(y < maze.length - 1 && maze[y + 1][x] && visited[y + 1][x] == false) {
                plus(visited, xs, ys, result, x, y + 1, result[y][x]);
            }
            if(x > 0 && maze[y][x - 1] && visited[y][x - 1] == false) {
                plus(visited, xs, ys, result, x - 1, y, result[y][x]);
            }
            if(x < maze[0].length - 1 && maze[y][x + 1] && visited[y][x + 1] == false) {
                plus(visited, xs, ys, result, x + 1, y, result[y][x]);
            }
        }

        bw.write(result[m - 1][n - 1] + "\n");
        bw.close();


    }

    public static void plus(boolean[][] visited, Queue<Integer> xs, Queue<Integer> ys, int[][] result, int x, int y, int prevNode) {
        visited[y][x] = true;
        xs.add(x);
        ys.add(y);
        result[y][x] = prevNode + 1;
    }
}
