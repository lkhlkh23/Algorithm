package Q2003;

import java.io.*;

public class Main {
   /*
      문제 : 수들의합
      url : https://www.acmicpc.net/problem/2003
      재풀이 : X
   */

    public static final String BLANK = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String[] first = br.readLine().split(BLANK);
        int standard = Integer.parseInt(first[1]);

        int[] arr = new int[Integer.parseInt(first[0])];
        String[] second = br.readLine().split(BLANK);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = Integer.parseInt(second[i]);
        }

        bw.write(getResult(arr, standard) + "\n");
        bw.close();
    }

    /* 브루트포스 시간초과!  */
    public static int getResult(int[] arr, int standard) {
        int cnt = 0;
        for (int i = 0; i < arr.length; i++) {
            int sum = 0;
            for (int j = i; j < arr.length; j++) {
                sum += arr[j];
                if(sum == standard) {
                    cnt++;
                    break;
                }
                if(sum > standard) {
                    break;
                }
            }
        }
        return cnt;
    }
}