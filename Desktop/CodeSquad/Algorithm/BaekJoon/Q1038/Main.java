package Q1038;

import java.io.*;
import java.util.*;

public class Main {
    /*
       문제 : 감소하는수
       url : https://www.acmicpc.net/problem/1038
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        System.out.println(solve(new Scanner(System.in).nextInt()));
    }

    public static String solve(int n) {
        if(n < 10)
            return String.valueOf(n);

        Queue<String> decreases = new LinkedList<>();
        for (int i = 0; i < 10; i++)
            decreases.add(String.valueOf(i));

        int result = 9;
        while(!decreases.isEmpty()) {
            String extract = decreases.poll();
            for (int i = 0; i < (extract.charAt(extract.length() - 1) - '0'); i++) {
                decreases.add(extract + i);
                result++;
                if(result == n)
                    return extract + i;
            }
        }

        return String.valueOf(-1);
    }
}
