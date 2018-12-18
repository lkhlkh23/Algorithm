package Q1292;


import java.io.*;
import java.util.Arrays;

public class Main {
   /*
       문제 : 쉽게 푸는 문제
       url : https://www.acmicpc.net/problem/1292
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int[] arr = new int[1000 + 1];
        int index = 1;
        for (int i = 1; index < arr.length; i++) {
            for (int j = 0; j < i && index < arr.length; j++) {
                arr[index++] = i;
            }
        }

        String[] input = br.readLine().split(" ");
        int sum = 0;
        for (int i = Integer.parseInt(input[0]); i <= Integer.parseInt(input[1]); i++) {
            sum += arr[i];
        }

        bw.write(sum + System.lineSeparator());

        bw.close();
    }
}
