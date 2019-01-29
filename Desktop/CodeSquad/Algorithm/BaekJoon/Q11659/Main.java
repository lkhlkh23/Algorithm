package Q11659;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

public class Main {
	/*
	 	문제 : 구간 합 구하기4
	 	url : https://www.acmicpc.net/problem/11659
	 	재풀이 : X
	*/

	private static final String BLANK = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(BLANK);
        String[] numbers = br.readLine().split(BLANK);

        int[] arr = new int[numbers.length + 1];
        for (int i = 1; i < arr.length; i++)
            arr[i] = arr[i - 1] + Integer.parseInt(numbers[i - 1]);


        for (int i = 0; i < Integer.parseInt(input[1]); i++) {
            String[] cmd = br.readLine().split(BLANK);
            sb.append(arr[Integer.parseInt(cmd[1])] - arr[Integer.parseInt(cmd[0]) - 1])
                    .append(System.lineSeparator());
        }

        bw.write(sb.toString());
        bw.close();
    }
}
