package Q10451;

import java.io.*;
import java.util.Stack;

public class Main {
    /*
	 	문제 : 순열사이클
	 	url : https://www.acmicpc.net/problem/10451
	 	재풀이 : X
	*/
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int t = Integer.parseInt(br.readLine());
        for (int i = 0; i < t; i++) {
            // 1. 입력 초기화 //
            int n = Integer.parseInt(br.readLine());
            String[] input = br.readLine().split(" ");
            int[][] pair = new int[input.length][2];
            for (int j = 0; j < input.length; j++) {
                pair[j][0] = j + 1;
                pair[j][1] = Integer.parseInt(input[j]);
            }

            // 2. DFS //
            boolean[] visited = new boolean[pair.length + 1];


            int cnt = 0;
            for (int k = 1; k < visited.length; k++) {
                if(visited[k] == true) {
                    continue;
                }
                Stack<Integer> stack = new Stack<>();
                stack.add(pair[k - 1][0]);
                stack.add(pair[k - 1][1]);
                visited[pair[k - 1][0]] = visited[pair[k - 1][1]] = true;

                while(!stack.isEmpty()) {
                    int extract = stack.pop();
                    for(int j = 0; j < pair.length; j++) {
                        if(pair[j][0] == extract && visited[pair[j][1]] == false) {
                            visited[pair[j][1]] = true;
                            stack.add(pair[j][1]);
                        } else if(pair[j][1] == extract && visited[pair[j][0]] == false) {
                            visited[pair[j][0]] = true;
                            stack.add(pair[j][0]);
                        }
                    }
                }
                cnt++;
            }

            System.out.println(cnt);


        }
    }
}
