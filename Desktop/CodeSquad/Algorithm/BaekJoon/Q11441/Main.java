package Q11441;

import java.io.*;
import java.util.*;

public class Main {
    /*
	 	문제 : 합구하기
	 	url : https://www.acmicpc.net/problem/11441
	 	재풀이 : X
	*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        String[] input = br.readLine().split(" ");
        int[] arr = new int[n + 2];
        for(int i = 1; i < arr.length - 1; i++) {
            arr[i] = arr[i - 1] + Integer.parseInt(input[i - 1]);
        }
        arr[n + 1] = arr[n];

        int m = Integer.parseInt(br.readLine());
        for(int i = 0; i < m; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append(-arr[Integer.parseInt(st.nextToken()) - 1] + arr[Integer.parseInt(st.nextToken())] + "\n");
        }

        bw.write(sb.toString());
        bw.close();
    }


}

