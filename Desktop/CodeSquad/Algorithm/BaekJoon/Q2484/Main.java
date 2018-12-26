package Q2484;

import java.io.*;
import java.util.*;

public class Main {
	/*
 		문제 : 주사위 네개
 		url : https://www.acmicpc.net/problem/2484
 		재풀이 : X
	 */

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        int price = 0;
        for(int i = 0; i < n; i++) {
            Map<Integer, Integer> dice = new HashMap<>();
            int sum = 0;
            String[] input = br.readLine().split(" ");
            for(int j = 0; j < input.length; j++) {
                int num = Integer.parseInt(input[j]);
                dice.put(num, dice.containsKey(num) ? dice.get(num) + 1 : 1);
            }
            List<Integer> keySet = new ArrayList<>(dice.keySet());
            Collections.sort(keySet, ((o1, o2) -> dice.get(o2) - dice.get(o1)));
            Iterator<Integer> it = keySet.iterator();
            if(dice.size() == 1) {
                sum = (it.next() * 5000 + 50000);
            } else if(dice.containsValue(3)) {
                sum = (10000 +1000 * it.next());
            } else if(dice.containsValue(2) && dice.size() == 2) {
                sum = (it.next() * 500 + it.next() * 500 + 2000);
            } else if(dice.containsValue(2) && dice.size() == 3) {
                sum = 1000 + it.next() * 100;
            } else  {
                int max = 0;
                while(it.hasNext()) {
                    max = Math.max(max, it.next());
                }
                sum = (max * 100);
            }
            price = Math.max(price, sum);
        }

        bw.write(price + "\n");
        bw.close();
    }


}
