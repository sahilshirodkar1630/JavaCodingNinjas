
public class Rat_In_A_Maze {
	
	/*
	Code: Rat In A Maze
	
	You are given a N*N maze with a rat placed at maze[0][0].
	Find whether any path exist that rat can follow to reach its destination i.e. maze[N-1][N-1].
	Rat can move in any direc­tion ( left, right, up and down).
	Value of every cell in the maze can either be 0 or 1. 
	Cells with value 0 are blocked means rat can­not enter into those cells and those with value 1 are open.
	
	*/
	

	private static boolean solveMaze(int[][] maze,int[][] path,int i,int j) {
		int n = maze.length;
		//Check if i,j cell is valid or not;
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1){
			return false;
		}
		
		//Include the cell in current path
				path[i][j]=1;
		
		//Check if the cell is destination cell
		if(i==n-1 && j==n-1) {
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
	public static boolean ratInAMaze(int maze[][]){

		/*Your class should be named Solution. 
		*Don't write main().
	 	*Don't take input, it is passed as function argument.
	 	*Don't print output.
	 	*Taking input and printing output is handled automatically.
		*/ 
		int n = maze.length;
		int[][] path = new int[n][n];
		return solveMaze(maze, path, 0, 0);
		
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] maze = {{1,1,0},{1,1,0},{1,1,1}};
		System.out.println(ratInAMaze(maze));
		
	}

}
