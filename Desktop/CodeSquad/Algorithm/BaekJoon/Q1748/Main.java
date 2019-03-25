package Q1748;

import java.io.*;

public class Main {
    /*
       문제 : 수 이어쓰기
       url : https://www.acmicpc.net/problem/1748
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        int num = Integer.parseInt(new BufferedReader(new InputStreamReader(System.in)).readLine());
        int length = String.valueOf(num).length() - 1;
        int result = 0;
        for (int i = 0; i < length; i++) {
            result += (int)Math.pow(10, i) * 9 * (i + 1);
        }
        result += (((num % (int)Math.pow(10, length)) + 1)* (length + 1));
        System.out.println(result);
    }
}
