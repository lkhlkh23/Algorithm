package codeSquad.sort;

public class SelectionSort {

    public static int[] insertionSort() {
        int[] arr = {26, 54, 93, 17, 77, 31, 44, 55, 20};

        /* 오름차순 */
        for(int i = 1; i < arr.length - 2; i++) {
            int index = 0;
            for(int j = i - 1; j >= 0; j-- ) {
                if(arr[i] > arr[j]) {
                    /* arr[i] 는 기준값! */
                    index = j + 1;
                }
            }

            /* 한칸씩 미루기! */
            for(int j= index; j < arr.length - 1; j++) {
                arr[j] = arr[j + 1];
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        for(int n : insertionSort()) {
            System.out.print(n + "\t");
        }

    }

}