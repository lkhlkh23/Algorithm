package Q1110;

import java.util.Scanner;

public class Main {
    /*
	 	문제 : 더하기사이클
	 	url : https://www.acmicpc.net/problem/1110
	 	재풀이 : X
	*/
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt(); //26;
        boolean flag = true;
        int cnt = 0;
        int result = n;
        do {
            result =  (result / 10 + result % 10) % 10 + 10 * (result % 10);
            cnt++;
        } while (n != result);

        System.out.println(cnt);
    }
}
