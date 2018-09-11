package Q9375;

import java.io.*;
import java.util.*;

public class Main {

	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 2018.08.24 */
		/*
		 1. 문제
			해빈이는 패션에 매우 민감해서 한번 입었던 옷들의 조합을 절대 다시 입지 않는다. 
			예를 들어 오늘 해빈이가 안경, 코트, 상의, 신발을 입었다면, 
			다음날은 바지를 추가로 입거나 안경대신 렌즈를 착용하거나 해야한다. 
			해빈이가 가진 의상들이 주어졌을때 과연 해빈이는 알몸이 아닌 상태로 몇 일동안 밖에 돌아다닐 수 있을까?

		 2. 입력
			첫째 줄에 테스트 케이스가 주어진다. 테스트 케이스는 최대 100이다.
			각 테스트 케이스의 첫째 줄에는 해빈이가 가진 의상의 수 n(0 ≤ n ≤ 30)이 주어진다.
			다음 n개에는 해빈이가 가진 의상의 이름과 의상의 종류가 공백으로 구분되어 주어진다. 
			같은 종류의 의상은 하나만 입을 수 있다.
			모든 문자열은 1이상 20이하의 알파벳 소문자로 이루어져있으며 같은 이름을 가진 의상은 존재하지 않는다.

		 3. 출력
			각 테스트 케이스에 대해 해빈이가 알몸이 아닌 상태로 의상을 입을 수 있는 경우를 출력하시오. 
		 */
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		StringBuilder sb = new StringBuilder();
		
		int caseNum = Integer.parseInt(br.readLine());
		Map<String, Integer>  kindMap = null;
		for(int i = 0; i < caseNum; i++) {
			int num = Integer.parseInt(br.readLine());
			kindMap = new HashMap<>();
			for(int j = 0; j < num; j++) {
				String kind = br.readLine().split(" ")[1];
				if(kindMap.containsKey(kind)) {
					int value = kindMap.get(kind);
					kindMap.put(kind, value + 1);
				} else {
					kindMap.put(kind, 1);
				}
			}
			Set<String> keySet = kindMap.keySet();
			Iterator<String> it = keySet.iterator();
			int result = 1;
			while(it.hasNext()) {
				int value = kindMap.get(it.next());
				result = result * (value + 1);
			}
			sb.append((result - 1) + "\n");
		}
		
		bw.write(sb.toString());
		
		bw.close();
		br.close();

	}

}
