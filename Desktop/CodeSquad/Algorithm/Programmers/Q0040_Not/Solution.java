package Q0040_Not;

import java.util.Arrays;
class Solution {
    public static String solution(int[] numbers) {
        char[] arr = {'K', 'I', 'H', 'G', 'F', 'E', 'D', 'C', 'B', 'A'};
        String[] result = new String[numbers.length];
        for(int i = 0; i < numbers.length; i++) {
            char[] chars = (numbers[i] + "").toCharArray();
            StringBuilder sb = new StringBuilder();
            for(int j = 0; j < chars.length; j++) {
                sb.append(arr[chars[j] - '0']);
            }
            sb.append("J");
            result[i] = sb.toString();
        }

        Arrays.sort(result);

        StringBuilder sb = new StringBuilder();
        String[] arr2 = {"9", "8", "7", "6", "5", "4", "3", "2", "1", "", "0"};
        for(String str : result) {
            for(int j = 0; j < str.length() - 1; j++) {
                sb.append(arr2[str.charAt(j) - 'A']);
            }
        }

        return sb.toString();
    }

    public static void main(String[] args) {
        /*int[] arr = {3, 30, 34, 5, 9, 2, 20, 200};
        System.out.println(solution(arr).equals("9534330220200"));


        int[] arr2 = {900, 90, 9, 99, 909};
        System.out.println(solution(arr2).equals("99990990900"));*/

        int[] arr3 = {3, 32, 30};
        System.out.println(solution(arr3)); // 3 32 30

        int[] arr4 = {3, 34, 30};
        System.out.println(solution(arr4)); // 34 3 30
    }

}