package Q0055;

public class Solution {
    /* N개의 최소공배수
     *    url : https://programmers.co.kr/learn/courses/30/lessons/12953 */
    public static int solution(int[] arr) {
        int answer = 1;
        for(int i = 0; i < arr.length; i++) {
            answer = getLCD(answer, arr[i]);
        }
        return answer;
    }

    public static int getLCD(int a, int b) {
        return a * b / getGCD(a, b);
    }

    public static int getGCD(int a, int b) {
        int max = Math.max(a, b);
        int min = Math.min(a, b);
        if(max % min == 0) {
            return min;
        } else {
            return getGCD(min, max % min);
        }
    }

    public static void main(String[] args) {
        int[] arr = {2, 6, 8, 14};
        System.out.println(solution(arr));
    }
}
