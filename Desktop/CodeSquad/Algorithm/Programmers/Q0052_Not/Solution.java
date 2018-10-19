package Q0052_Not;

import java.util.*;

public class Solution {
    public static int solution(int[] nums) {
        /* 소수만들기
            url : https://programmers.co.kr/learn/courses/30/lessons/12977 */
        int answer = 0;
        List<Integer> list = new ArrayList<>();
        permutation(list, nums, 0, 3);

        boolean[] primes = new boolean[1000 * 50 + 1];
        int i = 2;
        primes[0] = primes[1] = true;
        while(i < primes.length) {
            int j = 2;
            if(primes[i] == false) {
                while(i * j < primes.length) {
                    primes[i * j++] = true;
                }
            }
            i++;
        }

        for(int num : list) {
            answer = primes[num] ? answer : answer + 1;
            //System.out.println(num);
        }

        return answer;
    }

    public static void permutation(List<Integer> list, int[] nums, int depth, int r) {
        if(r == 0) {
            int sum = 0;
            for(int i = 0; i < 3; i++) {
                sum += nums[i];
                System.out.print(nums[i]);
            }
            System.out.println();
            list.add(sum);
        } else {
            for(int i = depth; i < nums.length; i++) {
                swap(nums, depth, i);
                permutation(list, nums, depth + 1, r - 1);
                swap(nums, i, depth);
            }
        }
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static void main(String[] args) {
        int[] arr = {1,2,3,4};
        System.out.println(solution(arr));
    }
}
