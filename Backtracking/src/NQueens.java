import java.util.Scanner;

public class NQueens {

	public static void placeQueens(int n) {
		int chess[][] = new int[n][n];
		printAllNQueens(chess,0);
	}

	public static boolean isSafe(int[][] chess, int row, int col ) {
		// Checking all top values                |
		for(int i=row-1, j=col;i>=0;i--) {	   // |
			if(chess[i][j] == 1) {             // |
				return false;                  // |
			}
		}
		// Checking all left top value						\
		for(int i=row-1, j=col-1;i>=0 && j>=0;i--,j--) {  // \
			if(chess[i][j] == 1) {						   // \
				return false;								// \
			}
		}
		// Checking all right top values							     /
		for(int i=row-1, j=col+1;i>=0 && j<chess.length;i--,j++) {	//	/
			if(chess[i][j] == 1) {								   //  /
				return false;									  //  /
			}												     //  /
		}
		return true;
		
		
	}
	public static void printAllNQueens(int[][] chess,int row) {
		
		if(row==chess.length) {
			// N Queens are places then print the chess path
			for(int r=0;r<chess.length;r++) {
				for(int c=0;c<chess.length;c++) {
					System.out.print(chess[r][c]);
				}
				System.out.println();
			}
			System.out.println();
			return;
		}
		
		//Check for all Coolums in the row
		for(int col =0;col<chess.length;col++) {
			// Check if it safe to place Queen
			if(isSafe(chess,row,col)==true) {
				chess[row][col] = 1;
				//If its safe -> then place the queen and move to next row
				printAllNQueens(chess,row+1);
				chess[row][col] = 0;
			}
		}
	
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		placeQueens(n);
	}

}
