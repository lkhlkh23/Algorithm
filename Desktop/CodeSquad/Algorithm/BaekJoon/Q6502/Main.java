package Q6502;

import java.io.*;

public class Main {
   /*
      문제 : 동혁피자
      url : https://www.acmicpc.net/problem/6502
      재풀이 : X
   */

    public static final String BLANK = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String input = "";
        int index = 1;
        while(!(input = br.readLine()).startsWith("0")) {
            String[] info = input.split(BLANK);
            sb.append(isFit(Integer.parseInt(info[0]), Integer.parseInt(info[1]), Integer.parseInt(info[2]))
                ? String.format("Pizza %d fits on the table.\n", index++)
                    : String.format("Pizza %d does not fit on the table.\n", index++));
        }

        bw.write(sb.toString());
        bw.close();
    }

    public static boolean isFit(int r, int w, int h) {
        return Math.pow(r, 2) >= Math.pow((double)w / 2, 2) + Math.pow((double)h / 2, 2)
                && w <= 2 * r && h <= 2 * r;
    }
}