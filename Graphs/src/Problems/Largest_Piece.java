package Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Largest_Piece {

	
	
	
	
	 static int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, 1 }, { 0, -1 } };

		public static int dfs(String[] edge, int n) {
			/* Your class should be named Solution
			 * Don't write main().
			 * Don't read input, it is passed as function argument.
			 * Return output and don't print it.
		 	 * Taking input and printing output is handled automatically.
	        */
			int m = edge[0].length();
			
			boolean visited[][] = new boolean[m][n];
			
			int finalCount=0;
			
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(!visited[i][j]) {
					int count =largestPeice(edge,visited,i,j);
					if(finalCount<count) {
						finalCount= count;
					}
					}
				}
			}
			
			return finalCount;
		}

	
	private static int largestPeice(String[] edge,boolean visited[][], int i, int j) {
			// TODO Auto-generated method stub
	
			int m = edge[0].length();
			int n = edge.length;
			
			//BaseCase
			if(i>=m ||i<0||j>=n|| j<0) {
				return 0;
			}
			//If Already visited
			if(visited[i][j]){
				return 0;
			}
			
			visited[i][j] = true;
			
			
			int count =0;
			
			if(edge[j].charAt(i)=='1') {
			//	->
			count+= largestPeice(edge, visited, i+1, j);
			//  Down
			count+= largestPeice(edge, visited, i, j+1);
			//  <-
			count+= largestPeice(edge, visited, i-1, j);
			// Up
			count+= largestPeice(edge, visited, i, j-1);
			
			return count+1;
			}
			return count;
			
		}


	static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static String[] takeInput() throws IOException {
        int n = Integer.parseInt(br.readLine().trim());
        

        String[] edge = new String[n];
        for (int i = 0; i < n; i++) {
            edge[i] = br.readLine().replaceAll("\\s", "");
        }
        
        return edge;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {
    	
        String[] edge = takeInput();
        int ans = dfs(edge,edge.length);
        System.out.println(ans);
    }	
    
    

}
