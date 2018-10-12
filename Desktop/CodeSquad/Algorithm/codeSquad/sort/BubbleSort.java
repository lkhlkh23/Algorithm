package codeSquad.sort;

public class BubbleSort {

    public static int[] bubbleSort() {
        int[] arr = {26, 54, 93, 17, 77, 31, 44, 55, 20};

        /* 오름차순 */
        for(int i = 0; i < arr.length; i++) {
            for(int j = 0; j < arr.length - i - 1; j++ ) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        for(int n : bubbleSort()) {
            System.out.print(n + "\t");
        }

    }

}