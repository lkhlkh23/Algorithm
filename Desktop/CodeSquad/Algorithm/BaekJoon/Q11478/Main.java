package Q11478;

import java.io.*;
import java.util.*;

public class Main {
    /*
       문제 : 서로 다른 부분 문자열의 개수
       url : https://www.acmicpc.net/problem/11478
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String input = new BufferedReader(new InputStreamReader(System.in)).readLine();
        Set<String> set = new HashSet<>();

        for (int i = 0; i < input.length(); i++)
            for (int j = i; j < input.length(); j++)
                set.add(input.substring(i, j + 1));

        bw.write(set.size() + "\n");
        bw.close();
    }

    public static String random(int n) {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < n; i++) {
            sb.append((char)('A' + (i % 25)));
        }
        return sb.toString();
    }
}
