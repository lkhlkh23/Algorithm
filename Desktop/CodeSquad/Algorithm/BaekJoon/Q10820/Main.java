package Q10820;

import java.io.*;
import java.util.*;

public class Main {
    /*
	 	문제 : 문자열 분석
	 	url : https://www.acmicpc.net/problem/10820
	 	재풀이 : X
	*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String s = null;
        while((s = br.readLine()) != null) {
            char[] input = s.toCharArray();
            int[] arr = new int[4];

            for (int i = 0; i < input.length; i++) {
                if (input[i] >= 'a' && input[i] <= 'z') {
                    arr[0]++;
                } else if (input[i] >= 'A' && input[i] <= 'Z') {
                    arr[1]++;
                } else if (input[i] >= '0' && input[i] <= '9') {
                    arr[2]++;
                } else if (input[i] == ' ') {
                    arr[3]++;
                }
            }
            sb.append(String.format("%d %d %d %d\n", arr[0], arr[1], arr[2], arr[3]));
        }

        bw.write(sb.toString());
        bw.close();
    }


}


