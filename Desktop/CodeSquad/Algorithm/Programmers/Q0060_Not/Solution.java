package Q0060_Not;

import java.util.*;

public class Solution {
    /* 라면공장
    *    url : https://programmers.co.kr/learn/courses/30/lessons/42629?language=java */
    public static int solution(int stock, int[] dates, int[] supplies, int k) {
        int answer = 0;
        Map<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < dates.length; i++) {
            map.put(dates[i], supplies[i]);
        }

        Iterator<Integer> it = sortByValue(map).iterator();
        while(it.hasNext()) {
            System.out.println(map.get(it.next()));
        }

        return answer;
    }

    public static List<Integer> sortByValue(Map<Integer, Integer> map) {
        List<Integer> list = new ArrayList<>(map.keySet());
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return ((Comparable) map.get(o1)).compareTo(map.get(o2));
            }
        });
        Collections.reverse(list);
        return list;
    }

    public static void main(String[] args) {
        int[] dates = {4, 10, 15};
        int[] supplies = {20, 5, 10};
        int stock = 4;
        int k = 30;
        System.out.println(solution(stock, dates, supplies, k));
    }
}
