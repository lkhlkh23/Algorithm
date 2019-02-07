package Q43164;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[][] tickets) {
        /* 출발지 초기화 */
        List<Node> nodeList = new ArrayList<>();
        for (int i = 0; i < tickets.length; i++) {
            nodeList.add(new Node(tickets[i][0], tickets[i][1]));
        }

        Collections.sort(nodeList, ((o1, o2) -> o1.departure.compareTo((o2.departure)) != 0
                ? o1.departure.compareTo((o2.departure)) : o1.destination.compareTo(o2.destination)));

        String[] answer = new String[nodeList.size() + 1];
        for (Node node : nodeList) {
            boolean[] visited = new boolean[nodeList.size()];
            List<Node> result = new ArrayList<>();
            dfs(nodeList, node, result, visited);
            if(result.size() == nodeList.size()) {
                System.out.println(result.toString());
                break;
            }
        }

        return answer;
    }

    public Node dfs(List<Node> tickets, Node departure, List<Node> result, boolean[] visited) {
        /*if(index == arr.length - 1) {
            return departure;
        } else {
            for (Node ticket : tickets) {
                if(!ticket.isVisited() && departure.isAdjacent(ticket)) {
                    ticket.visit();
                    ticket.addNode(ticket, departure.list);
                    return dfs(tickets, ticket, cnt);
                }
            }
        }*/
        return null;
    }

    public class Node {
        public String departure;
        public String destination;
        public boolean visited;
        List<String> list = new ArrayList<>();

        public Node(String departure, String destination) {
            this.departure = departure;
            this.destination = destination;
        }


        public boolean isAdjacent(Node other) {
            return this.destination.equals(other.departure);
        }

        public void addNode(Node node) {
            this.list.add(node.departure);
            this.list.add(node.destination);
        }

        public void visit() {
            this.visited = true;
        }

        public boolean isVisited() {
            return this.visited;
        }

        public int obtainListSize() {
            return this.list.size();
        }

        @Override
        public String toString() {
            return "Node{" +
                    "departure='" + departure + '\'' +
                    ", destination='" + destination + '\'' +
                    '}';
        }

    }

    public static void main(String[] args) {
        Solution solution = new Solution();
        String[][] tickes = {{"ICN", "JFK"}, {"HND", "IAD"}, {"JFK", "HND"}};
        String[] answers = solution.solution(tickes);
        for(String str : answers) {
            System.out.print(str + " ");
        }
        System.out.println();

        String[][] tickets2 = {{"ICN", "SFO"}, {"ICN", "ATL"}, {"SFO", "ATL"}, {"ATL", "ICN"}, {"ATL","SFO"}};
        answers = solution.solution(tickets2);
        for(String str : answers) {
            System.out.print(str + " ");
        }
        System.out.println();

        String[][] tickets3 = {{"A", "D"}, {"A", "B"}, {"A", "E"}};
        answers = solution.solution(tickets3);
        for(String str : answers) {
            System.out.print(str + " ");
        }
        System.out.println();
    }
}