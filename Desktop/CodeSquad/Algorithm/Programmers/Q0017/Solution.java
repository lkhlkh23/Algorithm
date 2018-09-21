package Q0017;


public class Solution {
    /* 소수 찾기!
     *    url : https://programmers.co.kr/learn/courses/30/lessons/12921?language=java */
    public static int solution(int n) {
        int answer = 0;
        boolean[] arr = new boolean[n + 1];
        for(int i = 2; i <= n; i++) {
            if(arr[i] == false) {
                for(int j = i + i; j <= n; j+=i) {
                    arr[j] = true;
                }
                answer++;
            }
        }
        return answer;
    }

    public static void main(String args[]) {
        System.out.println(solution(10));
    }
}
