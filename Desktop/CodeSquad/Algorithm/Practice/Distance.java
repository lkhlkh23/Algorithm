package Practice;

public class Distance {
    /*1. 숫자들 거리
    ex)
    int[] arr = {-1, -3, -2, 0, 3, 5, 9, 0, 10}
    int M = 3

    서로 차이가 M의 배수인 것들을 묶으면
        -> -3, 0, 3, 9, 0
        -> -1, 5
        -> -2, 10

    가장 원소가 많은 집합의 원소개수를 구하라 : 5*/

    public static void main(String[] args) {
        int[] arr = {-1, -3, -2, 0, 3, 5, 9, 0, 10};
        int m = 3;
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int count = 0;
            for (int j = 0; j < arr.length; j++) {
                if(Math.abs(arr[i] - arr[j]) % m == 0  && i != 0 && j != 0) {
                    count++;
                }
            }
            max = Math.max(count, max);
        }

        System.out.println(max);
    }
}
