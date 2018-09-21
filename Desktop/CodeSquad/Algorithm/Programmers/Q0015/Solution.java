package Q0015;

public class Solution {
	/* 시저암호
	 *     url : https://programmers.co.kr/learn/courses/30/lessons/12926?language=java  */
	
	public static String solution(String s, int n) {
		char[] arr = s.toCharArray();
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 'A' && arr[i] <= 'Z') {
				arr[i] += n;
				arr[i] = (char) (arr[i] > 'Z' ? 'A' + (int)(arr[i] - 'Z') - 1 : arr[i]);
			} else if(arr[i] >= 'a' && arr[i] <= 'z') {
				arr[i] += n;
				arr[i] = (char) (arr[i] > 'z' ? 'a' + (int)(arr[i] - 'z') - 1 : arr[i]);
			} 
		}
		
		StringBuilder sb = new StringBuilder();
		for(char c : arr)
			sb.append(c);
		
	    return sb.toString();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		char a = 'a';
		char z = 'z';
		char A = 'A';
		char Z = 'Z';
		//System.out.println((int)a); // 97
		//System.out.println((int)z); // 122
		//System.out.println((int)A); // 65
		//System.out.println((int)Z); // 90
		
		System.out.println(solution("a B z", 4));

	}

}
