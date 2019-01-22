package Q1357;

import java.io.*;

public class Main {
   /*
      문제 : 뒤집힌덧셈
      url : https://www.acmicpc.net/problem/1357
      재풀이 : X
   */

    public static final String BLANK = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(BLANK);
        bw.write(reverse(String.valueOf(reverse(input[0]) + reverse(input[1]))) + "\n");
        bw.close();
    }

    public static int reverse(String str) {
        return  Integer.parseInt(new StringBuilder(str).reverse().toString());
    }
}