package Q1094;


import java.io.*;
import java.util.*;

public class Main {
   /*
       문제 : 막대기
       url : https://www.acmicpc.net/problem/1094
       재풀이 : O
    */

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());

        System.out.println(getResultByStack(n));
        System.out.println(geResultByBitCount(n));

        bw.close();
    }

    public static int geResultByBitCount(int num) {
        return Integer.bitCount(num);
    }

    public static int getResultByStack(int num) {
        int size = 64;
        Stack<Integer> stack = new Stack<>();
        stack.add(size);
        int sum = 0;
        while((size + sum) != num) {
            size = stack.pop() / 2;
            if(size + sum < num) {
                stack.add(size);
                sum += size;
            }
            stack.add(size);
        }
        return stack.size();
    }

}