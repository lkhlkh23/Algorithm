package Q42629;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    /*
	 	문제 : 라면공장
	 	url : https://programmers.co.kr/learn/courses/30/lessons/42629
	 	재풀이 : X
	*/
    public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        Queue<Integer> priorityQueue = new PriorityQueue<>(Comparator.reverseOrder());

        int index = 0;
        for (int i = 1; i <= k; i++) {
            if(index < dates.length && i == dates[index])
                priorityQueue.add(supplies[index++]);

            if(stock == 0) {
                stock += priorityQueue.poll();
                answer++;
            }
            stock--;
        }

        return answer;
    }


    public static void main(String[] args) {
        int stock = 4;
        int[] dates = {4, 10, 15};
        int[] supplies = {20, 5, 10};
        int k = 30;

        System.out.println(solution(stock, dates, supplies, k));
    }
}
