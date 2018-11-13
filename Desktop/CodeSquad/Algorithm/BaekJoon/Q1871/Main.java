package Q1871;

import java.io.*;

public class Main {
   /*
       문제 : 좋은 자동차 번호판
       url : https://www.acmicpc.net/problem/1871
       재풀이 : X
    */

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            String[] input =br.readLine().split("-");
            int text = 0;
            for(int j = 0; j < input[0].length(); j++) {
                text += (Math.pow(26, 2 - j) * (input[0].charAt(j) - 'A'));
            }
            if(Math.abs(Integer.parseInt(input[1]) - text) <=100) {
                bw.write("nice\n");
            } else {
                bw.write("not nice\n");
            }
        }
        bw.close();
    }

}
