package Q10950;

import java.io.*;
import java.util.*;

public class Main {
   /*
       문제 : A + B - 3
       url : https://www.acmicpc.net/problem/10950
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())).append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }

}