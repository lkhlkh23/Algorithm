package kakao;

import java.io.*;
import java.util.*;

public class Main_3 {

	public static void main(String[] args) throws NumberFormatException, IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int cacheSize = Integer.parseInt(br.readLine());
		String[] cities = br.readLine().replace("[", "").replace("]", "").replace(" ", "").toUpperCase().split(",");
		int time = 0;
		int hit = 1;
		int miss = 5;
		int idx = 0;
		Map<String, Integer> map = new TreeMap<>();
		
		for(int i = 0; i < cities.length; i++) {
			if(map.containsKey(cities[i])) {
				map.remove(cities[i]);
				time += hit;
			} else {
				if(map.size() > cacheSize) {
					// map에서 값이 작은 것을 삭
					Iterator<String> it = map.keySet().iterator();
					String key = "";
					int minValue = Integer.MAX_VALUE;
					String minKey = "";
					while(it.hasNext()) {
						key = it.next();
						int value = map.get(key);
						if(minValue > value) {
							minValue = value;
							minKey = key;
						}
					}
					map.remove(minKey);
				}
				time += miss;
			}
			map.put(cities[i], idx);
			idx++;
		}
		
		bw.write(time + "\n");
		bw.close();

	}


}
