package Q42890;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

class Solution {
    /*
	 	문제 : 후보키
	 	url : https://programmers.co.kr/learn/courses/30/lessons/42890
	 	재풀이 : X
	*/

    public int solution(String[][] relation) {
        int answer = 0;
        List<List<String>> list = new ArrayList<>();
        for (int i = 0; i < relation[0].length; i++) {
            List<String> partition = new ArrayList<>();

            for (int j = 0; j < relation.length; j++)
                partition.add(relation[j][i]);

            if(isCandidate(partition)) answer++;
            else list.add(partition);
        }

        List<String> words = new ArrayList<>();
        boolean flag = false;
        for (int i = 0; i < list.size();) {
            for (int j = 0; j < list.get(i).size(); j++) {
                words.add(list.get(i).get(j));
            }

            for (int j = i + 1; j < list.size(); j++) {
                for (int k = 0; k < words.size(); k++) {
                    words.set(k, String.format("%s %s", words.get(k), list.get(j).get(k)));
                }
                if(isCandidate(words)) {
                    i = j + 1;
                    answer++;
                    flag = true;
                    break;
                }
            }
            if(!flag) {
                i++;
            }
            flag = false;
            words.clear();
        }
        return answer;
    }

    public static boolean isCandidate(List<String> list) {
        Set<String> set = new HashSet<>();
        set.addAll(list);
        return list.size() == set.size();
    }

    public static void main(String[] args) {
        String[][] relation= {
                {"100","ryan","music","2"},
                {"200","apeach","math","2"},
                {"300","tube","computer","3"},
                {"400","con","computer","4"},
                {"500","muzi","music","3"},
                {"600","apeach","music","2"}
        };

        System.out.println(new Solution().solution(relation));

    }

}