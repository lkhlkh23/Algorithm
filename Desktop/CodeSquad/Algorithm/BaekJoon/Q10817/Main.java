package Q10817;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    /*
	 	문제 : 세수
	 	url : https://www.acmicpc.net/problem/10817
	 	재풀이 : X
	*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {sc.nextInt(), sc.nextInt(), sc.nextInt()};
        Arrays.sort(arr);
        System.out.println(arr[1]);
    }
}
