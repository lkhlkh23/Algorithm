package Q43163;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    /*
	 	문제 : 단어변환
	 	url : https://programmers.co.kr/learn/courses/30/lessons/43163
	 	재풀이 : X
	*/

    public static int solution(String begin, String target, String[] words) {
        boolean[] visited = new boolean[words.length];
        List<Integer> result = new ArrayList<>();
        dfs(begin, target, words, visited, 0, result);
        Collections.sort(result);
        return result.size() == 0 ? 0 : result.get(0);
    }

    public static void dfs(String begin, String target, String[] words, boolean[] visited, int total, List<Integer> result) {
        if(begin.equals(target)) {
            result.add(total);
        } else {
            boolean[] visit = new boolean[words.length];
            System.arraycopy(visited, 0, visit, 0, visit.length);
            for (int i = 0; i < words.length; i++) {
                if(!visit[i] && match(words[i].toCharArray(), begin.toCharArray())) {
                    visit[i] = true;
                    dfs(words[i], target, words, visit, total + 1, result);
                }
            }
        }
    }

    public static boolean match(char[] word, char[] target) {
        int hit = 0;
        for (int i = 0; i < word.length; i++) {
            hit = word[i] == target[i] ? hit + 1 : hit;
        }
        return hit == word.length - 1;
    }

    public static void main(String[] args) {
        String[] words = {"hot", "dot", "dog", "lot", "log", "cog"};
        System.out.println(solution("hit", "cog", words));

        String[] words2 = {"hot", "dot", "dog", "lot", "log"};
        System.out.println(solution("hit", "cog", words2));
    }
}
