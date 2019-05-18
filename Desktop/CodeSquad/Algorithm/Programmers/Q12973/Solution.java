package Q12973;

import java.util.Stack;

public class Solution {
    /*
	 	문제 : 짝지어 제거하
	 	url : https://programmers.co.kr/learn/courses/30/lessons/12973
	 	재풀이 : X
	*/

    public static int solution(String s) {
        Stack<Character> stack = new Stack<>();

        for(char c : s.toCharArray())
            if(!stack.isEmpty() && stack.peek() == c) stack.pop();
            else stack.push(c);

        return stack.isEmpty() ? 1 : 0;
    }
}
