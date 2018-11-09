package Q1057;

import java.io.*;

public class Main {
    /*
       문제 : 토너먼트
       url : https://www.acmicpc.net/problem/1057
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int first = Integer.parseInt(input[1]);
        int second = Integer.parseInt(input[2]);
        int result = 0;

        while(first != second) {
            first = (int)Math.ceil((double)first / 2);
            second = (int)Math.ceil((double)second / 2);
            result++;
        }

        bw.write(result + "\n");
        bw.close();
    }
}
