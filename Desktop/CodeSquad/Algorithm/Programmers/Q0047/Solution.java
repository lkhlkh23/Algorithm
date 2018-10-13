package Q0047;

import java.util.Collections;
import java.util.*;
import java.util.concurrent.ConcurrentLinkedQueue;

public class Solution {
    /* 프린터 - 스택, 큐
     *   url : https://programmers.co.kr/learn/courses/30/lessons/42587?language=java */
    public static int solution(int[] priorities, int location) {
        int answer = 0;
        List<Integer> maxList = new ArrayList<>();
        Queue<Integer> queue = new ConcurrentLinkedQueue<>();
        for(int num : priorities) {
            maxList.add(num);
            queue.add(num);
        }
        /* 최대값을 찾기위한 리스트 (내림차순정렬이기 때문에 0번째가 가장 큼) */
        Collections.sort(maxList, Collections.reverseOrder());

        while(!queue.isEmpty()) {
            int num = queue.poll();
            if(maxList.get(0) <= num) {
                maxList.remove(0);
                if(location == 0) return priorities.length - queue.size();
            } else {
                queue.add(num);
            }
            location = location == 0 ? queue.size() -1 : location - 1;
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] properties = {2,1,3,2};
        int location = 2;

        System.out.println(solution(properties, location));
    }
}
