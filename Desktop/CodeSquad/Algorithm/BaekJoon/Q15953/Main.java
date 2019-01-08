package Q15953;

import java.io.*;
import java.util.*;

public class Main {
   /*
      문제 : 상금헌터
      url : https://www.acmicpc.net/problem/15953
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Integer> lastYear = new TreeMap<>();
        lastYear.put(1, 5000000);
        lastYear.put(3, 3000000);
        lastYear.put(6, 2000000);
        lastYear.put(10, 500000);
        lastYear.put(15, 300000);
        lastYear.put(21, 100000);
        Map<Integer, Integer> thisYear = new TreeMap<>();
        thisYear.put(1, 5120000);
        thisYear.put(3, 2560000);
        thisYear.put(7, 1280000);
        thisYear.put(15, 640000);
        thisYear.put(31, 320000);

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            String[] input = br.readLine().split(" ");
            bw.write((getResult(lastYear, Integer.parseInt(input[0])) + getResult(thisYear, Integer.parseInt(input[1]))) + "\n");
        }

        bw.close();
    }

    public static int getResult(Map<Integer, Integer> map, int rank) {
        if(rank == 0) return 0;
        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()) {
            int key = it.next();
            if(key >= rank) {
                return map.get(key);
            }
        }
        return 0;
    }
}