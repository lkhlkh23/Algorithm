package Q10799;

import java.io.*;
import java.util.Stack;

public class Main {
   /*
      문제 : 쇠막대기
      url : https://www.acmicpc.net/problem/10799
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        char[] inputs = new BufferedReader(new InputStreamReader(System.in)).readLine().toCharArray();
        Stack<Character> sticks = new Stack<>();

        int countOfStick = 0;
        for (int i = 0; i < inputs.length; i++) {
            if(i == sticks.size() - 1 || inputs[i] == ')') {
                // 막대끝
                countOfStick++;
                sticks.pop();
            } else if(inputs[i] == '(' && inputs[i + 1] == ')') {
                // 레이저
                countOfStick += sticks.size();
                i++;
            } else {
                // 막대시작
                sticks.add(inputs[i]);
            }
        }

        System.out.println(countOfStick);
    }
}
