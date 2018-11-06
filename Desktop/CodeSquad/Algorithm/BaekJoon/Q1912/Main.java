package Q1912;

import java.io.*;
import java.util.*;

public class Main {
    /*
	 	문제 : 연속합
	 	url : https://www.acmicpc.net/problem/1912
	 	재풀이 : O
	*/

    public static void main(String[] args) throws IOException {
        /* 모든 경우의 수 : 시간초과 */
      /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];
      StringTokenizer st = new StringTokenizer(br.readLine());
      int index = 0;
      while(st.hasMoreTokens())
         arr[index++] = Integer.parseInt(st.nextToken());

      int sum = 0;
      int max = 0;
      // 1개, 2개, 3개 ... n개 고른다!
      for(int i = 1; i <= arr.length; i++) {
         //0번 인덱스부터 인접한 i개씩 고른다!
         for(int j = 0; j < arr.length - i + 1; j++) {
            sum = 0;
            for(int k = j; k < j + i; k++) {
               sum += arr[k];
            }
            max = max > sum ? max : sum;
         }
      }

      bw.write(max + "\n");
      bw.close();
      br.close();
      */

      /* 시간복잡도 n^2 시간초과! */
      /*BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];
      StringTokenizer st = new StringTokenizer(br.readLine());
      int index = 0;
      while(st.hasMoreTokens())
          arr[index++] = Integer.parseInt(st.nextToken());


      int[] result = new int[arr.length];
      int max = 0;
      for(int i = 0; i < arr.length - 1; i++) {
          for(int j = i; j < arr.length; j++) {
              result[i] = result[i] + arr[j];
              max = Math.max(result[i], max);
          }
      }
      bw.write(max + "\n");
      bw.close();
      br.close();*/

      /* 카데인 알고리즘 */
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

      int n = Integer.parseInt(br.readLine());
      int[] arr = new int[n];
      StringTokenizer st = new StringTokenizer(br.readLine());
      int index = 0;
      while(st.hasMoreTokens())
          arr[index++] = Integer.parseInt(st.nextToken());

      int[] result = new int[arr.length];
      result[0] = arr[0];
      for(int i = 1; i < arr.length; i++)
          result[i] = Math.max(result[i - 1] + arr[i], arr[i]);

      int max = result[0];
      for(int i = 1; i < result.length; i++)
          max = Math.max(max, result[i]);

      bw.write(max + "\n");
      bw.close();
      br.close();
    }
}

