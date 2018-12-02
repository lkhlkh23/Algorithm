package Q9243;

import java.io.*;

public class Main {
   /*
       문제 : 파일완전삭제
       url : https://www.acmicpc.net/problem/9243
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        String a = br.readLine();
        String b = br.readLine();
        if(n % 2 == 1) {
            for(int i = 0; i < a.length(); i++) {
                sb.append(a.charAt(i) == '0' ? '1' : '0');
            }
            a = sb.toString();
        }
        bw.write(a.equals(b) ? "Deletion succeeded" : "Deletion failed");
        bw.close();
    }


}