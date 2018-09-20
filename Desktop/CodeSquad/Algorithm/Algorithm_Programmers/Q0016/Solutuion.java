package Q0016;

public class Solutuion {
	/* 이상한 문자 만들기!
	 *   url : https://programmers.co.kr/learn/courses/30/lessons/12930?language=java */
	
	
	public static String solution(String s) {
	   String[] split = s.split(" ");
	   StringBuilder sb = new StringBuilder();
	   for(int i = 0; i < split.length; i++) {
		   char[] arr = split[i].toLowerCase().toCharArray();
		   for(int j = 0; j < arr.length; j+=2) {
			   if(arr[j] >= 'a' && arr[j] <= 'z') {
				   arr[j] = (char)(arr[j] - (97 -65));   
			   }
		   }
		   
		   for(int j = 0; j < arr.length; j++) 
			   sb.append(arr[j]);
		   
		   sb.append(" ");
	   }
	   
	   return sb.toString().substring(0, sb.toString().length() - 1);
	}

	public static void main(String[] args) {
		////System.out.println((int)a); // 97
		//System.out.println((int)z); // 122
		//System.out.println((int)A); // 65
		//System.out.println((int)Z); // 90
		
		System.out.println(solution("A1a !   ***aAaA !!b2B3b"));

	}

}
