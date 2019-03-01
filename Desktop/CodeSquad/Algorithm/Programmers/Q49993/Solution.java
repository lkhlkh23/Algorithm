package Q49993;

import java.util.Arrays;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    /*
	 	문제 : 스킬트리
	 	url : https://programmers.co.kr/learn/courses/30/lessons/49993
	 	재풀이 : X
	*/

    private static final String REGEX = "[A-Z]*";
    public static int solution(String skill, String[] skill_trees) {
        int answer = 0;
        for(int i = skill.length() - 1; i >= 0; i--) {
            char[] skills = skill.substring(0, i + 1).toCharArray();
            permutation(skills, 0, skill_trees, answer, skill.substring(0, i + 1));
        }

        return answer;
    }

    public static String createRegex(char[] arr) {
        StringBuilder sb = new StringBuilder(REGEX);
        for (char extract : arr)
            sb.append(extract + REGEX);

        return sb.toString();
    }

    public static boolean isMatch(String skill, String regex) {
        return Pattern.compile(regex).matcher(skill).find();
    }

    public static void swap(char[] arr, int start, int end) {
        char temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;
    }

    public static void permutation(char[] arr, int depth, String[] skill_trees, int answer, String except) {
        if(depth == arr.length - 1) {
            String regex = createRegex(arr);
            Iterator<String> it = Arrays.asList(skill_trees).iterator();
            while(it.hasNext()) {
                String skill = it.next();
                System.out.println(skill + "~~");
                if(!except.equals(skill) && isMatch(skill, regex)) {
                    //it.remove();
                    //System.out.println(skill);
                }
            }
        } else {
            for(int i = depth; i < arr.length; i++) {
                swap(arr, depth, i);
                permutation(arr, depth + 1, skill_trees, answer, except);
                swap(arr, depth, i);
            }
        }
    }

    public static void main(String[] args) {
        String[] skills = {"BACDE", "CBADF", "AECB", "BDA"};
        System.out.println(solution("CBD", skills));
    }
}
