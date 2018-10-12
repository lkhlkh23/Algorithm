package Q0042;

public class Solution {
    /* 주식가격 - 스택, 큐
    *    url : https://programmers.co.kr/learn/courses/30/lessons/42584?language=java */
    public static int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        for(int i = 0; i < answer.length; i++) {
            answer[i] = answer.length - 1 - i;
        }

        for (int i = 0; i < prices.length - 1; i++) {
            for(int j = i + 1; j < prices.length; j++) {
                if(prices[i] > prices[j]) {
                    answer[i] = j - i;
                    break;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] prices = {400, 400, 400, 400};
        for(int num : solution(prices))
            System.out.print(num + "\t");

        System.out.println();

        int[] prices2 = {498, 501, 470, 489};
        for(int num : solution(prices2))
            System.out.print(num + "\t");
    }
}
