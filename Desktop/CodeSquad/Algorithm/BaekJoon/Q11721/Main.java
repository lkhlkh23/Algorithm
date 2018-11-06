package Q11721;

import java.util.Scanner;

public class Main {
    /*
	 	문제 : 열개씩 끊어 출력하기
	 	url : https://www.acmicpc.net/problem/11721
	 	재풀이 : X
	*/
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();
        String str = new Scanner(System.in).nextLine();
        for (int i = 0; i < Math.ceil((double)str.length() / 10); i++)
            sb.append(str.substring(i * 10, i * 10 + 10 > str.length() ? str.length() : i * 10 + 10)).append("\n");

        System.out.println(sb.toString());
    }
}
