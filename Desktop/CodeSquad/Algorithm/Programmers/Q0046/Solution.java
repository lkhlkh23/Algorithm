package Q0046;

import java.util.Queue;
import java.util.Stack;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution {
    /* 다리를 지나는 트럭 - 큐, 스택
     *     url : https://programmers.co.kr/learn/courses/30/lessons/42583?language=java */

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;
        int sum = 0;
        Queue<Integer> bridge = new ConcurrentLinkedQueue<>();
        /* 1. 초기화 */
        for(int i = 0; i < bridge_length; i++) {
            bridge.add(0);
        }

        int index = -1;
        Stack<Integer> passedTruck = new Stack<>();
        while(passedTruck.size() != truck_weights.length) {
            int passed = bridge.poll();
            sum -= passed;
            if(passed > 0) {
                passedTruck.add(passed);
            }

            if(index < truck_weights.length - 1 && sum + truck_weights[index + 1] <= weight) {
                sum += truck_weights[index + 1];
                bridge.add(truck_weights[index + 1]);
                index++;
            } else {
                bridge.add(0);
            }
            answer++;
        }

        return answer;
    }

    public static void main(String[] args) {
        int bride_length = 2;
        int weight = 10;
        int[] truck_weights = {7, 4, 5, 6};

        System.out.println(solution(bride_length, weight, truck_weights));
    }
}
