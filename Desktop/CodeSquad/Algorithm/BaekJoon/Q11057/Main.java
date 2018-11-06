package Q11057;

import java.util.Scanner;

public class Main {
    /*
	 	문제 : 오르막수
	 	url : https://www.acmicpc.net/problem/11057
	 	재풀이 : O
	*/
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        /* D(n)(0~9) = D(n-1)(0) + 2*D(n-1)(1) + 3*D(n-1)(2) … + 9*D(n-1)(8) + 10*D(n-1)(9) */
        /* D(n)(0) = D(n-1)(0~9) = D(n-1)(0~9)
           D(n)(1) = D(n-1)(0~9) - D(n-1)(0) = D(n-1)(1~9)
           D(n)(2) = D(n-1)(0~9) - (D(n-1)(0) + D(n-1)(1)) = D(n-1)(2~9)
           D(n)(x) = D(n-1)(x~9)
        */


        System.out.println(getResultBy2Maxtrix(n));
    }

    public static int getResultBy1Maxtrix(int n) {
        int[] prev = new int[10];
        int[] now = new int[10];

        for (int i = 0; i < 10; i++) {
            prev[i] = 1;
            now[i] = 1;
        }

        for (int i = 1; i < n; i++) {
            for (int j = 0; j < 10; j++) {
                now[j] = 0;
            }

            for (int j = 0; j < 10; j++) {
                for (int k = j; k < 10; k++) {
                    now[j] = (prev[k] % 10007 + now[j] % 10007) % 10007;
                }
            }

            for (int j = 0; j < 10; j++) {
                prev[j] = now[j];
            }
        }

        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = (now[i] % 10007 + sum % 10007) % 10007;
        }

        return sum;
    }

    public static int getResultBy2Maxtrix(int n) {
        int[][] arr = new int[n][10];

        for(int i = 0; i < arr[0].length; i++) {
            arr[0][i] = 1;
        }

        for(int i = 1; i < arr.length; i++) {
            for(int j = 0; j < arr[0].length; j++) {
                arr[i][0] = (arr[i][0] % 10007 + arr[i - 1][j] % 10007) % 10007;
            }
            for(int j = 1; j < arr[i].length; j++) {
                arr[i][j] = (arr[i][j - 1] % 10007 - arr[i - 1][j - 1] % 10007) % 10007;
            }
        }
        int sum = 0;
        for (int i = 0; i < 10; i++) {
            sum = (arr[n - 1][i] % 10007 + sum % 10007) % 10007;
        }

        return sum;
    }
}
