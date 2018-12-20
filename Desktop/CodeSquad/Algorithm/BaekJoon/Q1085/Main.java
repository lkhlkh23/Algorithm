package Q1085;

import java.io.*;
import java.math.BigInteger;
import java.util.*;

public class Main {
	/*
	 	문제 : 직사각형 탈출
	 	url : https://www.acmicpc.net/problem/1085
	 	재풀이 : O
	*/

    public static void main(String[] args) throws IOException {
        String[] input = new BufferedReader(new InputStreamReader(System.in)).readLine().split(" ");
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        bw.write(getResult(Integer.parseInt(input[0]), Integer.parseInt(input[1])
                ,Integer.parseInt(input[2]), Integer.parseInt(input[3])) + System.lineSeparator());
        bw.close();
    }

    public static int getResult(int x, int y, int w, int h) {
        return Math.min(h - y, Math.min(y, Math.min(x, w - x)));
    }
}
