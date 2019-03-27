package Q11653;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        int n = new Scanner(System.in).nextInt();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int divide = 2;
        while(n > 1) {
            if(n % divide == 0) {
                n /= divide;
                bw.write(divide + "\n");
            } else {
                divide++;
            }
        }
        bw.close();
    }
}