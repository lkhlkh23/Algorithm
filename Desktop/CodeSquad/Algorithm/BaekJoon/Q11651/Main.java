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
       public String toString() {
           return "Pair{" +
                   "x=" + x +
                   ", y=" + y +
                   '}';
       }

       @Override
       public int compareTo(Pair o) {
           return this.x - o.x;
       }
   }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringBuilder sb = new StringBuilder();

        List<Pair> list = new ArrayList<Pair>();
        int n = Integer.parseInt(br.readLine());
        for (int i = 0; i < n; i++) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            list.add(new Main().new Pair(Integer.parseInt(st.nextToken())
                    , Integer.parseInt(st.nextToken())));
        }

        Collections.sort(list, new Comparator<Pair>() {
            @Override
            public int compare(Pair o1, Pair o2) {
                return o1.y - o2.y;
            }
        });

        Set<Pair> set = new TreeSet<>();
        for(Pair pair : list) {
            set.add(pair);
        }

        for(Pair pair : set) {
            sb.append(pair.x).append(" ").append(pair.y).append("\n");
        }

        bw.write(sb.toString());
        bw.close();
    }

}