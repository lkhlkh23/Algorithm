package Q5598;

import java.io.*;
import java.util.*;

public class Main {
	/*
 		문제 : 성정통계
 		url : https://www.acmicpc.net/problem/5800
 		재풀이 : X
	 */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        Character[] codes = {
                'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P',
                'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C'
        };
        List<Character> alpha = new ArrayList<>(Arrays.asList(codes));

        char[] input = br.readLine().toCharArray();
        for(int i = 0; i < input.length; i++) {
            sb.append((char)('A' + alpha.indexOf(input[i])));
        }

        bw.write(sb.toString());
        bw.close();
    }

}
