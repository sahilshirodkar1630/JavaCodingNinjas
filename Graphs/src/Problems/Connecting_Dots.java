package Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Connecting_Dots {


	static int solve(String[] board , int n, int m)
	{
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
    	
    	boolean visited[][] = new boolean[n][m];
		 int output =0;
		 for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(!visited[i][j]) {
//
						if(getPath(board,board[i].charAt(j),visited,n,m,i,j,i,j,0)) {
							output=1;
						}
					}
				}
				System.out.println();
					
				}
				
		 return output;
        
	}
	
	
	
	private static boolean getPath(String[] board,char c, boolean[][] visited, int n, int m, int i, int j,int starti,int startj,int count) {
		// TODO Auto-generated method stub
		//BaseCase
		if(i>=n ||i<0||j>=m|| j<0) {
			return false;
		}
		if(visited[i][j]) {
			if(i==starti&&j == startj&& count>=4) {
				return true;
			}else {
				return false;
			}
		}
	
		visited[i][j] = true;
		if(board[i].charAt(j)==c) {
//			System.out.println(board[i].charAt(j)+" "+ i+" "+j);

			boolean op1 = getPath(board, c, visited, n, m, i, j+1,starti,startj,count+1);
			boolean op2 = getPath(board, c, visited, n, m, i+1, j,starti,startj,count+1);
			boolean op3 = getPath(board, c, visited, n, m, i, j-1,starti,startj,count+1);
			boolean op4 = getPath(board, c, visited, n, m, i-1,j ,starti,startj,count+1);
			visited[i][j]= false;
			if(op1||op2 ||op3||op4) {
				return true;
			}else {
				return false;
			}
		}else {
			visited[i][j]= false;
			return false;
		}
		
		
	}



static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static String[] takeInput() throws IOException {
		String[] strNums;
        strNums = br.readLine().split("\\s");

        int N = Integer.parseInt(strNums[0]);
        int M = Integer.parseInt(strNums[1]);

		String[] Graph = new String[N];
		
        for (int i = 0; i < N; ++i) {
            Graph[i] = br.readLine();
        }

        return Graph;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {


        String[] Graph = takeInput();
        if (solve(Graph,Graph.length,Graph[0].length())==1){
            System.out.print("true");
        }
        else{
            System.out.print("false");
        }


    }

}
