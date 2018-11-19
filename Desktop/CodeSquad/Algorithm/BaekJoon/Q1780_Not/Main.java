package Q1780_Not;

import java.io.*;
import java.util.*;

public class Main {
   /*
       문제 : 종이의 개수
       url : https://www.acmicpc.net/problem/1780
       재풀이 : X
    */

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            while(st.hasMoreTokens()) {
                list.add(Integer.parseInt(st.nextToken()));
            }
        }

        int x = 0;
        int y = 0;


        bw.close();
    }

}