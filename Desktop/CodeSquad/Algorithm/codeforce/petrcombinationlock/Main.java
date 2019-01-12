package codeforce.petrcombinationlock;

import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        System.out.println(0 % 360);
        int n = Integer.parseInt(br.readLine());
        int[] degree = new int[n];
        for(int i = 0; i < degree.length; i++)
            degree[i] = Integer.parseInt(br.readLine());

        bw.write(solve(degree, 0, 0) ? "YES" : "NO");
        bw.close();
    }

    public static boolean solve(int[] degree, int index, int sum) {
        if(degree.length == index) {
            return sum % 360 == 0 ? true : false;
        } else {
            return solve(degree, index + 1, sum + degree[index])
                    || solve(degree, index + 1, sum - degree[index]);
        }
    }


}
