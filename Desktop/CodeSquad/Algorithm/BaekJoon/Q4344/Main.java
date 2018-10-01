package Q4344;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int c = Integer.parseInt(br.readLine());

        for (int i = 0; i < c; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int sum = 0;
            int n = Integer.parseInt(st.nextToken());
            List<Integer> list = new ArrayList<>();

            for (int j = 0; j < n; j++) {
                list.add(Integer.parseInt(st.nextToken()));
                sum += list.get(list.size() - 1);
            }

            double average = (double)sum / n;
            int cnt = 0;
            for (int j = 0; j < n; j++)
                if(list.get(j) > average) cnt++;

                
            System.out.printf("%.3f%% \n", (double)cnt / n * 100);
            System.out.println(String.format("%.3f%%",(double)cnt / n * 100));
        }
    }
}
