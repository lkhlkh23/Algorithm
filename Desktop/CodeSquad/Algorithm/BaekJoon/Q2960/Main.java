package Q2960;

import java.io.*;

public class Main {
    /*
       문제 : 아리토네스의 체
       url : https://www.acmicpc.net/problem/2960
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        String[] input = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);
        int cnt = 0;
        boolean flag = true;
        boolean[] primes= new boolean[n + 1];

        for (int i = 2; flag; i++) {
            if(!primes[i]) {
                int j = 1;
                while(i * j <= n) {
                    if(!primes[i * j]) {
                        primes[i * j] = true;
                        System.out.println(i * j);
                        cnt++;
                        if(k == cnt) {
                            flag = false;
                            System.out.println((i * j));
                            break;
                        }
                    }
                    j++;
                }
            }
        }

    }
}
