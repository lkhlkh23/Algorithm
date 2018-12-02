package Q2562;

import java.io.*;
import java.util.*;

public class Main {
   /*
       문제 : 최댓값
       url : https://www.acmicpc.net/problem/2562
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Integer> map = new HashMap<>();
        int max = 0;
        int index = 0;
        for(int i = 1; i <= 9; i++) {
            int num = Integer.parseInt(br.readLine());
            if(num > max) {
                max = num;
                index = i;
            }
        }
        bw.write(max + "\n");
        bw.write(index + "\n");
        bw.close();
    }


}