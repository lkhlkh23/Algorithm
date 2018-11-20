package Q9251;

import java.io.*;

public class Main {
   /*
       문제 : 피보나치 비스무리한 수열
       url : https://www.acmicpc.net/problem/14495
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String first = br.readLine();
        String second = br.readLine();
        int index = 0;
        int max = 0;
        while(index < first.length()) {
            int firstIndex = index;
            int secondIndex = 0;
            int answer = 0;
            while (secondIndex < second.length() && firstIndex < first.length()) {
                String s = String.valueOf(first.charAt(firstIndex));
                if (second.indexOf(s, secondIndex) > -1) {
                    answer++;
                    secondIndex = second.indexOf(s, secondIndex) + 1;
                    System.out.println("Print : " + s);
                } else {
                    System.out.println("Not Print : " + s);
                }
                firstIndex++;
            }
            System.out.println("********");
            index++;
            max = Math.max(max, answer);
        }
        bw.write(max + "\n");
        bw.close();
    }
// 예외 DFA, FAD
}