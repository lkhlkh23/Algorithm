package Q2902;

import java.io.*;
import java.util.stream.Stream;

public class Main {
    /*
        문제    : KMP는 왜 KMP일까?
        url  : https://www.acmicpc.net/problem/2902
        재풀이 : X
      */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        Stream.of(br.readLine().split("-")).forEach(s -> sb.append(s.charAt(0)));

        bw.write(sb.toString());
        bw.close();
    }
}
