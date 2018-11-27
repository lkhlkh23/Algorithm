package Q11651;

import java.io.*;
import java.util.*;

public class Main {
   /*
       문제 : 좌표정렬하기-2
       url : https://www.acmicpc.net/problem/11651
       재풀이 : X
    */

   public class Pair implements Comparable<Pair> {

       private int x;
       private int y;

       public Pair(int x, int y) {
           this.x = x;
           this.y = y;
       }

       @Override
       public int compareTo(Pair o) {
           if(this.y > o.y) {
               return 1;
           } else if(this.y == o.y && this.x > o.x) {
               return 1;
           } else if(this.y == o.y && this.x < o.x) {
               return -1;
           }  else if(this.y < o.y) {
               return -1;
           }
           return 0;
       }
   }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        List<Pair> list = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(new Main().new Pair(Integer.parseInt(st.nextToken())
                    , Integer.parseInt(st.nextToken())));
        }

        Collections.sort(list);

        for(Pair pair : list) {
            sb.append(pair.x).append(" ").append(pair.y).append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }

}