package Q0037;

import java.util.*;

public class Solution {
    /* 카카오 실패율 문제
     *    url : https://programmers.co.kr/learn/courses/30/lessons/42889 */

    private class Node implements Comparable<Node> {
        private int stage;
        private double rate;

        private Node(int stage, double rate) {
            this.stage = stage;
            this.rate = rate;
        }

        @Override
        public int compareTo(Node node) {
            if(this.rate > node.rate) return -1;
            else if (this.rate == node.rate) return 0;
            else return 1;
        }
    }

    public static int[] solution(int N, int[] stages) {
        int[] answer = new int[N];
        int max = 0;
        for(int n : stages)
            max = Math.max(n, max);

        List<Node> result = new ArrayList<>();

        for(int i = 1; i <= answer.length; i++) {
            int all = 0, fail = 0;
            for(int j = 0; j < stages.length; j++) {
                if(i < stages[j]) {
                    all++;
                } else if(i == stages[j]) {
                    all++;
                    fail++;
                }
            }
            result.add(new Solution().new Node(i, i > max ? 0.0 : (double)fail / all));
        }

        Collections.sort(result);
        for(int i = 0; i < result.size(); i++)
            answer[i] = result.get(i).stage;

        return answer;
    }

    public static void main(String[] args) {
        //5   [2, 1, 2, 6, 2, 4, 3, 3]   [3,4,2,1,5]
        //      4   [4,4,4,4,4]   [4,1,2,3]
        int[] stages = {2,1,2,6,2,4,3,3};
        int[] stages2 = {1,1,1,1,2,2,2,2,2,2,2,2,2,2,2,2,2};
        int[] arr = solution(5, stages);
        System.out.println("***");
        int[] arr2 = solution(500, stages2);
    }

}