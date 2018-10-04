package Q2455;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        /* Q2455 */
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[4];
        arr[0] = -1 * sc.nextInt() + sc.nextInt();
        int max = arr[0];
        for(int i = 1; i < arr.length; i++) {
            arr[i] = arr[i - 1] - sc.nextInt() + sc.nextInt();
            max = Math.max(max, arr[i]);
        }

        System.out.println(max);

    }

}