package Q0050;

import java.util.*;

public class Solution {
    /* 더 맵게 - 2단계 Heap
    *      url : https://programmers.co.kr/learn/courses/30/lessons/42626?language=java
    * */

    public static int solution(int[] scoville, int K) {
        Queue<Integer> queue = new PriorityQueue<>();
        int answer = 0;
        for(int num : scoville) {
            queue.add(num);
        }

        while(!queue.isEmpty()) {
            int num = queue.poll();
            if(queue.size() == 0 && num < K) return -1;
            if(num < K) {
                queue.add(num + queue.poll() * 2);
                answer++;
            }
        }

        return answer;
    }

    /* 정확성은 통과헀지만, 효율성 통과는 실패! 모두 시간초과! --> 반복문에서 정렬하기 때문에 시간복잡도 n * nlogn >= n^2 */
    public static int solution2(int[] scoville, int K) {
        int answer = 0;
        List<Integer> list = new LinkedList<>();
        for(int num : scoville)
            list.add(num);

        Collections.sort(list);
        while(list.get(0) < K) {
            if(list.size() == 1)
                return -1;

            list.add(list.remove(0) + (list.remove(0) * 2));
            Collections.sort(list);
            answer++;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] scoville = {1, 2, 3, 9, 10, 12};
        System.out.println(solution(scoville, 1));

        int[] scoville2 = {1, 1};
        System.out.println(solution(scoville2, 2));

        int[] scoville3 = {1};
        System.out.println(solution(scoville3, 7));
    }
}
