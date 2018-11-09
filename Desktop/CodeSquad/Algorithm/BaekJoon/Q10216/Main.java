package Q10216;

import java.io.*;

public class Main {
    /*
	 	문제 : Count Circle Group
	 	url : https://www.acmicpc.net/problem/10216
	 	재풀이 : O
	*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            int n = Integer.parseInt(br.readLine());
            boolean[][] area = new boolean[5000 + 1][5000 + 1];
            boolean[][] visited = new boolean[area.length][area[0].length];
            // 1. 입력값 초기화! //
            for (int j = 0; j < n; j++) {
                String[] line = br.readLine().split(" "); // 0 0 1
                int y = Integer.parseInt(line[0]);
                int x = Integer.parseInt(line[1]);
                int r = Integer.parseInt(line[2]);
                // 2. 통신반경 표시 //
                //area[y][x] = true;
                fillArea(area, y, x, r);
                /*for (int k = 1; k <= r; k++) {
                    if(y - k >= 0) area[y - k][x] = true;
                    if(y + k < area.length - 1) area[y + k][x] = true;
                    if(x - k >= 0) area[y][x - k] = true;
                    if(x + k < area[0].length - 1) area[y][x + k] = true;
                    if(y - k >= 0 && x - k >= 0) area[y - k][x - k] = true;
                    if(y - k >= 0 && x + k < area[0].length - 1) area[y - k][x + k] = true;
                    if(y + k < area.length - 1 && x - k > 0) area[y + k][x - k] = true;
                    if(y + k < area.length - 1 && x + k < area[0].length - 1) area[y + k][x + k] = true;
                }*/
                /*for (int k = 0; k < 20; k++) {
                    for (int l = 0; l < 20; l++) {
                        System.out.print(area[k][l] + "!  ");
                    }
                    System.out.println();
                }*/

            }
            // 3. DFS 로 구현! //
            int count = 0;
            for (int j = 0; j < area.length; j++) {
                for (int k = 0; k < area[j].length; k++) {
                    if(area[j][k] && visited[j][k] == false) {
                        dfs(visited, area, j, k);
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }

    public static void fillArea(boolean[][] area, int y, int x, int r) {
        int yStart = y - r < 0 ? 0 : y - r;
        int yEnd = y + r > area.length - 1 ? area.length - 1 : y + r;
        int xStart = x - r < 0 ? 0 : x - r;
        int xEnd = x + r > area[0].length - 1 ? area[0].length - 1 : x + r;

        for (int i = yStart; i <= yEnd; i++) {
            area[i][xStart] = true;
            area[i][xEnd] = true;
        }

        for (int i = xStart; i <= xEnd; i++) {
            area[yEnd][i] = true;
            area[yStart][i] = true;
        }
    }

    public static void dfs(boolean[][] visited, boolean[][] area, int y, int x) {
        if(y < 0 || y == area.length - 1 || x < 0 || x == area[0].length || visited[y][x] || area[y][x] == false) {

        } else {
            visited[y][x] = true;
            //System.out.println(y + ", " + x);
            dfs(visited, area, y - 1, x);
            dfs(visited, area, y + 1, x);
            dfs(visited, area, y, x - 1);
            dfs(visited, area, y, x + 1);
            /*dfs(visited, area, y - 1, x - 1);
            dfs(visited, area, y - 1, x + 1);
            dfs(visited, area, y + 1, x - 1);
            dfs(visited, area,y + 1, x + 1);*/
        }
    }
}
