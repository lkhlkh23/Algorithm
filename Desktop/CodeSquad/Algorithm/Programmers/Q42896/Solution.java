package Q42896;

public class Solution {
    /*
       문제 : 카드게임
       url : https://programmers.co.kr/learn/courses/30/lessons/42896
       재풀이 : X
   */

    // 시간초과 - 테스크 케이스 3, 4가 맞지 않는다! //
    public int solution(int[] left, int[] right) {
        int[][] scores = new int[left.length + 1][right.length + 1];

        for(int i = 1; i < scores.length; i++) {
            for(int j = 1; j < scores[0].length; j++) {
                scores[i][j] = Math.max(scores[i - 1][j], scores[i - 1][j - 1]);
                if(left[i - 1] > right[j - 1]) {
                    scores[i][j] = Math.max(scores[i][j], scores[i][j - 1] + right[j - 1]);
                }
            }
        }

        return scores[scores.length - 1][scores[0].length - 1];
    }

    public static void main(String[] args) {
        //[3, 2, 5]   [2, 4, 1]   7
        int[] left = {3, 2, 5};
        int[] right = {2, 4, 1};
        System.out.println(new Solution().solution(left, right));

        int[] left2 = {5, 2, 3};
        int[] right2 = {1,4, 7,1};
        System.out.println(new Solution().solution(left2, right2));

        int[] left3 = {2, 3, 2};
        int[] right3 = {2,2, 4,2};
        System.out.println(new Solution().solution(left3, right3));

        int[] left4 = {2, 2, 2};
        int[] right4 = {2,2, 2,2};
        System.out.println(new Solution().solution(left4, right4));

        int[] left5 = {2, 2, 2, 2, 2, 2, 2, 2, 6};
        int[] right5 = {4};
        System.out.println(new Solution().solution(left5, right5));
    }
}