package Q1764;

import java.io.*;
import java.util.*;

public class Main {
   /*
       문제 : 듣보잡
       url : https://www.acmicpc.net/problem/1764
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] nm = br.readLine().split(" ");
        Map<String, Integer> sound = new TreeMap<>();
        for(int i = 0; i < Integer.parseInt(nm[0]); i++) {
            sound.put(br.readLine(), 1);
        }

        for(int i = 0; i < Integer.parseInt(nm[1]); i++) {
            String name = br.readLine();
            sound.put(name, sound.containsKey(name) ? sound.get(name) + 1 : 1);
        }

        Iterator<String> it = sound.keySet().iterator();
        int cnt = 0;
        while(it.hasNext()) {
            String key = it.next();
            if(sound.get(key) > 1) {
                sb.append(key).append("\n");
                cnt++;
            }
        }
        bw.write(cnt + "\n");
        bw.write(sb.toString().trim());
        bw.close();
    }

}