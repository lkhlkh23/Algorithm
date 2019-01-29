package Q1920;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
	/*
	 	문제 : 수 찾기
	 	url : https://www.acmicpc.net/problem/1920
	 	재풀이 : X
	*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new TreeSet<>();
        Stream.of(br.readLine().split(" "))
                .map(s -> Integer.parseInt(s)).forEach(i -> set.add(i));

        int m = Integer.parseInt(br.readLine());
        String[] arr = br.readLine().split(" ");
        for(int i = 0; i < m; i++)
            sb.append(set.contains(Integer.parseInt(arr[i])) ? "1" : "0").append(System.lineSeparator());

        bw.write(sb.toString());
        bw.close();
    }
}
