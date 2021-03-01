import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Minimum_Cost_Path {
/*
	Sample Input 1 :
	3 4
	3 4 1 2
	2 1 8 9
	4 7 8 1
	Sample Output 1 :
	13
	
	Sample Input 2 :
	3 4
	10 6 9 0
	-23 8 9 90
	-200 0 89 200
	Sample Output 2 :
	76
	
	Sample Input 3 :
	5 6
	9 6 0 12 90 1
	2 7 8 5 78 6
	1 6 0 5 10 -4 
	9 6 2 -10 7 4
	10 -2 0 5 5 7
	Sample Output 3 :
	18
*/
	
	// Normal Recursive Approach
	public static int minCostPath(int[][] input) {
		//Your code goes here
		return minCostPath(input,0,0);
	}
	
	public static int minCostPath(int[][] input,int row,int col) {
		//Your code goes here
		if(row>=input.length||col>=input[0].length) {
			return Integer.MAX_VALUE;
		}
		if(row==input.length-1 && col==input[0].length-1) {
			return input[row][col];
		}
	
		int option1 = minCostPath(input, row, col+1);
		int option2 = minCostPath(input, row+1, col+1);
		int option3 = minCostPath(input, row+1,col);
		
		return input[row][col]+Math.min(option1, Math.min(option2, option3));
		
	}
	
	// Memoization Approach
	public static int minCostPathM(int[][] input) {
		//Your code goes here
		int m = input.length;
		int n = input[0].length;
		int storage[][] = new int[m][n];
		for(int i=0;i<m;i++) {
			 for(int j=0;j<n;j++) {
				 storage[i][j]= -1;
			 }
		}
		return minCostPathM(input,0,0,storage);
	}
	
	public static int minCostPathM(int[][] input,int i ,int j,int[][] storage) {
		int m = input.length;
		int n = input[0].length;
		if(i>=m||j>=n) {
			return Integer.MAX_VALUE;
		}
		if(i == m-1 && j == n-1) {
			storage[i][j]= input[i][j];
			return input[i][j];
		}
		if(storage[i][j]!=-1) {
			return storage[i][j];
		}
		int option1 = minCostPathM(input, i, j+1,storage);
		int option2 = minCostPathM(input, i+1, j+1,storage);
		int option3 = minCostPathM(input, i+1,j,storage);
		
		storage[i][j]= input[i][j]+Math.min(option1, Math.min(option2, option3));
		return storage[i][j];
	}
	
	// Dynamic Programming Approach
	public static int minCostPathDP(int[][] input) {
		//Your code goes here
		int m = input.length;
		int n = input[0].length;
		int storage[][] = new int[m][n];
		storage[m-1][n-1]= input[m-1][n-1];
		
		//  Last row
		for(int j=n-2;j>=0;j--) {
			storage[m-1][j]= storage[m-1][j+1]+input[m-1][j];
		}
		// Last Column 
		for(int i=m-2;i>=0;i--) {
			storage[i][n-1]= storage[i+1][n-1]+input[i][n-1];
		}

		for(int i=m-2;i>=0;i--) {
			 for(int j=n-2;j>=0;j--) {
				  
				    int option1 = storage[i][j+1];
					int option2 = storage[i+1][j+1];
					int option3 = storage[i+1][j];
					storage[i][j]= input[i][j]+Math.min(option1, Math.min(option2, option3));
			 }
		}
		return storage[0][0];
	}
	
	 static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	    
	    public static int[][] take2DInput() throws IOException {
	        String[] strRowsCols = br.readLine().trim().split("\\s");
	        int mRows = Integer.parseInt(strRowsCols[0]);
	        int nCols = Integer.parseInt(strRowsCols[1]);

	        if (mRows == 0) {
	            return new int[0][0];
	        }

	        int[][] mat = new int[mRows][nCols];

	        for (int row = 0; row < mRows; row++) {
	            String[] strNums; 
	            strNums = br.readLine().trim().split("\\s");
	            
	            for (int col = 0; col < nCols; col++) {
	                mat[row][col] = Integer.parseInt(strNums[col]);
	            }
	        }

	        return mat;
	    }


	    public static void main(String[] args) throws NumberFormatException, IOException {
	        int[][] mat = take2DInput();
	        System.out.println(minCostPathDP(mat));
	        System.out.println(minCostPathM(mat));
	        System.out.println(minCostPath(mat));
	    }

}
