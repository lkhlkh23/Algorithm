package Q10953;

import java.io.*;
import java.util.*;

public class Main {
   /*
       문제 : A + B - 6
       url : https://www.acmicpc.net/problem/10953
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++)
            sb.append(Arrays.stream(br.readLine().split(",")).mapToInt(Integer::parseInt).sum()).append("\n");

        bw.write(sb.toString());
        bw.close();
    }

}