package Q4631;

import java.io.*;

public class Main {
   /*
       문제 : 대칭정렬
       url : https://www.acmicpc.net/problem/4631
       재풀이 : X
    */

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        String input = "";
        int set = 1;
        while(!(input = br.readLine()).equals("0")) {
            String[] arr = new String[Integer.parseInt(input)];
            int index = 0;
            boolean flag = true;
            for (int i = 0; i < arr.length; i++) {
                if(flag) arr[index] = br.readLine();
                else arr[arr.length - 1 - index++] = br.readLine();
                flag = !flag;
            }

            sb.append(String.format("SET %d\n", + set++));
            for (int i = 0; i < arr.length; i++)
                sb.append(arr[i] + "\n");
        }

        bw.write(sb.toString());
        bw.close();
    }

}