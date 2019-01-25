package codeSquad.tree;

import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        List<Integer> list = new ArrayList<>();

        int a = 0;
        for (int i = 0; i < n; i++) {
            list.add(Integer.parseInt(input[i]));
            a = Math.max(a, Integer.parseInt(input[i]));
        }

        boolean[] bool = getResult(a);
        for (int i = 1; i < bool.length; i++)
            if(bool[i])
                list.remove(Integer.valueOf(i));

        int b = 0;
        for (int num : list)
            b = Math.max(num, b);

        bw.write((a + " " + b) + "\n");
        bw.close();
    }

    public static boolean[] getResult(int num) {
        boolean[] arr = new boolean[num + 1];
        for (int i = 1; i < arr.length; i++) {
            if(num % i == 0) {
                arr[i] = true;
            }
        }
        return arr;
    }

}