package Q2752;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    /*
	 	문제 : 세수정렬
	 	url : https://www.acmicpc.net/problem/2752
	 	재풀이 : X
	*/

    private static final String BLANK = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String[] input = br.readLine().split(BLANK);

        int[] arr = new int[3];
        for (int i = 0; i < 3; i++)
            arr[i] = Integer.parseInt(input[i]);

        Arrays.sort(arr);

        for (int i : arr)
            sb.append(i + BLANK);

        System.out.println(sb.append("\n").toString());
    }
}
