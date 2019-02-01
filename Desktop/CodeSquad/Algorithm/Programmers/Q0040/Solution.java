package Q0040;

import java.util.Arrays;

class Solution {
    /* 가장큰수
     *     url : https://programmers.co.kr/learn/courses/30/lessons/42746?language=java */

    public static String solution(int[] numbers) {
        String[] arr = new String[numbers.length];
        for (int i = 0; i < numbers.length; i++)
            arr[i] = String.valueOf(numbers[i]);

        Arrays.sort(arr, (o1, o2) -> (o2 + o1).compareTo(o1 + o2));

        // numbers = {0, 0, 0, 0, 0} 예외일 경우
        if(arr[0].equals("0")) return "0";

        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++)
            sb.append(arr[i]);

        return sb.toString();
    }

    public static void main(String[] args) {
        int[] arr = {3, 30, 34, 5, 9, 2, 20, 200};
        System.out.println(solution(arr).equals("9534330220200"));

        int[] arr2 = {900, 90, 9, 99, 909};
        System.out.println(solution(arr2).equals("99990990900"));

        int[] arr3 = {6, 10, 2};
        System.out.println(solution(arr3).equals("6210"));

        int[] arr4 = {1, 2, 3, 4, 5, 0};
        System.out.println(solution(arr4).equals("543210"));

        int[] arr5 = {0, 0, 0, 0, 0};
        System.out.println(solution(arr5).equals("00000"));

        int[] arr6 = {10, 11, 12, 13, 14, 1, 1};
        System.out.println(solution(arr6).equals("141312111110"));

        int[] arr7 = {0, 0, 0, 0};
        System.out.println(solution(arr7));

        System.out.println(Integer.parseInt("010"));
        System.out.println(Integer.parseInt("100"));

    }

}