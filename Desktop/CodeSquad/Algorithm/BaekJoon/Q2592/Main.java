package Q2592;

import java.io.*;
import java.util.*;

public class Main {
   /*
       문제 : 대표값
       url : https://www.acmicpc.net/problem/2592
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<Integer, Integer> map = new HashMap<>();
        int sum = 0;
        for(int i = 0; i < 10; i++) {
            int n = Integer.parseInt(br.readLine());
            map.put(n, map.containsKey(n) ? map.get(n) + 1 : 1);
            sum += n;
        }

        Iterator<Integer> it = map.keySet().iterator();
        int frequency = 0;
        int mode = 0;
        while(it.hasNext()) {
            int key = it.next();
            int value = map.get(key);
            if(frequency < value) {
                frequency = value;
                mode = key;
            }
        }

        bw.write((sum / 10) + "\n");
        bw.write(mode + "\n");
        bw.close();
    }


}