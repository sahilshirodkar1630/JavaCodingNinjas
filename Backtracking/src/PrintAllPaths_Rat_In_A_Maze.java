
public class PrintAllPaths_Rat_In_A_Maze {

	private static void PrintAllPaths(int[][] maze,int[][] path,int i,int j) {
		int n = maze.length;
		//Check if i,j cell is valid or not;
		if(i<0 || i>=n || j<0 || j>=n || maze[i][j]==0 || path[i][j]==1){
			return ;
		}
		
		//Include the cell in current path
				path[i][j]=1;
		
		//Check if the cell is destination cell
		if(i==n-1 && j==n-1) {
			for(int row = 0;row<n;row++) {
				for(int column = 0;column<n;column++) {
					System.out.print(path[row][column]+" ");
				}
				
			}
			System.out.println();
			path[i][j]=0;
			return ;
		}
		// Explore in all directions
		
		//Top
		PrintAllPaths(maze, path, i-1, j);
		
		
		//Right
		PrintAllPaths(maze, path, i, j+1);
		//Bottom
		PrintAllPaths(maze, path, i+1, j);
		//left
		PrintAllPaths(maze, path, i, j-1);
		path[i][j]=0;
		return ;
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
		PrintAllPaths(maze, path, 0, 0);
		
		
	}
	
	public static void main(String[] args) {
		
		int[][] maze = {{1,1,0},{1,1,0},{1,1,1}};
		ratInAMaze(maze);
		
	}

}
