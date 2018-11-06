package Q11052;

import java.io.*;

public class Main {
    /*
	 	문제 : 카드구매하기
	 	url : https://www.acmicpc.net/problem/11052
	 	재풀이 : O
	*/

    public static void main(String[] args) throws NumberFormatException, IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[n + 1];
        int index = 1;
        for(String str : br.readLine().split(" ")) {
            arr[index++] = Integer.parseInt(str);
        }

        int[] result = new int[arr.length];
        result[1] = arr[1];
        for(int i = 2; i < result.length; i++) {
            int max = 0;
            for(int j = 1; j < i; j++) {
                max = Math.max(max, result[j] + result[i - j]);
            }
            result[i] = Math.max(max, arr[i]);
        }

        bw.write(result[n] + "\n");
        bw.close();

    }

}