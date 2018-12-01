package Q11728;

import java.io.*;
import java.util.*;

public class Main {
    /*
	 	문제 : 배열합치
	 	url : https://www.acmicpc.net/problem/11728
	 	재풀이 : X
	*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(" ");
        int n = Integer.parseInt(input[0]);
        int m = Integer.parseInt(input[1]);
        int[] arr = new int[n + m];

        input = br.readLine().split(" ");
        for(int i = 0; i < n; i++) {
            arr[i] = Integer.parseInt(input[i]);
        }

        input = br.readLine().split(" ");
        int j = 0;
        for(int i = n; i < arr.length; i++) {
            arr[i] = Integer.parseInt(input[j++]);
        }

        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            sb.append(arr[i] + " ");
        }

        bw.write(sb.toString());
        bw.close();
    }


}


