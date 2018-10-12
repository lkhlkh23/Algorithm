package Q0047;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution {
    /* 프린터 - 스택, 큐
     *   url : https://programmers.co.kr/learn/courses/30/lessons/42587?language=java */
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        int find = priorities[location];
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        Queue<Integer> temp = new ConcurrentLinkedQueue<>();

        /* 1. 큐 초기화! */
        for(int num : priorities)
            queue.add(num);

        for

        return answer;
    }

    public static void main(String[] args) {
        int[] properties = {2,1,3,2};
        int location = 2;

        System.out.println(solution(properties, location));
    }
}
