package Q4504;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    /*
	 	문제 : 배수 찾기
	 	url : https://www.acmicpc.net/problem/4504
	 	재풀이 : X
	*/

    private static final String RIGHT_ANSWER = " is a multiple of ";
    private static final String WRONG_ANSWER = " is NOT a multiple of ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        int num = 0;
        while((num = Integer.parseInt(br.readLine())) != 0)
            sb.append(num).append(num % n == 0 ? RIGHT_ANSWER : WRONG_ANSWER).append(n).append(".").append(System.lineSeparator());

        System.out.println(sb.toString());
    }
}
