package Q2753;

import java.io.*;

public class Main {
   /*
       문제 : 윤년
       url : https://www.acmicpc.net/problem/2753
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        bw.write(((n % 4 == 0 && n % 100 != 0) || (n % 400 == 0) ? 1 : 0) + "\n");
        bw.close();
    }


}