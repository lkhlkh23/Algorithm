package Q43164;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;
import java.util.stream.Collectors;

class Solution {
    public String[] solution(String[][] tickets) {
        /* 출발지 초기화 */
        List<Node> list = new ArrayList<>();
        for (int i = 0; i < tickets.length; i++) {
            list.add(new Node(tickets[i][0], tickets[i][1]));
        }

        //Node departure = list.get(0);
        //Node destination = list.get(list.size() - 1);

        Collections.sort(list, (o1, o2) -> o1.departure.compareTo(o2.departure));
        System.out.println(list.toString());

        List<String> answers = new ArrayList<>();
        String[] answer = new String[answers.size()];
        Stack<Node> stack = new Stack<>();
        stack.add(list.get(0));
        answers.add(list.get(0).departure);

        while(!stack.isEmpty()) {
            Node pop = stack.pop();
            for(Node other : list) {
                if(!other.isVisited() && pop.isAdjacent(other)) {
                    stack.add(other);
                    other.visit();
                    System.out.println(other.toString());
                }
            }
        }
        //answers.add(destination.destination);
        System.out.println(answers.toString()+"~~~~~~");

        return answer;
    }

    public class Node {
        public String departure;
        public String destination;
        public boolean visited;

        public Node(String departure, String destination) {
            this.departure = departure;
            this.destination = destination;
        }

        public void visit() {
            this.visited = true;
        }

        public boolean isVisited() {
            return this.visited;
        }

        public boolean isAdjacent(Node other) {
            return this.destination.equals(other.departure);
        }

        public boolean isEqualTicket(Node other) {
            return this.destination.equals(other.destination) && this.departure.equals(other.departure);
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
    }
}