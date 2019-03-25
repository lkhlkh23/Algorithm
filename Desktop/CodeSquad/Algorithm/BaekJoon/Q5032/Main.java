package Q5032;

import java.io.*;

public class Main {
    /*
        문제    : 틴산음료
        url  : https://www.acmicpc.net/problem/5032
        재풀이 : X
      */

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        int empty = Integer.parseInt(input[0]) + Integer.parseInt(input[1]);
        int change = Integer.parseInt(input[2]);
        int cnt = 0;

        while(empty >= change) {
            empty = empty - change + 1;
            cnt++;
        }

        bw.write(cnt + "\n");
        bw.close();
    }
}
