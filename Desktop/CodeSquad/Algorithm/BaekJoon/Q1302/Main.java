package Q1302;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
   /*
      문제 : 베스트샐러
      url : https://www.acmicpc.net/problem/1302
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> books = new TreeMap<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            String book = br.readLine();
            books.put(book, books.containsKey(book) ? books.get(book) + 1 : 1);
        }

        int max = books.values().stream().min(Collections.reverseOrder()).get();
        bw.write(books.keySet().stream().filter(book -> books.get(book) == max).findFirst().get());
        bw.close();
    }
}