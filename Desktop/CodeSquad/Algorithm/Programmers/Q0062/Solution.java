package Q0062;

class Solution {
    public int solution(int n) {
        /* 2 * n 타일링
         *    url : https://programmers.co.kr/learn/courses/30/lessons/12900?language=java */
        int[] arr = new int[60000 + 2];
        arr[0] = 0; arr[1] = 1;
        for(int i = 2; i < arr.length; i++) {
            arr[i] = (arr[i - 1] % 1000000007 + arr[i - 2] % 1000000007) % 1000000007;
        }
        return arr[n + 1];
    }
}
