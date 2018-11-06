package Q1021;

import java.io.*;
import java.util.*;

public class Main {
	/*
	 	문제 : 회전하는 큐
	 	url : https://www.acmicpc.net/problem/1021
	 	재풀이 : O
	*/

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		StringTokenizer st1 = new StringTokenizer(br.readLine());
		int M = Integer.parseInt(st1.nextToken());
		int N = Integer.parseInt(st1.nextToken());
		
		StringTokenizer st2 = new StringTokenizer(br.readLine());
		List<Integer> findList = new LinkedList<>();
		while(st2.hasMoreTokens()) {
			findList.add(Integer.parseInt(st2.nextToken()));
		}
		
		/* 1. 리스트 초기화 */
		List<Integer> targetList = initList(M);
		
		bw.write(getResult(findList, targetList) + "\n");
		
		bw.close();
		br.close();
		

	}
	
	public static List<Integer> initList(int M) {
		List<Integer> list = new LinkedList<>();
		for(int i = 0; i < M; i++) {
			list.add(i+1);
		}
		return list;
	}
	
	public static int getResult(List<Integer> find, List<Integer> target) {
		int cnt = 0;
		for(int i = 0; i < find.size();) {
			if(find.get(i) == target.get(0)) {
				target.remove(0);
				i++;
			} else {
				//System.out.println(target.indexOf(find.get(find.size() - 1)) + "**");
				if(target.indexOf(find.get(i)) < target.size() - target.indexOf(find.get(i))) {
					front(target);
					cnt++;
				} else {
					back(target);
					cnt++;
				}
			}
		}
		
		return cnt;
	}
	
	public static void front(List<Integer> list) {
		int n = list.remove(0);
		list.add(n);
	}
	
	public static void back(List<Integer> list) {
		int n = list.remove(list.size() - 1);
		list.add(0, n);
	}

}
