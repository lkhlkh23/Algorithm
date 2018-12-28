package Q7567;

import java.io.*;
import java.util.*;

public class Main {
   /*
      문제 : 덩치
      url : https://www.acmicpc.net/problem/7568
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        int n = Integer.parseInt(br.readLine());
        List<Man> men = new ArrayList<>();
        for(int i = 0; i < n; i++) {
            String[] input = br.readLine().split(" ");
            men.add(new Main().new Man(Integer.parseInt(input[0]), Integer.parseInt(input[1])));
        }

        for(int i = 0; i < men.size(); i++) {
            int rank = 1;
            for(int j = 0; j < men.size(); j++) {
                rank = men.get(i).isSmaller(men.get(j)) ? rank + 1 : rank;
            }
            sb.append((rank) + " ");
        }

        bw.write(sb.toString().trim());
        bw.close();
    }

    public class Man {
        private int x;
        private int y;

        public Man(int x, int y) {
            this.x = x;
            this.y = y;
        }

        public boolean isSmaller(Man man) {
            return this.x < man.x && this.y < man.y;
        }
    }
}
