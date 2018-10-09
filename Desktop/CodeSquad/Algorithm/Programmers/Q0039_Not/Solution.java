package Q0039_Not;

public class Solution {
    /* 무지의 먹방라이브
         url : https://programmers.co.kr/learn/courses/30/lessons/42891?language=java */
    public static int solution(int[] food_times, long k) {
        int answer = 0;
        while(k > 0) {
            if(food_times[answer] > 0) {
                food_times[answer]--;
                k--;
            }
            if(answer == food_times.length - 1) {
                answer= 0;
            } else {
                answer++;
            }
            //printArr(food_times, k);
        }
        return answer + 1;
    }

    public static int foo(int n) {
        System.out.println(n);
        return foo(n + 1);
    }

    public static void printArr(int[] arr, long k) {
        for(int num : arr)
            System.out.print(num + "\t");

        System.out.println(k);
    }

    public static void main(String[] args) {
        int[] arr = {3, 1, 2};
        System.out.println(solution(arr,5)); // 1;
    }
}
