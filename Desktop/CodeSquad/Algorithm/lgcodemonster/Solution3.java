package lgcodemonster;

import java.util.*;

public class Solution3 {
    public static int[] solution(int[] healths, int[][] items) {
        List<Integer> healthList = new ArrayList<>();
        for (int i = 0; i < healths.length; i++) {
            healthList.add(healths[i] - 100);
        }
        Collections.sort(healthList);
        
        Map<Integer, Integer> tm = new TreeMap<>(Collections.reverseOrder());
        for (int i = 0; i < items.length; i++) {
            tm.put(items[i][0], items[i][1]);
        }

        List<Integer> answerList = new ArrayList<>();
        Iterator<Integer> it = tm.keySet().iterator();
        while(it.hasNext()) {
            int strength = it.next();
            int damage = tm.get(strength);
            int size = healthList.size();
            for(int i = 0; i < size; i++ ) {
                if(damage <= healthList.get(i)) {
                    healthList.remove(i);
                    for(int j = 0; j < items.length; j++) {
                        if(items[j][0] == strength) {
                            answerList.add(j + 1);
                            break;
                        }
                    }
                    break;
                }
            }
        }

        int[] answer = new int[answerList.size()];
        int cnt = 0;
        for(int n : answerList) {
            answer[cnt++] = n;
        }

        Arrays.sort(answer);

        return answer;
    }

    public static void main(String[] args) {
        int[] h = {200, 120, 150};
        int[][] item = {
                {30, 100} ,
                {500, 30},
                {100, 400},
        };
        System.out.println(solution(h, item)); // 500, 30

        int[] h2 = {300, 200, 500};
        int[][] item2 = {
                {1000, 600} ,
                {400, 500},
                {300, 100},
        };
        System.out.println(solution(h2, item2)); // 500, 30

        int[] h3 = {200, 120, 150};
        int[][] item3 = {
                {30, 100} ,
                {500, 30},
                {100, 400},
                {600, 60}
        };
        System.out.println(solution(h3, item3)); // 500, 30

        int[] h4 = {200, 120, 150};
        int[][] item4 = {
                {30, 100} ,
                {500, 30},
                {100, 400},
                {10, 20},
                {20, 100}
        };
        System.out.println(solution(h4, item4)); // 500, 30, 10
    }
}
