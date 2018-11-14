package Q10813;

import java.io.*;
import java.util.*;

public class Main {
   /*
       문제 : 공바꾸기
       url : https://www.acmicpc.net/problem/10813
       재풀이 : X
    */

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        String[] mn = br.readLine().split(" ");
        int n = Integer.parseInt(mn[0]);
        int m = Integer.parseInt(mn[1]);

        List<Integer> list = new LinkedList<>();
        for(int i = 0; i <= n; i++) {
            list.add(i);
        }

        for(int i = 0; i < m; i++) {
            String[] swapInput = br.readLine().split(" ");
            int first = Integer.parseInt(swapInput[0]);
            int firstIndex = list.indexOf(first);
            int second = Integer.parseInt(swapInput[1]);
            int secondIndex = list.indexOf(second);
            list.set(firstIndex, second);
            list.set(secondIndex, first);
        }

        for(int i = 1; i < list.size(); i++) {
            sb.append(list.indexOf(i)).append(" ");
        }

        bw.write(sb.append("\n").toString());
        bw.close();
    }

}