package Q5052;

import java.io.*;
import java.util.Arrays;

public class Main {
    /*
	 	문제 : 전화번호목록
	 	url : https://www.acmicpc.net/problem/5052
	 	재풀이 : X
	*/

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int t = Integer.parseInt(br.readLine());
        for(int i = 0; i < t; i++) {
            String[] arr = new String[Integer.parseInt(br.readLine())];
            for(int j = 0; j < arr.length; j++)
                arr[j] = br.readLine().replace(" ", "");

            sb.append(getResult(arr) ? "NO" : "YES").append(System.lineSeparator());
        }
        bw.write(sb.toString());
        bw.close();
    }

    public static boolean getResult(String[] arr) {
        Arrays.sort(arr);
        for(int i = 0; i < arr.length - 1; i++)
            if(arr[i + 1].startsWith(arr[i])) return true;

        return false;
    }
}