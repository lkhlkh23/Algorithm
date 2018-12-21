package Q1371;

import java.io.*;
import java.util.Scanner;

public class Main {
	/*
	 	문제 : 가장많은글자
	 	url : https://www.acmicpc.net/problem/1371
	 	재풀이 : O
	*/

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        StringBuilder sb = new StringBuilder();
        char[] arr = new char[26];
        int max = 0;
        while(sc.hasNextLine()) {
            char[] input = sc.nextLine().toCharArray();
            for (int i = 0; i < input.length; i++)
                if (input[i] != ' ')
                    max = Math.max(max, ++arr[input[i] - 'a']);
        }

        for (int i = 0; i < arr.length; i++)
            if(arr[i] == max) sb.append((char)('a' + i));

        sb.append(System.lineSeparator());
        System.out.println(sb.toString());
    }
}
