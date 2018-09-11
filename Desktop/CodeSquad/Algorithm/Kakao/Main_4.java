package Kakao;

import java.io.*;
import java.util.*;

public class Main_4 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int n = Integer.parseInt(br.readLine());
		int t = Integer.parseInt(br.readLine());;
		int m = Integer.parseInt(br.readLine());;
		/* 입력값 특수문자 제거! */
		String[] timeTable = br.readLine().replace("[", "").replace("]", "").replace(" ", "").replace("“", "").replace("”", "").split(",");
		
		/* 크루 대기시간값 저장! */
		int[] timeNumber = new int[timeTable.length];
		for(int i = 0; i < timeNumber.length; i++) {
			int t1 = Integer.parseInt(timeTable[i].split(":")[0]) * 60;
			int t2 = Integer.parseInt(timeTable[i].split(":")[1]);
			timeNumber[i] = t1 + t2;
		}
		Arrays.sort(timeNumber);
		
		/* 버스시간표 시간값 저장! */
		int[] busTime = new int[n];
		for(int i = 0; i < busTime.length; i++) {
			busTime[i] = t * i + 9 * 60;
		}
		
		int idx = 0;
		for(int i = 0; i < busTime.length; i++) {
			System.out.println(busTime[i] + " Bus!");
			for(int j = 0; j < m; j++) {
				if(busTime[i] >= timeNumber[idx]) {
					//System.out.println(timeNumber[idx]);
					idx++;
				}
			}
		}
		int resultTime = 0;
		if(idx < 1) {
			resultTime = busTime[busTime.length - 1];
		} else {
			resultTime = timeNumber[idx - 1] - 1 < busTime[busTime.length - 1] ? timeNumber[idx - 1] - 1 : busTime[busTime.length - 1];
		}
		int hour = resultTime / 60;
		int minutes = resultTime % 60;
		String result = "“" + addZero(hour) + ":" + addZero(minutes) + "“";
		
		bw.write(result + "\n");
	}
	
	public static String addZero(int n) {
		return n < 10 ? "0" + n : n + "";
	}

}
