package Q16462;

import java.io.*;
import java.util.*;

public class Main {
    /*
	 	문제 : 문자열 분석
	 	url : https://www.acmicpc.net/problem/16462
	 	재풀이 : X
	*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 0; i < n ; i++) {
            char[] arr = br.readLine().toCharArray();
            for (int j = 0; j < arr.length; j++) {
                arr[j] = arr[j] == '0' || arr[j] == '6' ? '9' : arr[j];
            }
            sum += (arr.length > 2 ? 100 :
                    arr.length > 1 ? (arr[0] - '0') * 10 + (arr[1] - '0') : (arr[0] - '0'));
        }

        bw.write(Math.round((double)sum / n) + "\n");
        bw.close();
    }


}


