package codeSquad.sort;

public class RadixSort {
    /* 정렬할 원소의 키값에 해당하는 버킷(bucket)에 원소를 분배하였다가 버킷의 순서대로 원소를 꺼내는 방법을 반복 */
    public static void main(String[] args) {
        int[] arr = {69, 10, 32, 2, 16, 8, 31, 22};
    }

    public static void radixSort(int[] arr) {
        /* 정렬하는 숫자가 최대 2자리라는 조건! */
        int len = 2;
        int[] bucket = new int[10];
        int[] tempBucket = new int[10];
        for(int i = 0; i < len; i++) {
            for(int j = 0; j < arr.length; j++) {
                if(i == 0) {
                    // %10
                } else {
                    // /10
                }
            }
        }

    }
}
