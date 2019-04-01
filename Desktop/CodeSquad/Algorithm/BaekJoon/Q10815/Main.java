package Q10815;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
   /*
      문제 : 숫자카드
      url : https://www.acmicpc.net/problem/10815
      재풀이 : X
   */

   private static final String BLANK = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Set<String> cards = obtainStream(br.readLine())
                .collect(Collectors.toSet());

        int m = Integer.parseInt(br.readLine());
        obtainStream(br.readLine()).mapToInt(str -> cards.contains(str) ? 1 : 0)
                .forEach(result -> sb.append(result + BLANK));

        bw.write(sb.toString());
        bw.close();
    }

    public static Stream<String> obtainStream(String input) {
        return Stream.of(input.split(BLANK));
    }

}