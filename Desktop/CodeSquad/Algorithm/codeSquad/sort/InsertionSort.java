package codeSquad.sort;

public class InsertionSort {
    public static void main(String[] args) {
        /* https://visualgo.net/en/sorting */
        /* 삽입정렬 */
        int[] arr = {3, 2, 1, 5, 4};

        for (int i = 1; i < arr.length; i++) {
            for (int j = i - 1; j >= 0; j--) {
                if(arr[i] < arr[j]) {
                    // 뒤로 미루기!
                    //for(int k = 0;)
                }
            }
        }
    }
}
