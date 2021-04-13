package Q70129;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    /*
      문제    : 두 개 뽑아서 더하기
      url    : https://programmers.co.kr/learn/courses/30/lessons/68644?language=java
      재풀이   : X
   */

    public static int[] solution(int[] numbers) {
        final Set<Integer> answers = new HashSet<>();
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                answers.add(numbers[i] + numbers[j]);
            }
        }

        final int[] result = new int[answers.size()];
        int index = 0;
        for (Integer answer : answers) {
            result[index++] = answer;
        }

        Arrays.sort(result);

        return result;
    }

    public static void main(String[] args) {
        int[] result1 = solution(new int[]{2, 1, 3, 4, 1});
        for (int i : result1) {
            System.out.print(i + " ");
        }

        System.out.println("");

        int[] result2 = solution(new int[]{5, 0, 2, 7});
        for (int i : result2) {
            System.out.print(i + " ");
        }
    }

}
