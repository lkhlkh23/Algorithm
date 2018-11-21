package Q9251;

import java.io.*;
import java.util.Random;

public class Main {
   /*
       문제 : LCS
       url : https://www.acmicpc.net/problem/9251
       재풀이 : O
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String first = br.readLine();
        String second = br.readLine();
        boolean[][] visited = new boolean[1000][1000];
        int[][] values = new int[1000][1000];
        bw.write(LCS(visited, values, first, second, first.length() - 1, second.length() - 1) + "\n");
        bw.close();
    }

    public static int LCS(boolean[][] visited, int[][] values, String first, String second, int firstIndex, int secondIndex) {
        if(firstIndex < 0 || secondIndex < 0) return 0;
        if(visited[firstIndex][secondIndex]) return values[firstIndex][secondIndex];
        visited[firstIndex][secondIndex] = true;
        if(first.charAt(firstIndex) == second.charAt(secondIndex)) {
            values[firstIndex][secondIndex] = 1 + LCS(visited, values, first, second, firstIndex - 1, secondIndex - 1);
        } else {
            values[firstIndex][secondIndex] = Math.max(LCS(visited, values, first, second, firstIndex - 1, secondIndex)
                    , LCS(visited, values, first, second, firstIndex, secondIndex - 1));
        }
        return values[firstIndex][secondIndex];
    }
}