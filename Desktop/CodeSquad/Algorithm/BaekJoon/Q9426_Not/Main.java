package Q9426_Not;

import java.io.*;
import java.util.Arrays;

public class Main {

    /*
     문제 : 중앙값 측정
     url : https://www.acmicpc.net/problem/9426
     재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int k = Integer.parseInt(input[1]);

        int[] arr = new int[n];
        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());

        int sum = 0;
        for(int i = 0; i <= n - k; i++) {
            sum += getResult(arr, i, k + i, k);
        }

        bw.write(sum + "\n");
        bw.close();
    }

    public static int getResult(int[] arr, int start, int end, int k) {
        int[] temp = new int[k];
        System.arraycopy(arr, start, temp, 0, k);
        Arrays.sort(temp);
        int mid = (k + 1) / 2;
        if(k % 2 == 0) {
            return ((temp[mid - 1] + temp[mid]) / 2);
        } else {
            return temp[mid - 1];
        }
    }
}
