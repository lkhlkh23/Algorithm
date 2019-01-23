package Q10867;

import java.io.*;
import java.util.*;

public class Main {
   /*
      문제 : 중복뺴고 장렬하기
      url : https://www.acmicpc.net/problem/10867
      재풀이 : X
   */

    private static final String BLANK = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        Set<Integer> set = new TreeSet<>();
        String[] input = br.readLine().split(BLANK);

        for(int i = 0; i < n; i++)
            set.add(Integer.parseInt(input[i]));

        for(int num : set)
            sb.append(num).append(BLANK);

        bw.write(sb.toString());
        bw.close();
    }

}