package Q10253;

import java.io.*;
import java.util.StringTokenizer;

public class Main {
    /*
       문제 : 헨리
       url : https://www.acmicpc.net/problem/10253
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            int c = 2;
            while(a * c - b != 0) {
                if(a * c >= b && a * c - b < b * c) {
                    a = a * c - b;
                    b = b * c;
                }
                c++;
            }
            sb.append(c).append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }
}
