package Q9426_Not;

import java.io.*;

public class Main {
   /*
       문제 : 중앙값 측정
       url : https://www.acmicpc.net/problem/9426
       재풀이 : O
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

        long sum = 0;
        int mid = (k + 1) / 2;
        for(int i = 0; i <= n - k; i++) {
            if(k % 2 == 0) {
                sum += ((arr[mid + i - 1] + arr[mid + i]) / 2);
            } else {
                sum += arr[mid + i - 1];
            }
            System.out.println(sum);
        }

        bw.write(sum + "\n");
        bw.close();
    }
}