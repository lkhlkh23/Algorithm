import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt();

        for(int i = 0; i < n; i++)
            sb.append(i + 1).append("\n");

        System.out.println(sb.toString());
    }
}