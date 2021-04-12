package Q70129;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Solution {

    /*
      문제    : 이진 변환 반복하기
      url    : https://programmers.co.kr/learn/courses/30/lessons/70129
      재풀이   : X
   */

    public static int[] solution(String s) {
        if(s.length() == 1) {
            return new int[]{0, 0};
        }

        int countOfLoop = 0;
        int countOfZero = 0;
        while(!s.equals("1")) {
            int length = 0;
            for (char c : s.toCharArray()) {
                if(c == '0') {
                    countOfZero++;
                } else {
                    length++;
                }
            }
            s = Integer.toBinaryString(length);
            countOfLoop++;
        }

        return new int[]{countOfLoop, countOfZero};
    }

    public static void main(String[] args) {
        int[] result1 = solution("110010101001");
        System.out.println(result1[0] + " " + result1[1]);

        int[] result2 = solution("01110");
        System.out.println(result2[0] + " " + result2[1]);
    }

}
