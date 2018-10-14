package Q0049;

public class Solution {
    /* 전화번호 목록
     *    url : https://programmers.co.kr/learn/courses/30/lessons/42577?language=java */
    public static boolean solution(String[] phone_book) {
        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 0; j < phone_book.length; j++) {
                if(i != j && phone_book[i].length() <= phone_book[j].length() && phone_book[j].substring(0, phone_book[i].length()).equals(phone_book[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean solution2(String[] phone_book) {
        for(int i = 0; i < phone_book.length; i++) {
            for(int j = 0; j < phone_book.length; j++) {
                if(i != j && phone_book[j].startsWith(phone_book[i])) {
                    return false;
                }
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String[] phone_book = {"119", "97674223", "1195524119"};
        System.out.println(solution2(phone_book));

        String[] phone_book2 = {"123", "456", "789"};
        System.out.println(solution2(phone_book2));

        System.out.println("123".substring(0, 2));

    }

}