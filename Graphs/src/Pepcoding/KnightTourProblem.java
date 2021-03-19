package Pepcoding;

import java.util.Scanner;

public class KnightTourProblem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int row = sc.nextInt();
		int col = sc.nextInt();
		int[][] adjacencyMatrix = new int[n][n];
		printknightTour(adjacencyMatrix,row,col,1);
			
		
	}

	public static void displayBoard(int[][] chess ) {
		for(int i=0;i<chess.length;i++) {
			for(int j=0;j<chess.length;j++) {
				System.out.print(chess[i][j]+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	private static void printknightTour(int[][] chess, int row, int col, int move) {
		// TODO Auto-generated method stub
		if(row < 0 || col < 0 || row >= chess.length || col >= chess.length || chess[row][col] > 0 ) {
			return;
		}else if(move == chess.length * chess.length) {
			chess[row][col] = move;
			displayBoard(chess);
			chess[row][col]=0;
			return;
		}
		
		chess[row][col] = move;
		printknightTour(chess, row-2, col+1, move+1);
		printknightTour(chess, row-1, col+2, move+1);
		printknightTour(chess, row+1, col+2, move+1);
		printknightTour(chess, row+2, col+1, move+1);
		printknightTour(chess, row+2, col-1, move+1);
		printknightTour(chess, row+1, col-2, move+1);
		printknightTour(chess, row-1, col-2, move+1);
		printknightTour(chess, row-2, col-1, move+1);
		chess[row][col]=0;
	}

}
