package lgcodemonster;

import java.util.*;

public class Solution {
    public static int solution(int[] people, int[] tshirts) {
        int answer = 0;
        Arrays.sort(people);
        Arrays.sort(tshirts);

        int index = 0;
        for(int i = 0; i < people.length; i++) {
            for(int j = index; j < tshirts.length; j++) {
                if(people[i] <= tshirts[j]) {
                    answer++;
                    index++;
                    break;
                }
                index++;
            }
            if(i > index) break;
        }
        return answer;
    }

    public static void main(String[] args) {
        int[] people = {2, 3};
        int[] shirts = {1, 2, 3};
        System.out.println(solution(people, shirts));

        int[] people2 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] shirts2 = {1, 1};
        System.out.println(solution(people2, shirts2));
    }
}
