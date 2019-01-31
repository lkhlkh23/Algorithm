package kakaopay;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution_2 {
    public int solution(int K, String[] user_scores) {
        int answer = 0;
        Solution_2 sol = new Solution_2();
        Queue<Player> queue = new ConcurrentLinkedQueue<>();
        List<Player> list = new ArrayList<>();
        for (int i = 0; i < user_scores.length; i++) {
            queue.add(sol.new Player(user_scores[i].split(" ")[0],
                    Integer.parseInt(user_scores[i].split(" ")[1])));
        }
        while(list.size() < K) {
            Player player = queue.poll();
            if(list.contains(player)) {
                if(list.get(list.indexOf(player)).score < player.score) {
                    list.set(list.indexOf(player), player);
                }
            } else {
                list.add(player);
                answer++;
            }
        }

        System.out.println(answer);

        Collections.sort(list);
        while (!queue.isEmpty()) {
            Player player = queue.poll();
            for (int i = 0; i < K; i++) {
                if(list.get(i).score < player.score && !list.get(i).name.equals(player.name)) {
                    list.add(i, player);
                    answer++;
                    break;
                } else if(list.get(i).score < player.score && list.get(i).name.equals(player.name)) {
                    list.set(list.indexOf(player), player);
                }
            }
        }

        System.out.println(list.toString());


        return answer;
    }

    public class Player implements Comparable<Player> {
        private String name;
        private int score;

        public Player(String name, int score) {
            this.name = name;
            this.score = score;
        }

        @Override
        public String toString() {
            return "Player{" +
                    "name='" + name + '\'' +
                    ", score=" + score +
                    '}';
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Player player = (Player) o;
            return Objects.equals(name, player.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public int compareTo(Player o) {
            return o.score - this.score;
        }
    }

    public static void main(String[] args) {
        Solution_2 sol = new Solution_2();
        String[] arr = {"alex111 100", "cheries2 200", "coco 150", "luna 100", "alex111 120", "coco 300", "cheries2 110"};
        int k = 3;
        System.out.println(sol.solution(k, arr));
    }

}
