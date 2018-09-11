package Kakao;

import java.io.*;

public class Main_2 {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		String input = br.readLine();
		char[] arr = input.toCharArray();
		int[] resultArr = new int[3];
		int result = 0;
		int idx = -1;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= '1' && arr[i] <= '9') {
				idx++;
				if(arr[i] == '1' && arr[i+1] == '0') resultArr[idx] = 10;
				else resultArr[idx] = arr[i] - '0';
			} else {
				switch(arr[i]) {
					case 'D' :
						resultArr[idx] = (int)Math.pow(resultArr[idx], 2);
						break;
						
					case 'T' :
						resultArr[idx] = (int)Math.pow(resultArr[idx], 3);
						break;
						
					case '*' :
						if(idx > 0) resultArr[idx - 1] *= 2;
						resultArr[idx] *= 2;
						break;
						
					case '#' :
						resultArr[idx] *= -1;
						break;
				}
			}
		}
		
		for(int i = 0; i < resultArr.length; i++) 
			result += resultArr[i];
		
		bw.write(result + "\n");
		bw.close();
		
	}
}
