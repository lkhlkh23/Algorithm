package Q42896;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Solution {
    /*
	 	문제 : 카드게임
	 	url : https://programmers.co.kr/learn/courses/30/lessons/42896
	 	재풀이 : X
	*/

    // 시간초과 - 테스크 케이스 3, 4가 맞지 않는다! //
    public int solution(int[] left, int[] right) {
        int answer = 0;

        Queue<Integer> leftQueue = new PriorityQueue<>(Collections.reverseOrder());
        int leftIndex = 0;
        int rightIndex = 0;
        for (int num : left)
            leftQueue.add(num);

        while(leftIndex < left.length && rightIndex < right.length) {
            if(left[leftIndex] > right[rightIndex]) {
                // 1. 왼쪽크면 오른쪽 팝 //
                answer += right[rightIndex++];
            } else if(leftQueue.peek() > right[rightIndex] && left[leftIndex] <= right[rightIndex]) {
                // 2. 왼쪽 가장 큰 값 > 오른쪽 값, 왼쪽값 <= 오른쪽값 왼쪽값 버리기 //
                if(leftQueue.peek() == left[leftIndex])
                    leftQueue.poll();

                leftIndex++;
            } else if((leftQueue.peek() <= right[rightIndex] && left[leftIndex] < right[rightIndex])
                        || leftQueue.peek() == right[rightIndex] && left[leftIndex] <= right[rightIndex]) {
                // 3. 왼쪽 가장 큰 값 <= 오른쪽 값, 왼쪽 오른쪽 버리기 //
                if(leftQueue.peek() == left[leftIndex])
                    leftQueue.poll();

                leftIndex++;
                rightIndex++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        //[3, 2, 5]	[2, 4, 1]	7
        int[] left = {3, 2, 5};
        int[] right = {2, 4, 1};
        System.out.println(new Solution().solution(left, right));

        int[] left2 = {5, 2, 3};
        int[] right2 = {1,4, 7,1};
        System.out.println(new Solution().solution(left2, right2));

        int[] left3 = {2, 3, 2};
        int[] right3 = {2,2, 4,2};
        System.out.println(new Solution().solution(left3, right3));

        int[] left4 = {2, 2, 2};
        int[] right4 = {2,2, 2,2};
        System.out.println(new Solution().solution(left4, right4));

        int[] left5 = {2, 2, 2, 2, 2, 2, 2, 2, 6};
        int[] right5 = {4};
        System.out.println(new Solution().solution(left5, right5));
    }
}
