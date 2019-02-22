package Q1699;


import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
   /*
       문제 : 제곱수의 합
       url : https://www.acmicpc.net/problem/1699
       재풀이 : X
    */

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;

        int start = (int) Math.sqrt(n);
        while(n > 0 && start > 0) {
            if(n >= Math.pow(start, 2)) {
                n -= Math.pow(start, 2);
                cnt++;
            } else {
                start--;
            }
        }

        bw.write((cnt) + "\n");
        bw.close();
    }

}