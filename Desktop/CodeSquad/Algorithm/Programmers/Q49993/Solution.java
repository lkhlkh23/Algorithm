package Q49993;

public class Solution {
    /*
      문제    : 스킬트리
      url  : https://programmers.co.kr/learn/courses/30/lessons/49993
      재풀이 : X
   */
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(String skill_tree : skill_trees) {
            int[] positions = new int[skill.length()];
            for(int i = 0; i < skill.length(); i++)
                positions[i] = skill_tree.indexOf(skill.charAt(i)) > -1 ? skill_tree.indexOf(skill.charAt(i)) : 27;

            boolean flag = true;
            for(int i = 0; i < positions.length - 1; i++)
                flag = positions[i] > positions[i + 1] ? false : flag;

            answer = flag ? answer + 1 : answer;
        }
        return answer;
    }
}
