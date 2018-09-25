package Q0032;

public class Solution {
    /* 핸드폰 번호 가리기
     *    url : https://programmers.co.kr/learn/courses/30/lessons/12948?language=java */
    public static String solution(String phone_number) {
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i < phone_number.length() - 4; i++)
            sb.append("*");

        return sb.append(phone_number.substring(phone_number.length() - 4, phone_number.length())).toString();
    }

    public static String solution2(String phone_number) {
        char[] arr = phone_number.toCharArray();
        for(int i = 0; i < phone_number.length() - 4; i++)
            arr[i] = '*';

        return String.valueOf(arr);
    }

    public static void main(String[] args) {
        System.out.println(solution("0319128029"));
        System.out.println(solution("01067910076"));
    }
}
