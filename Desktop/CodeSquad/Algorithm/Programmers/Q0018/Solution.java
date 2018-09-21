package Q0018;

public class Solution {
    public static boolean solution(String s) {
        if(!(s.length() == 4 || s.length() == 6)) return false;
        try {
            Integer.parseInt(s);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    public static void main(String[] args) {
        System.out.println(solution(" 222 "));
    }
}
