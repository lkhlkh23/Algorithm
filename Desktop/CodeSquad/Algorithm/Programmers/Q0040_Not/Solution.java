package Q0040_Not;

import java.util.*;

public class Solution {
    /* 가장 큰 수
     *    url : https://programmers.co.kr/learn/courses/30/lessons/42746?language=java */

    public static String solution(int[] numbers) {
        List<String> numList = new ArrayList<>();
        for(int num : numbers)
            numList.add(num + "");
        Collections.sort(numList);
        int len = numList.get(numList.size() - 1).length();
        List<String> result = new ArrayList<>();
        for(String str : numList) {
            result.add(addZero(str, len));
        }
        Collections.sort(result, Collections.reverseOrder());

        StringBuilder sb = new StringBuilder();
        for(String str : result) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static String addZero(String str, int len) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        for(int i = str.length(); i <= len; i++) {
            sb.append("0");
        }
        return sb.toString();
    }

    /* 3과 30을 비교했을 때, 3이 30보다 더 커야하는데, 그렇지 못하다! 왜...? */
    public static String solution2(int[] numbers) {
        List<String> list = new ArrayList<>();
        for(int i = 0; i < numbers.length; i++)
            list.add(numbers[i] + "");

        Collections.sort(list, Collections.reverseOrder());
        StringBuilder sb = new StringBuilder();
        for(String str : list) {
            sb.append(str);
        }
        return sb.toString();
    }

    public static void main(String[] args) {
        int[] arr = {6, 10, 2};
        System.out.println(solution(arr));

        int[] arr2 = {3, 30, 34, 5, 9};
        System.out.println(solution(arr2)); // 9 5 34 3 30 // 9 5 34 30 3*/
    }
}
