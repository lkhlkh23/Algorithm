package Q1032;

import java.io.*;
import java.util.*;

public class Main {
   /*
      문제 : 명령프롬프트
      url : https://www.acmicpc.net/problem/1032
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());
        List<String> cmd = new ArrayList<>();
        for(int i = 0; i < n; i++)
            cmd.add(br.readLine());

        bw.write(getResult(cmd, cmd.get(0)));
        bw.close();
    }

    public static String getResult(List<String> cmd, String standard) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < standard.length(); i++) {
            boolean flag = true;
            char c = standard.charAt(i);
            for(int j = 0; j < cmd.size() && flag; j++) {
                if(cmd.get(j).charAt(i) != c) {
                    flag = false;
                }
            }
            sb.append(flag ? c : "?");
        }
        return sb.toString();
    }
}
