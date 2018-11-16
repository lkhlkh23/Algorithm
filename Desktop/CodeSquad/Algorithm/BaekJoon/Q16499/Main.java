package Q16499;

import java.io.*;
import java.util.*;
import java.util.stream.Collectors;

public class Main {
	/*
 		문제 : 동일한 단어 그룹화하기
 		url : https://www.acmicpc.net/problem/16499
 		재풀이 : X
	 */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Set<String> set = new HashSet<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            List<String> input = Arrays.stream(br.readLine().split(""))
                    .sorted()
                    .collect(Collectors.toList());
            set.add(input.toString());
        }

        bw.write(set.size() + "\n");
        bw.close();
    }

}
