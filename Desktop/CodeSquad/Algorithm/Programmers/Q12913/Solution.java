package Q12913;

public class Solution {
    /*
     문제    : 땅따먹기
     url  : https://programmers.co.kr/learn/courses/30/lessons/12913?language=java
     재풀이 : X
    */
    public static int solution(int[][] land) {
        int[][] dp = new int[land.length][4];
        for(int i = 0; i < 4; i++)
            dp[0][i] = land[0][i];

        for(int i = 1; i < land.length; i++)
            for(int j = 0; j < dp[i].length; j++)
                dp[i][j] = land[i][j] + findMax(dp[i - 1], j);

        int max = 0;
        for(int i = 0; i < 4; i++)
            max = Math.max(max, dp[land.length - 1][i]);

        return max;
    }

    public static int findMax(int[] arr, int except) {
        int max = 0;
        for(int i = 0; i < arr.length; i++)
            if(except != i && max < arr[i])
                max = arr[i];

        return max;
    }
}
