
public class PrintPath_Rat_In_a_Maze {

	private static Boolean solveMaze(int[][] maze,int[][] path,int i,int j) {
		int n = maze.length;
		//Check if i,j cell is valid or not;
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1){
			return false;
		}
		
		//Include the cell in current path
				path[i][j]=1;
		
		//Check if the cell is destination cell
		if(i==n-1 && j==n-1) {
			for(int row = 0;row<n;row++) {
				for(int column = 0;column<n;column++) {
					System.out.print(path[row][column]+" ");
				}
				System.out.println();
			}
			return true;
		}
		// Explore in all directions
		
		//Top
		if(solveMaze(maze, path, i-1, j)) {
			return true;
		}
		
		//Right
		if(solveMaze(maze, path, i, j+1)) {
			return true;
		}
		//Bottom
		if(solveMaze(maze, path, i+1, j)) {
			return true;
		}
		
		//left
		if(solveMaze(maze, path, i, j-1)) {
			return true;
		}
		
		return false;
	}
	public static void ratInAMaze(int maze[][]){

		/*Your class should be named Solution. 
		*Don't write main().
	 	*Don't take input, it is passed as function argument.
	 	*Don't print output.
	 	*Taking input and printing output is handled automatically.
		*/ 
		int n = maze.length;
		int[][] path = new int[n][n];
		 solveMaze(maze, path, 0, 0);
		
		
	}
	
	public static void main(String[] args) {
		
		int[][] maze = {{1,1,0},{1,1,0},{1,1,1}};
		ratInAMaze(maze);
		
	}

}
