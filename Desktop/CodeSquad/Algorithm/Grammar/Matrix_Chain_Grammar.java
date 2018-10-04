package grammar;

public class Matrix_Chain_Grammar {

	public static void main(String[] args) {
		/* 행렬 곱 구하기! */
		
		int[][] arr1 = {
				{1, 2, 3},
				{4, 5, 6}
		};

		int[][] arr2 = {
				{1, 2, 3, 4},
				{5, 6, 7, 8},
				{9, 10, 11, 12}
		};
		//printMatrixMatrix(i, j);

		int[][] result = matrixDouble(arr1, arr2);
		printArr(result);
		
	}

	/* 두 행렬 (2 * 3) (3 * 4) 의 곱 구하기 */
	public static int[][]matrixDouble(int[][] a, int[][] b) {
		/* 곱셈의 연산 횟수는 pqr 범 */
		int[][] result = new int[a.length][b[0].length];
		int p = a.length; // 2
		int q = a[0].length; // 3
		int r = b[0].length; // 4
		for (int i = 0; i < p; i++) {
			for (int j = 0; j < r; j++) {
				for (int k = 0; k < q; k++) {
					result[i][j] += (a[i][k] * b[k][j]);
				}
			}
		}
		return result;
	}

	public static int[][] maxtrixTriple(int[][] a, int[][] b, int[][] c) {
		/*
		 * 행렬 A (10x100), B (100x5), C (5x50) 일 경우, 세 행렬의 곱은 두 가지 방법으로 연산 가능
		 *   --> 행렬은 교환법칙은 성립하지 않지만 결합법칙은 가능하기 때문에 연산 순서가 다양하다.
		 *
		 *  - (AB)C : 10x100x5 + 10x5x50 = 7500 연산 수행!
		 *  - A(BC) : 100x5x50 + 10x100x50 = 75000 연산 수행!
		 *  - 곱하는 순서에 따라 연산 횟수가 다름! --> 최적의 순서를 구하는 것이 중요!
		 *
		 *   m[i, j] : AiA(i+1) ....Ak....Aj 를 곱하는 최소곱셈 횟수
		 *   A1는 p0 * p1, A5는 p4 * p5 이다. 인접행렬의 곱을 의미
		 *   A1*A2*A3 ...A(k + 1)*An 의 연산에서 A1*A2...Ak까지를 X, A(k+1)*A(k+2)...An을 Y라고 한다면,
		 *   X * Y 가 A1*A2*A3 ...A(k + 1)*An 된다.
		 *   m[i, j] -> if i == j -> 0 (행렬이 한개 라는 의미)
		 *           -> i < j -> min((m[i, k] + m[k+1, j] + p(i-1)pkpj)) (i<k<j-1)
		 *           -> p(i-1)pkpj는 X와 Y의 연산하는 횟수
		 * */
		return null;
	}

	public static void printArr(int[][] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[0].length; j++) {
				System.out.print(arr[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
