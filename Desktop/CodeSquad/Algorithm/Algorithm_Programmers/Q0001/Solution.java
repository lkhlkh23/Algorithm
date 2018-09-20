package Q0001;

import java.util.*;

public class Solution {
	/* [소수 찾기!] 
	 *   url : https://programmers.co.kr/learn/courses/30/lessons/42839?language=java */
    public static int solution(String numbers) {
        int answer = 0;
        System.out.println("Start");
        boolean[] primes = initPrime();
        
        
        return answer;
    }
    
    public static boolean[] initPrime() {
    	boolean[] primes = new boolean[10000000 + 1];
    	for(int i = 2; i < primes.length && !primes[i]; i++) {
    		for(int j = 2; j < i; j++) {
    			if(i % j == 0) {
    				for(int k = 1; k <= primes.length / i; k++) {
    					primes[i * k] = true;
    				}
    				break;
    			}
    		}
    	}
    	return primes;
    }
    
    public static void main(String[] args) {
    	solution("test");
    }
	
}
