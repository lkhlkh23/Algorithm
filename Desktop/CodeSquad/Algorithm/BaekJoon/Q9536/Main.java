package Q9536;

import java.io.*;
import java.util.*;

public class Main {
   /*
      문제 : 여우는 어떻게 울지?
      url : https://www.acmicpc.net/problem/9536
      재풀이 : X
   */

    public static final String BLANK = " ";
    public static final String QUESTION_MARK = "?";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            String[] fox = br.readLine().split(BLANK);

            List<String> cries = new ArrayList<>();
            String input = "";
            while(!(input = br.readLine()).contains(QUESTION_MARK)) {
                cries.add(input.split(BLANK)[2]);
            }

            for (int j = 0; j < fox.length; j++) {
                sb.append(!cries.contains(fox[j]) ? (fox[j] + BLANK) : "");
            }

            sb.append(System.lineSeparator());
        }

        bw.write(sb.toString());
        bw.close();
    }
}
