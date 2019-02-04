package Q43162;

import java.util.ArrayList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution {
    /*
	 	문제 : 네크워크
	 	url : https://programmers.co.kr/learn/courses/30/lessons/43162
	 	재풀이 : O
	*/

    public int solution(int n, int[][] computers) {
        int answer = 0;
        Queue<Node> queue = new ConcurrentLinkedQueue<Node>();
        List<Node> list = new ArrayList<Node>();
        boolean[] visited = new boolean[computers.length];

        for (int i = 0; i < computers.length; i++)
            list.add(new Node(i));

        for (int i = 0; i < computers.length; i++)
            for (int j = 0; j < computers[0].length; j++)
                if(computers[i][j] == 1 && i != j)
                    list.get(i).addAdjacent(list.get(j));

        for (int i = 0; i < list.size(); i++) {
            if(!visited[i]) {
                queue.add(list.get(i));
                visited[i] = true;
                answer++;
            }

            while(!queue.isEmpty()) {
                Node pop = queue.poll();
                List<Node> nodes = pop.adjacent;
                for (Node node : nodes) {
                    if(!visited[node.data]) {
                        visited[node.data] = true;
                        queue.add(node);
                    }
                }
            }
        }

        return answer;
    }

    public class Node {
        private int data;
        private List<Node> adjacent = new ArrayList<Node>();

        public Node(int data) {
            this.data = data;
        }

        public void addAdjacent(Node node) {
            adjacent.add(node);
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        int[][] computers = {{1, 1, 0}, {1, 1, 0}, {0, 0, 1}};
        System.out.println(solution.solution(3, computers));

        int[][] computers2 = {{1, 1, 0}, {1, 1, 1}, {0, 1, 1}};
        System.out.println(solution.solution(3, computers2));
    }
}
