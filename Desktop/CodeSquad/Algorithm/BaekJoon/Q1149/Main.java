package Q1149;

import java.util.*;
public class Main{
	/*
	 	문제 : RGB 거리
	 	url : https://www.acmicpc.net/problem/1149
	 	재풀이 : O
	*/
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int homeNum = sc.nextInt();
    	int prevr = 0, prevg = 0, prevb = 0;
    	int r = 0, g = 0, b = 0;
    	for(int i = 0; i < homeNum; i++) {
    		r = sc.nextInt() + getMin(prevg, prevb);
    		g = sc.nextInt() + getMin(prevr, prevb);
    		b = sc.nextInt() + getMin(prevr, prevg);
    		prevr = r;
    		prevg = g;
    		prevb = b;
    	}
    	System.out.println(getMin(r, getMin(g, b)));
    }
    
    public static int getMin(int x, int y) {
    	return Math.min(x, y);
    }
}
