package Q0043;

import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution {
    /* 기능개발 - 스택, 큐
    *   url : https://programmers.co.kr/learn/courses/30/lessons/42586?language=java
    * */

    public static int[] solution(int[] progresses, int[] speeds) {
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        for(int i = 0; i < progresses.length; i++) {
            queue.add((100 - progresses[i]) % speeds[i] == 0 ? (100 - progresses[i]) / speeds[i]
                    : (100 - progresses[i]) / speeds[i] + 1
            );
        }
        List<Integer> result = new ArrayList<>();
        int standard = queue.poll();
        int cnt = 1;
        while(!queue.isEmpty()) {
            int num = queue.poll();
            if(standard >= num) {
                cnt++;
            } else {
                result.add(cnt);
                cnt = 1;
                standard = num;
            }
        }
        result.add(cnt);
        int[] answer = new int[result.size()];
        for (int i = 0; i < answer.length; i++) {
            answer[i] = result.get(i);
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] progress = {93, 30, 5};
        int[] speeds = {1, 30, 5};
        for(int num : solution(progress, speeds))
            System.out.print(num + "\t");
    }
}
