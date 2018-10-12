package Q0044_Not;

import java.util.Stack;

public class Solution {
    /* 탑 - 스택, 큐
    *    url : https://programmers.co.kr/learn/courses/30/lessons/42588?language=java
    * */

    public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Stack<Integer> stackTemp = new Stack<>();
        Stack<Integer> stack = new Stack<>();
        for(int num : heights)
            stack.add(num);

        int standard = stack.pop();
        int idx = heights.length - 1;
        while(!stack.isEmpty()) {
            int num = stack.pop();
            stackTemp.add(num);
            if(standard < num) {
                while(!stackTemp.isEmpty()) {
                    stack.add(stackTemp.pop());
                }
                answer[idx--] = stack.size();
                standard = stack.pop();
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        int[] heights = {6,9,5,7,4};
        for(int num : solution(heights))
            System.out.print(num + "\t");
    }
}
