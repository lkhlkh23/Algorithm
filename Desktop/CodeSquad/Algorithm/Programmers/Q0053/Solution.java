package Q0053;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    /* 폰켓몬
     *    url : https://programmers.co.kr/learn/courses/30/lessons/1845?language=java */
    public static int solution(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int num : nums) {
            set.add(num);
        }
        if(nums.length / 2 > set.size()) {
            return set.size();
        } else {
            return nums.length / 2;
        }
    }

    public static void main(String[] args) {
        int[] arr = {3,3,3,2,2,4};
        System.out.println(solution(arr));
    }

}

