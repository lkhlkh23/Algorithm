package codeSquad.stack_queue;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class StackExample1 {
    /*
    *  알고리즘 : 입력에 대한 결과를 처리하기 위한 명령어의 집합을 의미.
    *       * 필요조건 : 제한된 시간내 완결이 되는 명령
    *   해결전략1) 문제 해결을 위한 적당한 자료구조를 선택!
    *       * 자료구조 : 메모리의 효율성을 고려한 자료형태 (예 : Array(Stack, Queue), Tree, Graph
    *
    *  ADT (Abstract Data Type)
    *   예) Stack (flag = isEmpty(), n = pop(), push(int num), n = size())
    *      Java 에서 Stack 구현을 위해서는 데이터의 삽입/삭제가 동적으로 계속 이루어지기 때문에 ArrayList 시용
    *
    *  Stack : LIFO (후입선출, 마지막에 입력된 것이 우선적으로 아웃)
    *
    *  Queue : FIFO (선입선출, 처음 입력된 것이 우선적으로 아웃)
    *
    *  Dequeue : First Input, Last Input 모두 가능.  First out, Last out 모두 가능.
    * */



    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();

        System.out.println(VPS(input));
        System.out.println(countMetal("()(((()())(())()))(())"));

    }

    public static String VPS(String input) {
        char[] arr = input.toCharArray();
        Stack<Character> stack = new Stack<>();
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == '(') {
                stack.add(arr[i]);
            } else {
                if(stack.isEmpty()) return "NO";
                stack.pop();
            }
        }
        return stack.isEmpty() ? "YES" : "NO";
    }

    public static int countMetal(String input) {
        /* https://programmers.co.kr/learn/courses/30/lessons/42585?language=java */
        /* 1. 레이저 확인 */
        for(int i = 0; i < input.length(); i++) {
            System.out.println(input.indexOf("()"));
        }
        return 1;
    }

    public static void printer() {
        int[] properties = {2, 1, 3, 2};
        int location = 2;

        Queue<Map<Character, Integer>> queue = new ArrayDeque<>();

    }
}
