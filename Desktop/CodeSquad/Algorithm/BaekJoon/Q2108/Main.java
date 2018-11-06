package Q2108;

import java.io.*;
import java.util.*;

public class Main {
	/*
	 	문제 : 통계학
	 	url : https://www.acmicpc.net/problem/2108
	 	재풀이 : O
	*/
	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	static BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
	public static void main(String[] args) throws NumberFormatException, IOException {
		/* 2018.08.09 */
		/*
		 1. 문제
			수를 처리하는 것은 통계학에서 상당히 중요한 일이다. 통계학에서 N개의 수를 대표하는 기본 통계값에는 
			다음과 같은 것들이 있다. 단, N은 홀수라고 가정하자.

			산술평균 : N개의 수들의 합을 N으로 나눈 값
			중앙값 : N개의 수들을 증가하는 순서로 나열했을 경우 그 중앙에 위치하는 값
			최빈값 : N개의 수들 중 가장 많이 나타나는 값
			범위 : N개의 수들 중 최대값과 최소값의 차이
			N개의 수가 주어졌을 때, 네 가지 기본 통계값을 구하는 프로그램을 작성하시오.

		2. 입력
			첫째 줄에 수의 개수 N(1 ≤ N ≤ 500,000)이 주어진다. 그 다음 N개의 줄에는 정수들이 주어진다.
			입력되는 정수의 절대값은 4,000을 넘지 않는다.

		3. 출력
			첫째 줄에는 산술평균을 출력한다. 소수점 이하 첫째 자리에서 반올림한 값을 출력한다.
			둘째 줄에는 중앙값을 출력한다.
			셋째 줄에는 최빈값을 출력한다. 여러 개 있을 때에는 최빈값 중 두 번째로 작은 값을 출력한다.
			넷째 줄에는 범위를 출력한다.
		 */
		
		int N = Integer.parseInt(br.readLine());
		int[] numArr = new int[N];
		
		for(int i = 0; i < numArr.length; i++) {
			numArr[i] = Integer.parseInt(br.readLine());
		}
		
		bw.write(getAverage(numArr) + "\n");
		bw.write(getMiddle(numArr) + "\n");
		bw.write(getMin(numArr) + "\n");
		bw.write(getRange(numArr) + "\n");
		
		bw.close();
		br.close();
	}
	
	public static int getAverage(int[] arr) {
		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		
		return (int) Math.round((double)sum / arr.length);
	}
	
	public static int getMiddle(int[] arr) {
		int idx = (int)Math.floor(arr.length / 2);
		sortArr(arr);
		
		return arr[idx];
	}
	
	public static void sortArr(int[] arr) {
		Arrays.sort(arr);
	}
	 
	public static int getRange(int[] arr) {
		sortArr(arr);
		
		return arr[arr.length - 1] - arr[0];
	}
	
	public static int getMin(int[] arr) {
		sortArr(arr);
		int[] cntArr = new int[arr.length];
		int cnt = 1;
		for(int i = 0; i < arr.length; i++) {
			if(i == 0) {
				cntArr[i] = cnt;
			} else {
				if(arr[i] == arr[i-1]) {
					cnt++;
					cntArr[i] = cnt;
				} else {
					cnt = 1;
					cntArr[i] = cnt;
				}
			} 
		}
		int[] copyArr = new int[cntArr.length];
		for(int i = 0; i < cntArr.length; i++) {
			copyArr[i] = cntArr[i];
		}
		sortArr(copyArr);
		int max = copyArr[copyArr.length-1];
		
		int result = 0;
		int hit = 0;
		for(int i = 0; i < cntArr.length; i++) {
			if(cntArr[i] == max) {
				result = arr[i];
				hit++;
			}
			if(hit == 2 && cntArr[i] == max) {
				return arr[i];
			}
		}
		
		return result;
	}

}
