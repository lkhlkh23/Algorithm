package Q2947;

import java.io.*;
import java.util.*;

public class Main {
   /*
       문제 : 나무조각
       url : https://www.acmicpc.net/problem/2947
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        // 1 ~ 5 로 고정되서 이와같이 해도 문제없음! //
        char[] input = br.readLine().replace(" ", "").toCharArray();

        for(int i = 0; i < input.length - 1; i++) {
            for(int j = 0; j < input.length - 1; j++) {
                if(input[j] > input[j + 1]) {
                    char temp = input[j];
                    input[j] = input[j + 1];
                    input[j + 1] = temp;
                    for(int k = 0; k < input.length; k++) {
                        sb.append(input[k]).append(" ");
                    }
                    sb.append("\n");
                }
            }
        }
        bw.write(sb.toString().trim());
        bw.close();
    }

}