package job;

import java.util.*;

public class Solution2 {

    public static int solution(int[] people, int[] tshirts) {
        int answer = 0;
        Arrays.sort(people); // 상의크기가 작은 사람부터 우선적으로 티셔츠를 제공하기 위해서 정렬 수행!
        Arrays.sort(tshirts); // 자바에서는 퀵소트로 정렬!

        int index = 0; // 이미 제공한 티셔츠를 나타내기위한 변수!, 처음에는 제공하지 않았기 때문에 0!
        for(int person : people) {
            for(int j = index; j < tshirts.length; j++) {
                index++;
                if(person <= tshirts[j]) {
                    answer++;
                    break; // 티셔츠를 제공했으면 해당 사람은 반복문을 돌 필요가 없기 때문에 브레이크!
                }
            }
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