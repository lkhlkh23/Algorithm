package Q2839;

import java.util.Scanner;

public class Main {
    /*
	 	문제 : 설탕배달
	 	url : https://www.acmicpc.net/problem/2839
	 	재풀이 : O
	*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int total = sc.nextInt();
        int min = 5000 + 1;
        for (int i = 0; i <= total / 3; i++) {
            for (int j = 0; j <= total / 5; j++) {
                if(3 * i + 5 * j == total) {
                    min = Math.min(min, i + j);
                }
            }
        }
        System.out.println(min == 5001 ? -1 : min);
        System.out.println(solution(total));
    }

    public static int solution(int total) {
        int f = total / 5;
        while(f >= 0) {
            if((total - 5 * f) % 3 == 0) {
                return (total - 5 * f) / 3 + f;
            }
            f--;
        }
        return -1;
    }
}
