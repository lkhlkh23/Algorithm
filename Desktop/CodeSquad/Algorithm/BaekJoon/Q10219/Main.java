package Q10219;

import java.io.*;

public class Main {
   /*
       문제 : Meats on the Grill
       url : https://www.acmicpc.net/problem/10219
       재풀이 : X
    */

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            int h =  Integer.parseInt(br.readLine().split(" ")[0]);
            for(int j = 0; j < h; j++) {
                sb.append(new StringBuilder(br.readLine()).reverse()).append("\n");
            }
        }

        bw.write(sb.toString());
        bw.close();
    }

}