package Q1110;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(); //26;
        boolean flag = true;
        int cnt = 0;
        int result = n;
        do {
            result =  (result / 10 + result % 10) % 10 + 10 * (result % 10);
            cnt++;
        } while (n != result);

        System.out.println(cnt);
    }
}
