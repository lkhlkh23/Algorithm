package Q2667;

public class Main {
    public static void main(String[] args) {
        int[][] arr = {
                {0, 1, 1, 0, 1, 0, 0},
                {0, 1, 1, 0, 1, 0, 1},
                {1, 1, 1, 0, 1, 0, 1},
                {0, 0, 0, 0, 1, 1, 1},
                {0, 1, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 1, 1, 0},
                {0, 1, 1, 1, 0, 0, 0}
        };

        boolean[][] visited = new boolean[arr.length][arr[0].length];
        /*for(int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println("i, j -> " + i + " , " + j + " count : " + findBlock(i, j, arr, visited));
            }
        }*/
        System.out.println(findBlock(0, 1, arr, visited));
    }

    public static int findBlock(int y, int x, int[][] arr, boolean[][] visited) {
        // 이미 방문했거나, 값이 0 이면 false
        int cnt = 0;
        visited[y][x] = true;
        if(x > 0 && arr[y][x - 1] == 1 && visited[y][x - 1]) { // 좌이동
            System.out.println("좌이동");
            cnt = cnt + 1 + findBlock(y, x - 1, arr, visited);
        }
        if(x < arr.length - 1 && arr[y][x + 1] == 1  && visited[y][x + 1]) { // 우이동
            System.out.println("우이동");
            cnt = cnt + 1 + findBlock(y, x + 1, arr, visited);
        }
        if(y > 0 && arr[y - 1][x] == 1  && visited[y - 1][x]) { // 위이동
            System.out.println("위이동");
            cnt = cnt + 1 + findBlock(y - 1, x, arr, visited);
        }
        if(y < arr.length - 1 && arr[y + 1][x] == 1 && visited[y + 1][x]) { // 아래이동
            System.out.println("아래이동");
            cnt = cnt + 1 + findBlock(y + 1, x, arr, visited);
        }

        return cnt;
    }
}
