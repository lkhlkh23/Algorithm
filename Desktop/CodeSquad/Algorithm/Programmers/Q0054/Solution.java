package Q0054;

import java.util.*;

public class Solution {
    /* 영어 끝말잇기
     *    url : https://programmers.co.kr/learn/courses/30/lessons/12981?language=java */

    public static int[] solution(int n, String[] words) {
        int[] answer = new int[2];
        List<String> list = new ArrayList<>();
        for(String str : words) {
            list.add(str);
        }
        for(int i = 1; i < list.size(); i++) {
            System.out.println(list.get(i));
            if(list.get(i).charAt(0) != list.get(i - 1).charAt(list.get(i - 1).length() - 1)
                || list.subList(0, i).contains(list.get(i))) {
                System.out.println(list.subList(0, i). toString());
                answer[0] = ((i) % n) + 1; //사람번호
                answer[1] = ((i) / n) + 1; // 차례
                return answer;
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        String[] arr = {
                "hello", "observe", "effect", "take", "either",
                "recognize", "encourage", "ensure", "establish", "hang",
                "gather", "refer", "reference", "estimate", "executive"
        };

        for(int num : solution(5, arr)) {
            System.out.println(num);
        }

        String[] arr2 = {
                "tank", "kick", "know", "wheel", "land", "dream", "mother", "robot", "tank"
        };

        for(int num : solution(3, arr2)) {
            System.out.println(num);
        }

        String[] arr3 = {
                "hello", "one", "even", "never", "now", "world", "draw"
        };

        for(int num : solution(2, arr3)) {
            System.out.println(num);
        }

        String[] arr4 = {
                "hello", "oi", "ih", "hello", "ox"
        };

        for(int num : solution(3, arr4)) {
            System.out.println(num);
        }
    }
}
