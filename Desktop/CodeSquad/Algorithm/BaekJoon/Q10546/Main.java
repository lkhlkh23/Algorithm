package Q10546;

import java.io.*;
import java.util.*;

public class Main {
   /*
       문제 : 배부른마라토너
       url : https://www.acmicpc.net/problem/10546
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        Map<String, Integer> map = new HashMap<>();
        int n = Integer.parseInt(br.readLine());

        for(int i = 0; i < n * 2  - 1; i++) {
            String participant = br.readLine();
            map.put(participant, map.containsKey(participant) ? map.get(participant) + 1 : 1);
        }

        Iterator<String> it = map.keySet().iterator();
        while(it.hasNext()) {
            String participant = it.next();
            if(map.get(participant) % 2 == 1) {
                bw.write(participant);
            }
        }
        bw.close();
    }
}