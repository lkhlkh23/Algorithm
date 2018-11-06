package Q9498;

import java.util.Scanner;

public class Main {
    /*
	 	문제 : 시험성적
	 	url : https://www.acmicpc.net/problem/9498
	 	재풀이 : X
	*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        if(n >= 90) {
            System.out.println("A");
        } else if (n >= 80) {
            System.out.println("B");
        } else if (n >= 70) {
            System.out.println("C");
        } else if (n >= 60){
            System.out.println("D");
        } else {
            System.out.println("F");
        }
    }
}
