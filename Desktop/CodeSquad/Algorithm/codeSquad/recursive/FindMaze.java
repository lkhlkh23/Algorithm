package codeSquad.recursive;

public class FindMaze {
    public static void main(String[] args) {
        /* 1 : 벽, 0 : 이동 가능 통로 */
        int[][] maze = {
                {0, 0, 0, 0, 0, 0, 0, 0},
                {0, 1, 1, 0, 1, 1, 0, 1},
                {0, 0, 0, 1, 0, 0, 0, 1},
                {0, 1, 0, 0, 1, 1, 0, 0},
                {0, 1, 1, 1, 0, 0, 1, 1},
                {0, 1, 0, 0, 0, 1, 0, 1},
                {0, 0, 0, 1, 0, 0, 0, 1},
                {0, 1, 1, 1, 0, 1, 0, 0}
        };

        boolean[][] visited = new boolean[maze.length][maze[0].length];

        int startX = 0;
        int startY = 0;

        int finX = 7;
        int finY = 7;

        System.out.println(findMaze(startX, startY, finX, finY, visited, maze) ? "탈출 가능!" : "탈출 불가!");
    }

    public static boolean findMaze(int nowX, int nowY, int finX, int finY, boolean[][] visited, int[][] maze) {
        if(visited[nowX][nowY] || maze[nowX][nowY] == 1) {
            return false;
        } else if(nowX == finX && nowY == finY) {
            return true;
        } else {
            visited[nowX][nowY] = true;
            System.out.println("X, Y --> " + nowX + " , " + nowY);
            if(nowX > 0 && findMaze(nowX - 1, nowY, finX, finY, visited, maze)) {
                return true;
            }
            if(nowX < maze[0].length - 1 && findMaze(nowX + 1, nowY, finX, finY, visited, maze)) {
                return true;
            }
            if(nowY > 0 && findMaze(nowX , nowY - 1, finX, finY, visited, maze)) {
                return true;
            }
            if(nowY < maze[0].length - 1 && findMaze(nowX, nowY + 1, finX, finY, visited, maze)) {
                return true;
            }
        }
        return false;
    }
}
