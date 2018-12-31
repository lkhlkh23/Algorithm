package Q2863;

import java.io.*;
import java.util.*;

public class Main {
   /*
      문제 : 이게분수?
      url : https://www.acmicpc.net/problem/2863
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int a = Integer.parseInt(input[0]);
        int b = Integer.parseInt(input[1]);
        input = br.readLine().split(" ");
        int c = Integer.parseInt(input[0]);
        int d = Integer.parseInt(input[1]);

        double[] arr = new double[5];
        arr[1] = ((double)c / d) + ((double)a / b);
        arr[2] = ((double)d / b) + ((double)d / a);
        arr[3] = ((double)b / a) + ((double)d / c);
        arr[4] = ((double)a / c) + ((double)b / d);

        double max = 0;
        int index = 0;
        for(int i = 1; i < arr.length; i++) {
            if(max < arr[i]) {
                max = arr[i];
                index = i;
            }
        }
        bw.write(index + "\n");
        bw.close();
    }
}

