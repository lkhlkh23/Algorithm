package Q0044;

import java.util.*;

public class Solution {
    /* 탑 - 스택, 큐
    *    url : https://programmers.co.kr/learn/courses/30/lessons/42588?language=java
    * */

    public static int[] solution(int[] heights) {
        int[] answer = new int[heights.length];
        Stack<Integer> stack = new Stack<>();
        List<Integer> temp = new ArrayList<>();
        for(int num : heights)
            stack.add(num);

        int standard = stack.pop();
        int idx = heights.length - 1;
        while(!stack.isEmpty()) {
            int num = stack.peek();
            if(standard < num) {
                answer[idx--] = stack.size();
                Collections.reverse(temp);
                stack.addAll(temp);
                temp.clear();
                standard = stack.pop();
            } else {
                temp.add(stack.pop());
            }

            if(!temp.isEmpty() && stack.isEmpty()) {
                answer[idx--] = stack.size();
                Collections.reverse(temp);
                stack.addAll(temp);
                temp.clear();
                standard = stack.pop();
            }
        }

        return answer;
    }

    public static int[] solution2(int[] heights) {
        int[] answer = new int[heights.length];
        for(int i = heights.length - 1; i > -1; i--) {
            for(int j = i - 1; j > -1; j--) {
                if(heights[i] < heights[j]) {
                    answer[i] = j + 1;
                    break;
                }
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
