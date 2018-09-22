package grammar;

import java.util.StringTokenizer;

public class StirngTokenizer_Grammar {

	public static void main(String[] args) {
		/* 2018.08.09 */
		/*
		 * [StringTokenizer]
		 * 		자바에서는 String을 token단위로 끊어주는 StringTokenizer 클래스를 제공한다.
		 *  	예를들어 "this is my string" 이라는 스트링을 this, is, my, string 4개의 스트링으로 끊어주는 
		 *  	기능을 제공한다.
		 *  
		 * [StringTokenizer Function]
		 * 	countTokens()			토큰의 갯수를 리턴.
		 *  nextToken()     		다음 토큰을 리턴. 이전 토큰은 제거.
		 *  nextToken(String delim)	구획문자(delimiter)를 delim으로 바꾼 후 바뀐 다음 토큰을 리턴한다. 
		 *                          예를들어 this$1is$1string 이라고 하면 생성자에서 구획문자를$1로 설정했다가 
		 *                          nextToken으로 this를 받고 2번째 nextToken은 delim을 $로 받으면
		 *                          (nextToken("$")) 1is를 리턴한다.
         *  hasMoreTokens()         리턴할 다음 토큰이 있으면 true를 다음 토큰이 없으면 false를 리턴한다.
		 * 
		 *  [출처] http://arer.tistory.com/48 
		 * 
		 * */
		
		
		
		
	}
	
	public static void printInput(String str) {
		StringTokenizer st = new StringTokenizer(str);
		
		while(st.hasMoreTokens()) {
			System.out.print(st.nextToken() +"\t");
		}
	}
}
