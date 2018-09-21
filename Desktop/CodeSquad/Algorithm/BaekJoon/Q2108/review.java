package Q2108;

import java.io.*;
import java.util.*;

public class review {
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws IOException {
		/* Collection Map 이용해서 다시 작성 */
		
		int N = Integer.parseInt(br.readLine()); 
		ArrayList<Integer> inputList = new ArrayList<>();
		for(int i = 0; i < N; i++) {
			inputList.add(Integer.parseInt(br.readLine()));
		}
		
		bw.write(getAverage(inputList) + "\n");
		bw.write(getMiddle(inputList) + "\n");
		bw.write(getMin(inputList) + "\n");
		bw.write(getRange(inputList) + "\n");
	
		bw.close();
		br.close();
	}
	
	public static int getMin(ArrayList<Integer> list) {
		/* 1. Map 초기화 */
		HashMap<Integer, Integer> map = initMap(list);
		
		/* 2. Map에 key 값이 나온 횟수를 value에 저장 */
		countMapKey(map, list);
		
		/* 3. 최빈값 출력 단, 여러개일 경우, 값이 가장 작은 값 return */
		return getResult(map);
	}
	
	public static int getAverage(ArrayList<Integer> list) {
		int sum = 0;
		for(int i = 0; i < list.size(); i++) {
			sum += list.get(i);
		}
		
		return (int) Math.round((double)sum / list.size());
	}
	
	public static int getMiddle(ArrayList<Integer> list) {
		int idx = (int)Math.floor(list.size() / 2);
		Collections.sort(list);
		
		return list.get(idx);
	}
	 
	public static int getRange(ArrayList<Integer> list) {
		Collections.sort(list);
		
		return list.get(list.size()-1) - list.get(0);
	}
	
	public static HashMap<Integer, Integer> initMap(ArrayList<Integer> list) {
		HashMap<Integer, Integer> map = new HashMap<>();
		for(int i = 0; i < list.size(); i++) {
			map.put(list.get(i), 0);
		}
		
		return map;
	}
	
	public static void countMapKey(HashMap<Integer, Integer> map, ArrayList<Integer> list) {
		for(int i=0; i < list.size(); i++) {
			map.put(list.get(i), map.get(list.get(i)) + 1);
		}
	}
	
	public static int getResult(HashMap<Integer, Integer> map) {
		Set<Integer> keySet = map.keySet();
		Iterator<Integer> it = keySet.iterator();
		List<Integer> list = new ArrayList<>();
		int max = 0;
		
		while(it.hasNext()) {
			int key = it.next();
			int value = map.get(key);
			
			if(max <= value) {
				if(max < value) {
					list.clear();
				}
				list.add(key);
			}
			max = max > value ? max : value;
		}
		Collections.sort(list);
		
		return list.size() > 1 ? list.get(1) : list.get(0);
	}

}
