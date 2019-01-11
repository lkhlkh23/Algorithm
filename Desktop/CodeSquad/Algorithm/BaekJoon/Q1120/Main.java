package Q1120;

import java.io.*;
import java.util.*;

public class Main {
   /*
      문제 : 문자열
      url : https://www.acmicpc.net/problem/1120
      재풀이 : X
   */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int cnt = 0;
        int n = Integer.parseInt(br.readLine());
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < n; i++) {
            String reduction = solve(br.readLine());
            if(reduction.equals("")) {
                map.put(0, map.containsKey(0) ? map.get(0) + 1 : 1);
                continue;
            }

            if(reduction.charAt(0) == ')' && reduction.charAt(reduction.length() - 1) == '(') {
                continue;
            }

            int sum = 0;
            char[] c = reduction.toCharArray();
            for (int j = 0; j < reduction.length(); j++) {
                sum += (c[j] == '(' ? 1 : - 1);
            }
            map.put(sum, map.containsKey(sum) ? map.get(sum) + 1 : 1);
        }

        Iterator<Integer> it = map.keySet().iterator();
        while(it.hasNext()) {
            int key = it.next();
            if(key == 0) {
                cnt += (map.get(key) / 2);
            } else if(key > 0 && map.containsKey(key * -1)) {
                cnt += Math.min(map.get(key), map.get(key * -1));
            }
        }
        bw.write(cnt + "\n");
        bw.close();
    }

    public static String solve(String input) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < input.length(); i++) {
            if(!stack.isEmpty() && stack.peek() == '(' && input.charAt(i) == ')') {
                stack.pop();
            } else {
                stack.add(input.charAt(i));
            }
        }
        StringBuilder sb = new StringBuilder();
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}