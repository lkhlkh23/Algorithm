package Q10844;

import java.util.Scanner;

public class Main {
    /*
	 	문제 : 쉬운계단수
	 	url : https://www.acmicpc.net/problem/10844
	 	재풀이 : O
	*/
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int[][] arr = new int[n + 1][10];

        for (int i = 0; i < arr[0].length; i++) {
            arr[1][i] = 1;
        }

        /*
            x == 1 -> D(n)(x) = D(n-1)(x+1)
            1<x<9 -> D(n)(x) = D(n-1)(x-1) + D(n-1)(x+1)
            x == 9 -> D(n-1)(x-1)
        */
        int sum = 0;
        for(int i = 2; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if(j == 0) {
                    arr[i][j] = arr[i - 1][j + 1] % 1_000_000_000;
                } else if(j == 9) {
                    arr[i][j] = arr[i - 1][j - 1] % 1_000_000_000;
                } else {
                    arr[i][j] = (arr[i - 1][j - 1] % 1_000_000_000 + arr[i - 1][j + 1] % 1_000_000_000) % 1_000_000_000;
                }
            }
        }

        for (int j = 1; j < 10; j++) {
            sum = (arr[n][j] % 1_000_000_000 + sum % 1_000_000_000) % 1_000_000_000;
        }

        System.out.println(sum);
    }
}
