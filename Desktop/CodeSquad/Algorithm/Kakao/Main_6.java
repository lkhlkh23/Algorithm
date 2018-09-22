package kakao;

import java.io.*;
public class Main_6 {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
		
		int m = Integer.parseInt(br.readLine()); // 높이 
		int n = Integer.parseInt(br.readLine()); // 폭  
		String[] inputBoard = br.readLine().replace("[", "").replace("]", "").replace(" ", "").replace("“", "").replace("”", "").split(",");
		char[][] board = new char[m][n];
		boolean[][] boardCopy = new boolean[m][n];
		int flag = 0;
		for(int i = 0; i < board.length; i++) {
			board[i] = inputBoard[i].toCharArray();
		}
		do {
			for(int i = 0; i < board.length - 1; i++) {
				for(int j = 0; j < board[i].length - 1; j++) {
					hitBoard(board, boardCopy, i, j);
				}
			}
		} while(clearBoard(board, boardCopy));
		
		int result = 0;
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				result = boardCopy[i][j] ? result : result + 1;
			}
		}
		
		bw.write(result + "\n");
		bw.close();
		
	}
	
	public static void hitBoard(char[][] arr, boolean[][] copy, int w, int h) {
		if(arr[w][h] == arr[w + 1][h] && arr[w][h] == arr[w][h + 1] && arr[w][h] == arr[w + 1][h + 1]) {
			copy[w][h] = copy[w + 1][h] = copy[w][h + 1] = copy[w + 1][h + 1] = true;
		}
	}
	
	public static boolean clearBoard(char[][] arr, boolean[][] copy) {
		for(int i = copy.length - 1; i >= 0; i--) {
			for(int j = copy[i].length - 1; j >= 0; j--) {
				arr[i][j] = copy[i][j] ? arr[i][j - 1] : arr[i][j];
			}
		}
		
		return true;
	}

}
