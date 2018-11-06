package Q11720;

import java.util.Scanner;

public class Main {
    /*
	 	문제 : 숫자의합
	 	url : https://www.acmicpc.net/problem/11720
	 	재풀이 : X
	*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        char[] arr = sc.next().toCharArray();
        int sum = 0;
        for(char c : arr)
            sum += ((int)(c - '0'));

        System.out.println(sum);
    }
}
