package Q1547;


import java.io.*;
import java.util.*;

public class Main {
   /*
       문제 : 공
       url : https://www.acmicpc.net/problem/1547
       재풀이 : X
    */

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<String> list = new ArrayList<>();
        list.add("1"); list.add("2"); list.add("3");
        for(int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            int first = list.indexOf(input[0]);
            int second = list.indexOf(input[1]);
            list.set(first, input[1]);
            list.set(second, input[0]);
            System.out.println(list.toString());
        }

        bw.write(list.get(0) + "\n");
        bw.close();
    }

}