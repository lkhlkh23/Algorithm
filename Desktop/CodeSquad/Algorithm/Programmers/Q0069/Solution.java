package Q0069;

public class Solution {
    /*
	 	문제 : 소수찾
	 	url : https://programmers.co.kr/learn/courses/30/lessons/42839
	 	재풀이 : O
	*/

    public int solution(int[] numbers, int target) {
        return DFS(numbers, target, 0, 0);
    }

    public int DFS(int[] numbers, int target, int index, int num) {
        if(index == numbers.length) {
            return num == target ? 1 : 0;
        } else {
            return DFS(numbers, target, index + 1, num + numbers[index])
                    + DFS(numbers, target, index + 1, num - numbers[index]);
        }
    }

    public static void main(String[] args) {
        int[] arr = new int[20];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = 1;
        }
        int target = 3;

        System.out.println(new Solution().solution(arr, target));
    }
}
