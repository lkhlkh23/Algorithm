package Q0056;


import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution {
    /* 더 맵게
     *    url : https://programmers.co.kr/learn/courses/30/lessons/42626 */
    public static int solution(int[] scoville, int K) {
        int answer = 0;
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        Queue<Integer> temp = new ConcurrentLinkedQueue<>();
        Arrays.sort(scoville);
        for(int num : scoville) {
            queue.add(num);
        }

        while(queue.peek() < K) {
            if(queue.size() == 1) {
                return -1;
            }
            int sum = queue.poll() + (queue.poll() * 2);
            boolean flag = true;
            while(!queue.isEmpty()) {
                int num = queue.poll();
                if(sum <= num && flag) {
                    temp.add(sum);
                    flag = false;
                }
                temp.add(num);
            }
            if(flag) {
                temp.add(sum);
            }

            while(!temp.isEmpty()) {
                queue.add(temp.poll());
            }
/*        	System.out.println(queue.toString());
        	System.out.println(temp.toString());*/
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = {11, 2, 3, 9, 10, 12};
        System.out.println(solution(arr, 7));

        int[] arr2 = {0,0,0};
        System.out.println(solution(arr2,  0));
    }
}
