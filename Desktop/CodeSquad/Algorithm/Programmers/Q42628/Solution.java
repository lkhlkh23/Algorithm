package Q42628;

import java.util.*;
import java.util.function.BiFunction;

class Solution {
    /*
       문제 : 이중우선순위큐
       url : https://programmers.co.kr/learn/courses/30/lessons/42628?language=java
       재풀이 : X
   */

    public int[] solution(String[] operations) {
        int[] answer = new int[2];
        Queue<Integer> maxQueue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Integer> minQueue = new PriorityQueue<>();

        for(String operation : operations) {
            String[] cmd = operation.split(" ");
            if(cmd[0].equals("I")) {
                maxQueue.add(Integer.parseInt(cmd[1]));
                minQueue.add(Integer.parseInt(cmd[1]));
            } else if(!maxQueue.isEmpty()){
                if(cmd[1].equals("1")) deleteElement(minQueue, maxQueue.poll());
                else deleteElement(maxQueue, minQueue.poll());
            }
        }

        answer[0] = maxQueue.isEmpty() ? 0 : maxQueue.poll();
        answer[1] = minQueue.isEmpty() ? 0 : minQueue.poll();
        return answer;
    }

    public void deleteElement(Queue<Integer> queue, int num) {
        List<Integer> temp = new ArrayList<>();
        while(!queue.isEmpty()) {
            int extract = queue.poll();
            if(extract == num) break;
            temp.add(extract);
        }
        queue.addAll(temp);
    }

    public static void main(String[] args) {
        String[] operations = {"I 7","I 5","I -5","D -1"};
        for(int num : new Solution().solution(operations)) {
            System.out.println(num);
        }

        Map<String, BiFunction<Integer, Integer, Boolean>> map = new HashMap<>();
        map.put("condition1", (a, b) -> {
            if(a > b) return true;
            return false;
        });

        System.out.println(map.get("condition1").apply(100, 80));
    }
}