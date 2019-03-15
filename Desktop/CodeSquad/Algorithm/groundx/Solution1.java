package groundx;

import java.util.*;

public class Solution1 {
    /**
     *
     * @param openA 문을 연 시간 오름차순
     * @param closeB 문을 닫는 시간 오름차순 (closeB의 마지막 원소는 항상 openA의 마지막 원소보다 작다)
     * @return
     */
    public static int solution(int[] openA, int[] closeB) {
        int answer = 0;
        Queue<Integer> open = initQueue(openA); // A가 문을 연 시간
        Queue<Integer> close = initQueue(closeB); // B가 문을 연 시간

        int prevTime = 0; // 문을 닫았던 시간!
        while(!open.isEmpty()) {
            int openTime = open.poll();
            // 닫았던 시간이 연 시간보다 작을 때는 넘겼을 때! //
            if(openTime < prevTime)
                continue;

            while(!close.isEmpty()) {
                int closeTime = close.poll();
                if(openTime < closeTime) {
                    answer += (closeTime - openTime);
                    prevTime = closeTime;
                    break;
                }
            }
        }

        return answer;
    }

    public static Queue<Integer> initQueue(int[] arr) {
        Queue<Integer> queue = new LinkedList<>();
        for(int num : arr)
            queue.add(num);

        return queue;
    }

    public static void main(String[] args) {
        int[] open = {3, 5, 7};
        int[] close = {4, 10, 12};

        System.out.println(solution(open, close)); // 6

        int[] open2 = {4, 7, 9, 16};
        int[] close2 = {2, 5, 12, 14, 20};

        System.out.println(solution(open2, close2)); // 10

        int[] open3 = {1, 2, 3};
        int[] close3 = {4, 5, 6, 7, 20};

        System.out.println(solution(open3, close3)); // 3

        int[] open4 = {2, 3, 4, 5, 6, 8, 9, 10, 11};
        int[] close4 = {7, 12};

        System.out.println(solution(open4, close4)); // 5 + 4 = 9

        int[] open5 = {2, 3, 4, 5, 6, 8, 9, 10, 11};
        int[] close5 = {12};

        System.out.println(solution(open5, close5)); // 10

        int[] open6 = {2};
        int[] close6 = {1, 4, 5, 6, 7, 8, 9, 10};

        System.out.println(solution(open6, close6)); // 2

    }

}