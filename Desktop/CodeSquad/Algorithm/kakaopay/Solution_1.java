package kakaopay;

import Practice.Pattern;

import java.lang.reflect.Parameter;
import java.util.*;

public class Solution_1 {

    public static int solution(String phone_number) {
        if(phone_number.startsWith("010-")) {
            String[] nums = phone_number.split("-");
            if(nums.length == 3 && nums[1].length() == 4 && nums[2].length() == 4) {
                return 1;
            }
        } else if(phone_number.startsWith("010")) {
            if(phone_number.length() == 11 && !phone_number.contains("-") && !phone_number.contains("+")) {
                return 2;
            }
        } else if(phone_number.startsWith("+82-10-")) {
            //유형 3 : +82-10-XXXX-XXXX
            String[] nums = phone_number.split("-");
            if(nums.length == 4 && nums[2].length() == 4 && nums[3].length() == 4
                    && !nums[2].contains("+") && !nums[3].contains("+")) {

                return 3;
            }
        }
        return -1;
    }


    public static void main(String[] args) {
        System.out.println(solution("01067910076")); // 2
        System.out.println(solution("010-6791-0076")); // 1
        System.out.println(solution("+82-10-3434-2323"));
    }
}
