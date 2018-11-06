package Q10989;

import java.util.*;

public class Main {
    /*
	 	문제 : 수 정렬하기 3
	 	url : https://www.acmicpc.net/problem/10989
	 	재풀이 : O
	*/
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        TreeMap<Integer, Integer> tm = new TreeMap<>();
        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            tm.put(num, tm.containsKey(num) ? tm.get(num) + 1 : 1);
        }

        Iterator<Integer> it = tm.keySet().iterator();
        StringBuilder sb = new StringBuilder();
        while(it.hasNext()) {
            int key = it.next();
            int value = tm.get(key);
            for (int i = 0; i < value; i++) {
                sb.append(key).append("\n");
            }
        }
        System.out.println(sb.toString());
    }
}
