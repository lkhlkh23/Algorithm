package Q1546;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = sc.nextInt();

        Arrays.sort(arr);
        double sum = 0;
        for(int score : arr)
            sum += ((double)score / arr[n - 1] * 100);

        System.out.println((double)sum / n);
    }

    public static void solution() {
        int n = sc.nextInt();
        int sum = 0;
        int max = 0;
        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            sum += a;
            max = Math.max(a, max);
        }

        System.out.println(((double)sum * 100)/ (max * n));
    }
}


