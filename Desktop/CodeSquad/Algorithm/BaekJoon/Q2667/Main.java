package Q2667;

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    /*
	 	문제 : 단지번호붙이기
	 	url : https://www.acmicpc.net/problem/2667
	 	재풀이 : O
	*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            char[] chars = br.readLine().toCharArray();
            int j = 0;
            for(char c : chars) {
                arr[i][j++] = c - '0';
            }
        }

        boolean[][] visited = new boolean[arr.length][arr[0].length];
        int cnt = 0;
        List<Integer> list = new ArrayList<>();
        for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(arr[j][i] == 1 && visited[j][i] == false) {
                    cnt++;
                    list.add(findBlock(j, i, arr, visited) + 1);
                }
            }
        }
        Collections.sort(list);
        bw.write(cnt + "\n");
        for(int num : list)
            bw.write(num + "\n");

        bw.close();
        br.close();
    }

    public static int findBlock(int y, int x, int[][] arr, boolean[][] visited) {
        // 이미 방문했거나, 값이 0 이면 false
        int cnt = 0;
        visited[y][x] = true;
        if(x > 0 && arr[y][x - 1] == 1 && !visited[y][x - 1])
            cnt += (findBlock(y, x - 1, arr, visited) + 1); // 좌이동

        if(x < arr.length - 1 && arr[y][x + 1] == 1  && !visited[y][x + 1])
            cnt += (findBlock(y, x + 1, arr, visited) + 1); // 우이동

        if(y > 0 && arr[y - 1][x] == 1  && !visited[y - 1][x])
            cnt += (findBlock(y - 1, x, arr, visited) + 1); // 위 이동

        if(y < arr.length - 1 && arr[y + 1][x] == 1 && !visited[y + 1][x])
            cnt += (findBlock(y + 1, x, arr, visited) + 1); // 아래 이동

        return cnt;
    }
}
