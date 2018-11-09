package Q1094;


import java.io.*;
import java.util.*;

public class Main {
   /*
       문제 : 막대기
       url : https://www.acmicpc.net/problem/1094
       재풀이 : X
    */

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int size = 64;
        Stack<Integer> stack = new Stack<>();
        stack.add(size);
        int sum = 0;
        while((size + sum) != n) {
            size = stack.pop() / 2;
            if(size + sum >= n) {
                stack.add(size);
            } else {
                stack.add(size);
                stack.add(size);
                sum += size;
            }
        }

        System.out.println(stack.size());
        System.out.println(Integer.bitCount(n));

        bw.close();
    }

    public static int geResult(int num) {
        return Integer.bitCount(num);
    }

}