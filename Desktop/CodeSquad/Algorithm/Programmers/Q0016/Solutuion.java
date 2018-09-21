package Q0016;

public class Solutuion {
	/* 이상한 문자 만들기!
	 *   url : https://programmers.co.kr/learn/courses/30/lessons/12930?language=java */
	
	
	public static String solution(String s) {
	   StringBuilder sb = new StringBuilder();
	   char[] arr = s.toUpperCase().toCharArray();
	   int index = 0;
	   for(char c : arr) {
	   	index = c == ' ' ? 0 : index;
		if(c >= 'A' && c <= 'Z') {
			if(index % 2 == 1) {
				c = (char) (c + (int)('a' - 'A'));
			}
			index++;
		}
		sb.append(c);
	   }
	   
	   return sb.toString();
	}

	public static String solution2(String s) {
		StringBuilder sb = new StringBuilder();
		String[] arr = s.split("");
		int index = -1;
		for(String str : arr) {
			index = str.equals(" ") ? -1 : index + 1;
			str = index % 2 == 0 ? str.toUpperCase() : str.toLowerCase();
			sb.append(str);
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		////System.out.println((int)a); // 97
		//System.out.println((int)z); // 122
		//System.out.println((int)A); // 65
		//System.out.println((int)Z); // 90
		String a = solution2("Aa !    ***aAaA  !!bBb  ");
		System.out.println(a);
		System.out.println(a.equals("Aa !    ***aAaA  !!BbB  "));

	}

}
