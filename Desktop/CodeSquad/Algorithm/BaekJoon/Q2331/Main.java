package Q2331;

import java.io.*;
import java.util.*;

public class Main {
   /*
       문제 : 반복수열
       url : https://www.acmicpc.net/problem/2331
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        List<Integer> list = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        list.add(sc.nextInt());
        int p = sc.nextInt();

        while(true) {
            char[] num = (list.get(list.size() - 1) + "").toCharArray();
            int sum = 0;
            for(int i = 0; i < num.length; i++)
                sum += Math.pow(num[i] - '0', p);

            if(list.contains(sum)) {
                System.out.println(list.indexOf(sum));
                break;
            }

            list.add(sum);
        }
    }
}