package Q0031;

public class Solution {
    /* 하샤드 수
     *     url : https://programmers.co.kr/learn/courses/30/lessons/12947?language=java */
    public static boolean solution(int x) {
        char[] arr = (x + "").toCharArray();
        int sum = 0;
        for(char c : arr)
            sum += (int)(c - '0');

        return x % sum == 0 ? true : false;
    }

    public static void main(String[] args) {
        System.out.println(solution(13));
    }
}
