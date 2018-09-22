package grammar;

public class Matrix_Chain_Grammar {

	public static void main(String[] args) {
		/* 행렬 곱 구하기! */
		/*
		 * 행렬 A (10x100), B (100x5), C (5x50) 일 경우, 세 행렬의 곱은 두 가지 방법으로 연산 가능
		 *  - (AB)C : 10x100x5 + 10x5x50 = 7500 연산 수행!
		 *  - A(BC) : 100x5x50 + 10x100x50 = 75000 연산 수행!
		 *  - 곱하는 순서에 따라 연산 횟수가 다름! --> 최적의 순서를 구하는 것이 중요!
		 *   
		 *   m[i, j] : AiA(i+1) ....Ak....Aj 를 곱하는 최소곱셈 횟수 
		 *   m[i, j] -> if i == j -> 0 (행렬이 한개 라는 의미) 
		 *           -> i < j -> min(i<k<j-1)(m[i, k] + m[k+1, j] + p(i-1)pkpj)
		 * */
		
		int[] matrix = new int[1000];
		//printMatrixMatrix(i, j);
		
	}
	// i에서 j까지 곱하는 것을 구하는 함
	public static int recursive(int i, int k, int j) { 		
		if(i == j) { 
			return 0;
		} else {
			return recursive(i, k, j) + recursive(k + 1, j, j) + i*j*k;
		}
	}

}
