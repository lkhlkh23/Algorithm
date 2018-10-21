package Q0052_Combination;

import java.util.*;

public class Solution {
    public static int solution(int[] nums) {
        /* 소수만들기
            url : https://programmers.co.kr/learn/courses/30/lessons/12977 */
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

        List<Integer> result = new ArrayList<>();
        combination(0, nums, 0, 0, result);

        int answer = 0;
        for(int num : result) {
            answer = primes[num] ? answer : answer + 1;
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

    public static void combination(int index, int[] origin, int converted, int depth, List<Integer> result) {
        if(depth == 3) {
            result.add(converted);
        } else {
            for(int i = index; i <= origin.length - 3 + depth; i++) {
                combination(i + 1, origin, converted + origin[i], depth + 1, result);
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {1,2,7,6,4};
        System.out.println(solution(arr));

    }
}
