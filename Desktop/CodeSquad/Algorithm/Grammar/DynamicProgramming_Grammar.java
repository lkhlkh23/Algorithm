package grammar;

public class DynamicProgramming_Grammar {

	public static void main(String[] args) {
		/*
		 1. 동적계획법
 			- 일반적으로 최적화문제(최소, 최대, 최단경로), 카운팅 문제 풀이에 사용
 			- 주어진 문제에 대한 순환식을 정의 (중요!)
 			   예)L(i, j) = Min(L(i, j - 1), L(i - 1, j)) 처럼 서브프로브럼으로 나눠서 푸는 방식 
 			   * 서브프로브럼으로 나누는 방식이 분할정복법과 공통성이 있음!
 			     분할정복법에서는 분할된 서브프로브럼이 서로 영향을 주지않지만, 동적계획법에서는 그렇지 않음 
 			   * 순환식을 사용할 때는, a 에서 d까지 가는 길의 최소경로가 a 에서 c 까지의 최소경로에서 c 에서
 			     d 까지 가는 최소경로의 합과 동일한가? (부분집합인가?) 라는 의문을 한번 더지고 진행 필요! 
 			     그렇지 않을 경우에는 순환식이 적용되지 않는다!
 			- 순환식을 메모리제이션 혹은 Bottom-up 방식으로 풀이
 			- 어떤 문제의 최적해가 그것의 서브 프로브럼의 최적해로부터 효율적으로 구해질 수 있을 때,
 			  그 문제는 최적화된 구조체를 가진다. 
 
		 * 
		 * */
		int[][] arr = new int [4][4];
		arr[0][0] = 6; arr[0][1] = 7; arr[0][2] = 12; arr[0][3] = 5;
		arr[1][0] = 5; arr[1][1] = 3; arr[1][2] = 11; arr[1][3] = 18;
		arr[2][0] = 7; arr[2][1] = 17; arr[2][2] = 3; arr[2][3] = 3;
		arr[3][0] = 8; arr[3][1] = 10; arr[3][2] = 14; arr[3][3] = 9;
		
		int[][] distance = new int[arr.length][arr[0].length];
	
		/* 메모리제이션에서 캐싱을 위해 -1로 초기화 -> 여러번 수행할 때, 이전 내용에 대해 중복적인 수행 제거를 위해 */
		for(int i = 0; i < distance.length; i++) {
			for(int j = 0; j < distance[0].length; j++) {
				distance[i][j] = -1;
			}
		}
		char[][] directions = new char[4][4];
		System.out.println(memorization1(3, 3, arr, distance, directions));
		
		for(int i = 0; i < 4; i++) {
			for(int j = 0; j < 4; j++) {
				System.out.print(directions[i][j] + "\t");
			}
			System.out.println();
		}
	
	}
	
	public static int memorization1(int s, int e, int[][] arr, int[][] distance, char[][] directions) {
		if(distance[s][e] > -1) {
			return distance[s][e];
		} else if(s == 0 && e == 0) {
			distance[s][e] =  arr[s][e];
			directions[s][e] = 'S';
		} else if(s == 0) {
			distance[s][e] = memorization1(s, e - 1, arr, distance, directions) + arr[s][e];
			directions[s][e] = 'L';
		} else if(e == 0) {
			distance[s][e] = memorization1(s - 1, e, arr, distance, directions) + arr[s][e];
			directions[s][e] = 'U';
		} else {
			distance[s][e] = Math.min(memorization1(s, e - 1, arr, distance, directions), memorization1(s - 1, e, arr, distance, directions)) + arr[s][e];
			if(distance[s][e - 1] > distance[s - 1][e]) {
				directions[s][e] = 'U';
			} else {
				directions[s][e] = 'L';
			}
		}
		
		return distance[s][e];
	}

}
