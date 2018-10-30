package Q11726;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /* 2 * n 타일링 */
        int n = new Scanner(System.in).nextInt();

        System.out.println(getResult(n));

    }

    public static int getResult(int n) {
        int[] arr = new int[n + 1];

        if(n <= 2) {
            return n;
        }
        arr[1] = 1;
        arr[2] = 2;

        for(int i = 3; i < arr.length; i++) {
            arr[i] = (arr[i - 2] % 10007+ arr[i - 1] % 10007) % 10007;
        }

        return arr[n];
    }
}
