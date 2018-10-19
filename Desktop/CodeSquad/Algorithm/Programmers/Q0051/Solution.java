package Q0051;

public class Solution {
    /* Jadencase 문자열 만들기
     *    url : https://programmers.co.kr/learn/courses/30/lessons/12951?language=java */

    public static String solution(String s) {
        StringBuilder sb = new StringBuilder();
        char[] arr = s.toLowerCase().toCharArray();
        boolean flag = false;
        for(char c : arr) {
            String str = c + "";
            if(c !=  ' ' && flag == false) {
                flag = true;
                str = str.toUpperCase();
            } else if(c == ' ') {
                flag = false;
            }
            sb.append(str);
        }
        return sb.toString();
    }


    public static void main(String[] args) {
        System.out.println(solution("asd asd asd asd"));
        System.out.println(solution("   a   x y"));
    }
}
