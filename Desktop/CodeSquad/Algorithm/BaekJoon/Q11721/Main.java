package Q11721;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = new Scanner(System.in).nextLine();
        for (int i = 0; i < Math.ceil((double)str.length() / 10); i++)
            sb.append(str.substring(i * 10, i * 10 + 10 > str.length() ? str.length() : i * 10 + 10)).append("\n");

        System.out.println(sb.toString());
    }
}
