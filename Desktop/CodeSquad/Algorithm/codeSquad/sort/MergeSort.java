package codeSquad.sort;

public class MergeSort {
    public static int[] mergeSort(int start, int finish, int[] target) {
        int[] result = target;
        if(finish > start) {
            int mid = (start + finish) / 2;
            mergeSort(start, mid, result);
            mergeSort(mid + 1, finish, result);
            result = merge(result, start, mid, finish);
        }
        printArr(result);
        return result;
    }

    public static int[] merge(int[] target, int start, int mid, int finish) {
        int[] result = new int[target.length];
        int index = 0;
        int index1 = start;
        int index2 = mid + 1;
        while(index <= finish) {
            if(target[index1] > target[index2]) {
                result[index++] = target[index2++];
            } else if(target[index1] < target[index2]){
                result[index++] = target[index1++];
            }

            if(index2 > finish) {
                while(index <= finish) {
                    result[index++] = target[index1++];
                }
            }

            if(index1 > mid) {
                while(index <= finish) {
                    result[index++] = target[index2++];
                }
            }
        }

        return result;
    }

    public static void printArr(int[] arr) {
        for(int num : arr)
            System.out.println(num + "\t");
        System.out.println("********");
    }

    public static void main(String[] args) {
        /*int[] arr = new int[10];
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)Math.round((Math.random() * 100)) + 1;
        }*/
        int[] arr = {1, 7, 6, 5, 4};

        for(int num : mergeSort(0, arr.length - 1, arr))
            System.out.println(num + "\t");
    }
}
