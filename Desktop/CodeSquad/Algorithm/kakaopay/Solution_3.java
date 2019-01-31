package kakaopay;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution_3 {

    public static int[] solution(int N, int[] coffee_times) {
        int[] answer = new int[coffee_times.length];
        List<Pair> buf = new ArrayList<>();

        Queue<Pair> queue = new ConcurrentLinkedQueue<>();
        Solution_3 sol = new Solution_3();

        for (int i = 1; i <= coffee_times.length ; i++) {
            queue.add(sol.new Pair(i, coffee_times[i - 1]));
        }

        for (int i = 0; i < N; i++) {
            buf.add(queue.poll());
        }

        int index = 0;
        while(!buf.isEmpty()) {
            for (int i = 0; i < buf.size(); i++) {
                buf.get(i).minus();
            }

            for (int i = 0; i < buf.size(); i++) {
                if(buf.get(i).isZero()) {
                    answer[index++] = buf.get(i).getIndex();
                    if(!queue.isEmpty()) {
                        buf.set(i, queue.poll());
                    } else {
                        buf.remove(i);
                    }
                }
            }
        }

        return answer;
    }

    public class Pair {
        public int index;
        public int value;

        public Pair(int index, int value) {
            this.index = index;
            this.value = value;
        }

        public void minus() {
            value -= 1;
        }

        public boolean isZero() {
            return value == 0;
        }

        public int getIndex() {
            return index;
        }
    }

    public static void main(String[] args) {
        int[] coffee = {4, 2, 2, 5, 3};
        int n = 3;

        for (int i : solution(n, coffee)) {
            System.out.println(i); // 2 3 1 5 4
        }

        int[] coffee2 = {100, 1, 50, 1, 1};
        n = 1;

        for (int i : solution(n, coffee2)) {
            System.out.println(i); // 2 3 1 5 4
        }
    }
}
