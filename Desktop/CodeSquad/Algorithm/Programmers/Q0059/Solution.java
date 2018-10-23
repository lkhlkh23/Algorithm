package Q0059;

class Solution {
    /* 행렬의 곱셈
       url : https://programmers.co.kr/learn/courses/30/lessons/12949
     */
    public static int[][] solution(int[][] arr1, int[][] arr2) {
        int[][] answer = new int[arr1.length][arr2[0].length];
        for(int i = 0; i < arr1.length; i++) {
            for(int j = 0; j < arr2.length; j++) {
                for (int k = 0; k < arr2[0].length; k++) {
                    answer[i][k] += arr1[i][j] * arr2[j][k];
                }
            }
            printArr(answer);
        }
        return answer;
    }

    public static void printArr(int[][] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr1 = {
                {-1, -4}, {-3, -2}, {-4, -1}
        };
        int[][] arr2 = {
                {-3, -3}, {-3, -3}
        };
        int[][] answer = solution(arr1, arr2);
        printArr(answer);

        int[][] arr3 = {
                {-1, -4}, {-3, -2}, {-4, -1}, {1, 1}
        };
        int[][] arr4 = {
                {-3, -3, 1}, {-3, -3, 1}
        };
        int[][] answer2 = solution(arr3, arr4);
        printArr(answer2);

    }
}