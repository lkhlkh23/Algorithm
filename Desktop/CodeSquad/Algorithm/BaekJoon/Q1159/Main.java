package Q1159;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
   /*
      문제 : 농구경기
      url : https://www.acmicpc.net/problem/1159
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        Map<Character, Integer> names = new TreeMap<>();
        for (int i = 0; i < n; i++) {
            char firstName = br.readLine().charAt(0);
            names.put(firstName, names.containsKey(firstName) ? names.get(firstName) + 1 : 1);
        }

        if(names.keySet().stream().filter(name -> names.get(name) >= 5).count() == 0) bw.write("PREDAJA");
        else names.keySet().stream().filter(name -> names.get(name) >= 5).forEach(name -> System.out.print(name));

        bw.close();
    }
}
