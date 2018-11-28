package Q16472;

import java.io.*;
import java.util.*;

public class Main {
   /*
       문제 : 고냥이
       url : https://www.acmicpc.net/problem/16472
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        char[] input = br.readLine().toCharArray();
        Set<Character> set = new HashSet<>();
        int max = n;
        for(int i = 0; i < input.length - max + 1; i++) {
            int cnt = 0;
            int j = i;
            while (set.size() <= n && j < input.length) {
                set.add(input[j++]);
                cnt++;
            }
            set.clear();
            max = Math.max(max, cnt - 1);
        }

        bw.write(max + "\n");
        bw.close();
    }

}