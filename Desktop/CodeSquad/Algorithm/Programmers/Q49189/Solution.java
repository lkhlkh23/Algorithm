package Q49189;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Solution {
    /*
	 	문제 : 가장 먼 노드
	 	url : https://programmers.co.kr/learn/courses/30/lessons/49189
	 	재풀이 : X
	*/

    public int solution(int n, int[][] edge) {
        List<Node> nodes = new ArrayList<>();
        for (int i = 0; i < edge.length; i++) 
            nodes.add(new Node(edge[i][0], edge[i][1]));

        Collections.sort(nodes, (o1, o2) -> o1.start - o2.start > 0 || ((o1.start - o2.start == 0) && (o1.end - o2.end > 0)) ? 1 : -1);
        System.out.println(nodes.toString());
        int max = 0;
        for (int i = 2; i <= n; i++) {
            int num = dfs(nodes, new Node(0, 1), i);
            System.out.println(i + " / " + num);
            max = Math.max(max, num);
        }

        return max;
    }

    public int dfs(List<Node> nodes, Node node, int endPoint) {
        if(node.end == endPoint) {
            node.visited = false;
            return 0;
        }
        for (Node pop : nodes) {
            System.out.println("POP : " + pop.toString());
            if(!pop.visited && node.isAdjacent(pop)) {
                pop.visited = true;
                return 1 + dfs(nodes, pop, endPoint);
            }
            node.visited = false;
        }

        return 0;
    }

    public class Node {
        private int start;
        private int end;
        private boolean visited = false;

        public Node(int start, int end) {
            this.start = start;
            this.end = end;
        }

        public boolean isAdjacent(Node other) {
            return this.end == other.start;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "start=" + start +
                    ", end=" + end +
                    ", visited=" + visited +
                    '}';
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {3, 6}, {4, 3}, {3, 2}, {1, 3}, {1, 2}, {2, 4}, {5, 2}
        };
        System.out.println(new Solution().solution(6, arr));
    }
}