package Q2935;

import java.io.*;
import java.util.Scanner;

public class Main {
	/*
	 	문제 : 소음
	 	url : https://www.acmicpc.net/problem/2935
	 	재풀이 : O
	*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        String a = br.readLine();
        char op = br.readLine().charAt(0);
        String b = br.readLine();

        if(a.length() < b.length())
            swap(a, b);

        sb.append(a);
        if(op == '*')
            for (int i = 0; i < b.length() - 1; i++)
                sb.append("0");
        else
            if(a.length() == b.length())
                sb.setCharAt(0, '2');
            else
                sb.setCharAt(a.length() - b.length(), '1');

        System.out.println(sb.toString());
    }

    public static void swap(String a, String b) {
        String temp = a;
        a = b;
        b = temp;
    }
}
