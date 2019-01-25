package Q10757;

import java.io.*;

public class Main {

   /*
      문제 : 큰수 A + B
      url : https://www.acmicpc.net/problem/10757
      재풀이 : X
    */

    private static final String BLANK = " ";

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        String[] input = br.readLine().split(BLANK);
        int rest = 0;
        input[0] = new StringBuilder(input[0]).reverse().toString();
        input[1] = new StringBuilder(input[1]).reverse().toString();
        for(int i = 0; i <  Math.max(input[0].length(), input[1].length()); i++) {
            int sum = (i < input[0].length() ? input[0].charAt(i) - '0' : 0)
                    + (i < input[1].length() ? input[1].charAt(i) - '0' : 0) + rest;
            sb.append(sum >= 10 ? (sum - 10) : sum);
            rest = sum >= 10 ? 1 : 0;
        }

        if(rest > 0) sb.append(rest);


        bw.write(sb.reverse().toString() + "\n");
        bw.close();
    }
}