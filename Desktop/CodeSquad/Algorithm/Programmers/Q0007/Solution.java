package Q0007;

public class Solution {
	
	boolean solution(String s) {
	    /* 문자열 내 p, y	개수 */
	    /*  url : https://programmers.co.kr/learn/courses/30/lessons/12916?language=java */
        int p = 0; 
        int y = 0;
        char[] arr = s.toUpperCase().toCharArray();
        for(char c : arr) {
        	if(c == 'P') p++;
        	else if(c == 'Y') y++;
        }
        return p == y || (p == 0 && y == 0) ? true : false;
    }
}
