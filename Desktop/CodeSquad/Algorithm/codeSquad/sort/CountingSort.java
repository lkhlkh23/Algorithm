package codeSquad.sort;

public class CountingSort {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int rand = 5;
        System.out.println("---정렬 전---");
        for(int i = 0; i < arr.length; i++) {
            arr[i] = (int)Math.round((Math.random() * rand));
            System.out.print(arr[i] + "\t");
        }
        System.out.println();
        countingSort(rand, arr);
    }

    public static void countingSort(int n, int[] arr) {
        int[] result = new int[n + 1];
        for(int num : arr)
            result[num]++;

        int sum = 0;
        int index = 0;
        int i = 0;
        System.out.println("---정렬 후---");
        while(i < arr.length) {
            if(i < sum + result[index]) {
                System.out.print(index + "\t");
                i++;
            }
            if(i == sum + result[index]){
                sum += result[index];
                index++;
            }
        }
    }
}
