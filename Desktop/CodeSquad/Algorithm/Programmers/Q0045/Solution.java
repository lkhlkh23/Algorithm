package Q0045;

import java.util.Stack;

public class Solution {
    /* 쇠막대기 - 스택, 큐
     *     url : https://programmers.co.kr/learn/courses/30/lessons/42585?language=java */

    public static int solution(String arrangement) {
        int answer = 1;
        Stack<Character> stack = new Stack();
        char[] arr = arrangement.toCharArray();
        int index = 0;
        while(index < arr.length - 1) {
            if(arr[index] == '(' && arr[index + 1] == ')') {
                answer += stack.size();
                index ++;
            } else if(arr[index] == '(') {
                stack.add(arr[index]);
            } else if(arr[index] == ')') {
                answer += 1;
                stack.pop();
            }
            index++;
        }
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution("()(((()())(())()))(())"));
    }
}
