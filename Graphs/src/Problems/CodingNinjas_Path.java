package Problems;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CodingNinjas_Path {

	 static int solve(String[] Graph , int n, int m)
	{
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
		 String str = "CODINGNINJA";
		 boolean visited[][] = new boolean[m][n];
		 int output =0;
		 for(int i=0;i<m;i++) {
				for(int j=0;j<n;j++) {
					if(!visited[i][j]) {
						if(getPath(Graph,str,visited,n,m,i,j)) {
							output=1;
						}
					}
				}
			}
		 return output;
		 
	}
	
private static boolean getPath(String[] graph, String str, boolean[][] visited, int n, int m, int i, int j) {
		// TODO Auto-generated method stub
	//BaseCase
		if(i>=m ||i<0||j>=n|| j<0||visited[i][j]) {
			return false;
		}
		
		visited[i][j] = true;
		if(graph[j].charAt(i)==str.charAt(0)) {
			if(str.length()==1) {
	            visited[i][j]=false;
				return true;
			}
			boolean op1 = getPath(graph, str.substring(1), visited,n, m, i, j-1);  // Top
			boolean op2 = getPath(graph, str.substring(1),visited, n, m, i+1, j-1);  // Side Top
			boolean op3 = getPath(graph, str.substring(1),visited, n, m, i+1, j);  // Side
			boolean op4 = getPath(graph, str.substring(1),visited, n, m, i+1, j+1);  // Side down
			boolean op5 = getPath(graph, str.substring(1),visited, n, m, i, j+1);   // Down
			boolean op6 = getPath(graph, str.substring(1),visited, n, m, i-1, j+1); // Down Back
			boolean op7 = getPath(graph, str.substring(1),visited, n, m, i-1, j);  // Back
			boolean op8 = getPath(graph, str.substring(1),visited, n, m, i-1, j-1); // Top Backk
	       visited[i][j]=false;
			if(op1||op2 ||op3||op4 ||op5 ||op6  ||op7  ||op8) {
				return true;
			}else {
				return false;
			}
			}else {
	        visited[i][j] = false;
				return false;
			}
			
		
		
	}


static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static String[] takeInput() throws IOException {
		String[] strNums;
        strNums = br.readLine().split("\\s");
        int size = 2;
        int[] input = new int[size];
        for (int i = 0; i < size; ++i) {
            input[i] = Integer.parseInt(strNums[i]);
        }


		String[] Graph = new String[input[0]];
		
        for (int i = 0; i < input[0]; ++i) {
            Graph[i] = br.readLine();
        }

        return Graph;
    }

    public static void main(String[] args) throws NumberFormatException, IOException {


        String[] Graph = takeInput();
        System.out.println(solve(Graph,Graph.length,Graph[0].length()));


    }

}
