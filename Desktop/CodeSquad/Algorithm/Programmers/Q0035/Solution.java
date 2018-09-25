package Q0035;

import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        /* 직사각형 별찍기
         *    url : https://programmers.co.kr/learn/courses/30/lessons/12969?language=java */
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                sb.append("*");
            }
            sb.append("\n");
        }
        System.out.println(sb.toString());
    }
}
