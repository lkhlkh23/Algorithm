package codeSquad.sort;

public class InsertionSort {
    public static int[] insertionSort() {
        /* https://visualgo.net/en/sorting */
        /* 삽입정렬 */
        int[] arr = {3, 2, 1, 5, 4};

        for (int i = 1; i < arr.length; i++) {
            int temp = arr[i];
            for (int j = i - 1; j >= 0; j--) {
                if(arr[i] < arr[j]) {
                    arr[i] = arr[j];
                } else {
                    arr[j] =temp;
                    break;
                }
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
