package Q0064;

class Solution {
    /* 멀리뛰기
     *    url : https://programmers.co.kr/learn/courses/30/lessons/12914?language=java */
    public static long solution(int n) {
        long[] arr = new long[n + 1];
        if(n <= 2) return n;
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3; i < arr.length; i++) {
            arr[i] = (arr[i - 2] % 1234567 + arr[i - 1] % 1234567) % 1234567;
        }
        return arr[n];
    }

    public static void main(String[] args) {
        System.out.println(solution(2000));
    }

}