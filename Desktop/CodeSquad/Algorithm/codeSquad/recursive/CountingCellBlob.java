package codeSquad.recursive;

public class CountingCellBlob {
    public static void main(String[] args) {
        int[][] image = {
                {1, 0, 0, 0, 0, 0, 0, 1},
                {0, 1, 1, 0, 0, 1, 0, 1},
                {1, 1, 0, 0, 1, 0, 1, 0},
                {0, 0, 0, 0, 0, 1, 0, 0},
                {0, 1, 0, 1, 0, 1, 0, 0},
                {0, 1, 0, 1, 0, 1, 0, 0},
                {1, 0, 0, 0, 1, 0, 0, 1},
                {0, 1, 1, 0, 0, 1, 1, 1}
        };
        int x = 3;
        int y = 5;
        boolean[][] visted = new boolean[image.length][image[0].length];
        System.out.println(countBlob(x, y, image, visted));
    }

    public static int countBlob(int x, int y, int[][] image, boolean[][] visited) {
        int cnt = 0;
        if(x < 0 || x > image.length - 1 || y < 0 || y > image[0].length - 1) {
            return 0;
        } else if(visited[x][y] == true) {
            return 0;
        } else if (image[x][y] == 0) {
            visited[x][y] = true;
            return 0;
        } else {
            visited[x][y] = true;
            cnt = 1 + countBlob(x, y - 1, image, visited) + countBlob(x, y + 1, image, visited)
                    + countBlob(x - 1, y - 1, image, visited) + countBlob(x - 1, y, image, visited) + countBlob(x - 1, y + 1, image, visited)
                    + countBlob(x + 1, y - 1, image, visited) + countBlob(x + 1, y, image, visited) + countBlob(x + 1, y + 1, image, visited);
        }
        return cnt; //   1은 첫방문!
    }
}
