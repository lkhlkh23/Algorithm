package Q0023_Not_Budget;

import java.util.*;

public class Solution {
    /* 예산
     *      url  : https://programmers.co.kr/learn/courses/30/lessons/12982?language=java */
    public static int solution(int[] d, int budget) {
        List<Integer> list = new ArrayList<>();
        permutation(list, d, 0, d.length, budget);
        return list.get(list.size() - 1);
    }

    public static void permutation(List<Integer> list, int[] nums, int depth, int r, int budget) {
        if(r == 0) {
            int sum = 0;
            int i = 0;
            for(int x = 0; x < nums.length;x++) {
                System.out.print(nums[x] + "\t");
            }
            System.out.println();
            while(i < nums.length && (sum += nums[i++]) <= budget) {
                if(sum == budget) list.add(i);
            }
        } else {
            for(int i = depth; i < nums.length; i++) {
                swap(nums, depth, i);
                permutation(list, nums, depth + 1, r - 1, budget);
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
        int[] d = {1,3,2,5,4};
        System.out.println("Sol1 : "+solution(d, 9)); // 1 3 5

        int[] d2 = {1,1,1,5,4};
        System.out.println("Sol2 : " + solution(d2, 9)); // 4 5

        int[] d3 = {2, 2, 3, 3};
        System.out.println("Sol3 : " + solution(d3, 10)); // 4 5
    }
}
