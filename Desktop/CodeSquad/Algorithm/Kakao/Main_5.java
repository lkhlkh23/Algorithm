package Kakao;

import java.io.*;
import java.util.*;

public class Main_5 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		String str1 = br.readLine().toUpperCase();
		String str2 = br.readLine().toUpperCase();
		Set<String> set = new HashSet<>();
		String[] arr1 = makePartition(str1, set);
		String[] arr2 = makePartition(str2, set);
		
		System.out.println("교집합 : " + makeIntersection(arr1, arr2, set));
		System.out.println("합집합 : " + makeUnion(arr1, arr2, set));
		
		int result = (int)(((double)makeIntersection(arr1, arr2, set) / makeUnion(arr1, arr2, set)) * 65536);
		
		bw.write(result + "\n");
		
		bw.close();
	}
	
	public static String[] makePartition(String str, Set<String> set) {
		String[] result = new String[1000];
		char[] charArr = str.toCharArray();
		int cnt = 0;
		for(int i = 0; i < str.length() - 1; i++) {
			if(charArr[i] >= 'A' && charArr[i] <= 'Z' && charArr[i + 1] >= 'A' && charArr[i + 1] <= 'Z') {
				result[cnt] = charArr[i] + "" +charArr[i + 1];
				set.add(result[cnt]);
				System.out.print("**"+result[cnt]+"**" + "\t");
				cnt++;
			}
		}
		System.out.println();
		return result;
	}
	
	public static int makeIntersection(String[] arr1, String[] arr2, Set<String> set) {
		int result = 0;
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String value = it.next();
			result += Math.min(countNum(arr1, value), countNum(arr2, value));
		}
		return result;
	}
	
	public static int makeUnion(String[] arr1, String[] arr2, Set<String> set) {
		int result = 0;
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String value = it.next();
			result += Math.max(countNum(arr1, value), countNum(arr2, value));
		}
		return result;
	}
	
	public static int countNum(String[] arr, String value) {
		int count = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == null) break;
			count = arr[i].equals(value) ? count + 1 : count;	
		}
		return count;
	}
	
	public static int getResult(String[] arr1, String[] arr2, Set<String> set) {
		int intersection = 0;
		int union = 0;
		Iterator<String> it = set.iterator();
		while(it.hasNext()) {
			String value = it.next();
			union += Math.max(countNum(arr1, value), countNum(arr2, value));
			intersection += Math.min(countNum(arr1, value), countNum(arr2, value));
		}
		
		return (int)(((double)intersection / union) * 65536);
	}

}
