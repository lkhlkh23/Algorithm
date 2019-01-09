package Q10814;

import java.io.*;
import java.util.*;

public class Main {
   /*
      문제 : 나이순정렬
      url : https://www.acmicpc.net/problem/10814
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        List<Member> members = new ArrayList<>();
        int n = Integer.parseInt(br.readLine());
        for(int i = 0; i < n; i++)
            members.add(new Main().new Member(i, br.readLine().split(" ")));

        Collections.sort(members);

        for(Member member : members)
            bw.write(member.printMember());

        bw.close();
    }

    public class Member implements Comparable<Member>{
        private int index;
        private int age;
        private String name;

        public Member(int index, String[] input) {
            this.index = index;
            this.age = Integer.parseInt(input[0]);
            this.name = input[1];
        }

        public String printMember() {
            return String.format("%d %s\n", age, name);
        }

        @Override
        public int compareTo(Member m) {
            return this.age - m.age > 0 || (this.age == m.age && this.index - m.index > 0) ? 1 : -1;
        }
    }
}