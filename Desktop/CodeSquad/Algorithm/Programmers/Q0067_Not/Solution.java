package Q0067_Not;

import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution {
    /* 라면공장
     *    url : https://programmers.co.kr/learn/courses/30/lessons/42629?language=java */
    public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        Queue<Integer> suppliesQueue = new ConcurrentLinkedQueue<>();
        Queue<Integer> datesQueue = new ConcurrentLinkedQueue<>();
        for (int num : supplies) {
            suppliesQueue.add(num);
            datesQueue.add(num);
        }

        return recursive(stock, suppliesQueue, datesQueue, k, 0);
    }

    public static int recursive(int stock, Queue<Integer> suppliesQueue, Queue<Integer> datesQueue, int k, int day) {
        int answer = 0;
        while(!suppliesQueue.isEmpty()) {
            int supply = suppliesQueue.poll();
            int date = datesQueue.poll();
            if(stock - (date - day) > 0) {
                // 아직 여유가 있을 때
                return Math.min(recursive(stock - (date - day) + supply, suppliesQueue, datesQueue, k, day + date) + 1
                        , recursive(stock - (date - day), suppliesQueue, datesQueue, k, day + date));
            } else {
                // 부족할 때
                return 1 + recursive(stock - (date - day) + supply, suppliesQueue, datesQueue, k, day + date);
            }
        }
       return answer + 1;
    }

    public static void main(String[] args) {
        int stock = 4;
        int[] dates = {4, 10, 15};
        int[] supplies = {20, 5, 10};
        int k = 30;

        System.out.println(solution(stock, dates, supplies, k));
    }
}
