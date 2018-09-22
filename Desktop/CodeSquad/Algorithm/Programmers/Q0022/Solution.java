package Q0022;

public class Solution {
    public static int[] solution(long n) {
        char[] arr = (n + "").toCharArray();
        int[] answer = new int[arr.length];
        for(int i = answer.length - 1; i > -1; i--) {
            answer[answer.length - 1 - i] = arr[i] - '0';
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] arr = solution((1234));
        for(int a : arr)
            System.out.println(a);
    }

}
