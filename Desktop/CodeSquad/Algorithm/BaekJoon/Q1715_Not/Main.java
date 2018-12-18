package Q1715_Not;

import java.io.*;
import java.util.Arrays;

public class Main {
   /*
       문제 : 카드 정렬하기
       url : https://www.acmicpc.net/problem/1715
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        int[] arr = new int[n];
        int[] temp = new int[n];

        for (int i = 0; i < n; i++)
            arr[i] = Integer.parseInt(br.readLine());

        Arrays.sort(arr);

        if(arr.length == 1) {
            System.out.println(arr[0]);
            return;
        }

        int sum = 0;
        temp[1] = arr[0] + arr[1];
        for (int i = 2; i < n; i++) {
            temp[i] = (temp[i - 1] + arr[i]);
        }

        for(int i = 0; i < n; i++) {
            sum += temp[i];
        }
        bw.write(sum + System.lineSeparator());
        bw.close();
    }
}
