package job;

import java.util.*;

public class Solution3 {
    public static int[] solution(int[] healths, int[][] items) {
        Queue<Integer> temp = new LinkedList<>();
        Queue<Integer> healthQueue = new PriorityQueue<>(); // 오름차순정렬이 되어 있는 상태에서 순차적으로 빼기 위해서 우선순위큐 사용!
        for (int i = 0; i < healths.length; i++)
            healthQueue.offer(healths[i] - 100); // 체력이 반드시 100 이상 남아야 하기 때문에 처음에 빼주는 작업을 수행!

        List<Item> itemList = new ArrayList<>();
        for (int i = 0; i < items.length; i++)
            itemList.add(new Solution3().new Item(i + 1, items[i][0], items[i][1]));
        Collections.sort(itemList, (o1, o2) -> o1.power - o2.power > 0 ? -1 : 1); // 올려주는 공격력을 기준으로 내림차순 정렬!
        // 한사람에게는 하나의 아이템만 사용할 수 있으며, 최대한 체력이 낮은 사람이 공경력을 많이 올려주는 아이템을 사용할 수 있게 하기 위해서!

        List<Integer> answerList = new ArrayList<>();
        for(Item item : itemList) {
            while(!healthQueue.isEmpty()) {
                int playerHealth = healthQueue.poll();
                if(item.damage <= playerHealth) {
                    answerList.add(item.index);
                    break;
                }
                temp.offer(playerHealth);
            }
            healthQueue.addAll(temp);
            temp.clear();
        }

        int[] answer = new int[answerList.size()];
        int cnt = 0;
        for(int n : answerList)
            answer[cnt++] = n;

        Arrays.sort(answer);
        return answer;
    }

    public class Item {
        private int index;
        private int power;
        private int damage;

        public Item(int index, int power, int damage) {
            super();
            this.index = index;
            this.power = power;
            this.damage = damage;
        }
    }
}