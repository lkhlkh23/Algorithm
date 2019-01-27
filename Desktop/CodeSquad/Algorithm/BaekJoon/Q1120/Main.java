package Q1120;

import java.io.*;
import java.util.*;

public class Main {
	/*
	 	문제 : 문자열
	 	url : https://www.acmicpc.net/problem/1120
	 	재풀이 : X
	*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());
        String first = st.nextToken();
        String second = st.nextToken();
        int cnt = Integer.MAX_VALUE;
        for (int i = 0; i <= second.length() - first.length(); i++)
            cnt = Math.min(match(first.toCharArray(), second.substring(i, first.length() + i).toCharArray()), cnt);

        bw.write(cnt + System.lineSeparator());
        bw.close();
    }

    public static int match(char[] first, char[] second) {
        int cnt = 0;
        for (int i = 0; i < first.length; i++)
            if(first[i] != second[i])
                cnt++;

        return cnt;
    }
}
