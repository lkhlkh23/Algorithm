package Q0066;

import java.util.*;

public class Solution {
    /* 베스트앨범
     *    url : https://programmers.co.kr/learn/courses/30/lessons/42579?language=java */

    public static int[] solution(String[] genres, int[] plays) {
        Map<Integer, String> genreMap = new HashMap<>(); // 고유번호, 장르
        Map<Integer, Integer> playMap = new HashMap<>(); // 고유번호 플레이수
        Map<String, Integer> sortedGenreMap = new TreeMap<>(); // 장르 누적플레이수
        for (int i = 0; i < plays.length; i++) {
            genreMap.put(i, genres[i]);
            playMap.put(i, plays[i]);
            sortedGenreMap.put(genres[i],
                    sortedGenreMap.containsKey(genres[i]) ? sortedGenreMap.get(genres[i]) + plays[i] : plays[i]);
        }

        List<Integer> list = new ArrayList<>();
        sortedGenreMap.keySet().stream()
                .sorted((o1, o2) -> sortedGenreMap.get(o2) - sortedGenreMap.get(o1))
                .forEach(genre -> {
                    genreMap.keySet().stream()
                            .filter(key -> genreMap.get(key).equals(genre))
                            .map(key -> playMap.get(key))
                            .sorted(Collections.reverseOrder())
                            .limit(2)
                            .forEach(value -> {
                                playMap.keySet().stream()
                                        .filter(v -> playMap.get(v).equals(value))
                                        .limit(1)
                                        .forEach(result -> {
                                            list.add(result);
                                            playMap.put(result, -1);
                                        });
                            });
                }
        );
        int[] answer = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            answer[i] = list.get(i);
        }

        return answer;
    }
}
