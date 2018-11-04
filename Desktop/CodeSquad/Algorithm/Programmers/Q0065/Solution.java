package Q0065;

import java.util.Stack;

public class Solution {
    /* 카카오프렌즈 컬러북
     *    url : https://programmers.co.kr/learn/courses/30/lessons/1829?language=java */

    public static int[] solution(int m, int n, int[][] picture) {
        int[] answer = new int[2];
        boolean[][] visited = new boolean[m][n];
        Stack<Integer> stackX = new Stack<>();
        Stack<Integer> stackY = new Stack<>();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int count = 0;
                if(picture[i][j] > 0 && visited[i][j] == false) {
                    plus(stackX, stackY, visited, j, i);
                    count++;
                    answer[0]++;
                }
                while(!stackX.isEmpty()) {
                    int x = stackX.pop();
                    int y = stackY.pop();
                    // 위 이동
                    if(y > 0 && picture[y - 1][x] == picture[i][j] && visited[y - 1][x] == false) {
                        plus(stackX, stackY, visited, x, y - 1);
                        count++;
                    }
                    // 좌측 이동
                    if(x > 0 && picture[y][x - 1] == picture[i][j] && visited[y][x - 1] == false) {
                        plus(stackX, stackY, visited, x - 1, y);
                        count++;
                    }
                    // 아래 이동
                    if(y < m - 1 && picture[y + 1][x] == picture[i][j] && visited[y + 1][x] == false) {
                        plus(stackX, stackY, visited, x, y + 1);
                        count++;
                    }
                    // 우측 이동
                    if(x < n - 1 && picture[y][x + 1] == picture[i][j] && visited[y][x + 1] == false) {
                        plus(stackX, stackY, visited, x + 1, y);
                        count++;
                    }
                }
                answer[1] = Math.max(answer[1], count);
            }
        }

        return answer;
    }

    public static void plus(Stack<Integer> stackX, Stack<Integer> stackY, boolean[][] visited, int j, int i) {
        stackX.add(j);
        stackY.add(i);
        visited[i][j] = true;
    }

    public static int[] solution2(int m, int n, int[][] picture) {
        /* 재귀로 풀 경우, 런타임오류가 발생 --> 원인은 스택오버플로우 */
        int[] answer = new int[2];
        boolean[][] visited = new boolean[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(picture[i][j] > 0) {
                    int count = getEqualSpaceCount(visited, picture, picture[i][j] , i, j);
                    answer[0] = count > 0 ? answer[0] + 1 : answer[0];
                    answer[1] = Math.max(count, answer[1]);
                }
            }
        }

        return answer;
    }

    public static int getEqualSpaceCount(boolean[][] visited, int[][] picture, int value, int i, int j) {
        if(i < 0 || i >= picture.length || j < 0 || j >= picture[0].length ||  visited[i][j] == true || value != picture[i][j]) {
            return 0;
        } else {
            visited[i][j] = true;
            return 1 + getEqualSpaceCount(visited, picture, value, i - 1, j)
                     + getEqualSpaceCount(visited, picture, value, i + 1, j)
                     + getEqualSpaceCount(visited, picture, value, i, j - 1)
                     + getEqualSpaceCount(visited, picture, value, i, j + 1);
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 1, 1, 0},
                {1, 2, 2, 0},
                {1, 0, 0, 1},
                {0, 0, 0, 1},
                {0, 0, 0, 3},
                {0, 0, 0, 3}
        };

        for(int num : solution(6, 4, arr)) {
            System.out.println(num);
        }

        /*int[][] arr2 = new int[100][100];
        for (int i = 0; i < 100; i++) {
            for (int j = 0; j < 50; j++) {
                arr2[i][j] = 1;
            }
        }

        for (int i = 0; i < 100; i++) {
            for (int j = 50; j < 100; j++) {
                arr2[i][j] = 2;
            }
        }

        for(int num : solution(100, 100, arr2)) {
            System.out.println(num);
        }*/

        int[][] arr3 = {
                {1, 2},
                {1, 2}
        };

        for(int num : solution(2, 2, arr3)) {
            System.out.println(num);
        }
    }
}
