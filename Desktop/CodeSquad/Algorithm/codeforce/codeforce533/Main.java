package codeforce.codeforce533;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        String[] input = br.readLine().split(" ");
        for (int i = 0; i < input.length; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        Arrays.sort(arr);

        int cost = Integer.MAX_VALUE;
        int t = 0;
        for (int i = arr[0]; i < arr[arr.length - 1]; i++) {
            int sum = 0;
            int index = i;
            for (int j = 0; j < arr.length; j++) {
                sum += (Math.abs(arr[j] - index) - 1);
            }

            if(cost > sum) {
                cost = sum;
                t = index;
            }
            System.out.println(index + " " + sum);
        }

        bw.write(t + " " + cost);
        bw.close();
    }


}