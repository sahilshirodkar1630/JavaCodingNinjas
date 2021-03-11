package Problems;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Islands {
	

	public static int numConnected(int[][] edges, int n) {
        
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically. 
        */
		ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
		boolean[] visited = new boolean[n];
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
				ArrayList<Integer> ans = allConnected(edges,i,visited);
				output.add(ans);
			}
		}
		return output.size();
	}

	public static ArrayList<Integer>  allConnected(int[][] adjacencyMatrix,int v, boolean[] visited){
		int n = adjacencyMatrix.length;
		visited[v]= true;
		ArrayList<Integer> output = new ArrayList<Integer>();
		output.add(v);
		for(int i=0;i<n;i++) {
			if(adjacencyMatrix[v][i]==1&& !visited[i]) {
				ArrayList<Integer> temp = allConnected(adjacencyMatrix, i, visited);
				for(int j: temp) {
					output.add(j);
				}
				
			}
		}
		return output;
		
	}
	
static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    
    public static int[][] takeInput() throws IOException {
		String[] strNums;
        strNums = br.readLine().split("\\s");
        int n = Integer.parseInt(strNums[0]);
        int e = Integer.parseInt(strNums[1]);

        int[][] edges = new int[n][n];
        int firstvertex, secondvertex;

        for (int i = 0; i < e; i++) {
            String[] strNums1;
            strNums1 = br.readLine().split("\\s");
            firstvertex = Integer.parseInt(strNums1[0]);
            secondvertex = Integer.parseInt(strNums1[1]);
            edges[firstvertex][secondvertex] = 1;
            edges[secondvertex][firstvertex] = 1;
        }
        return edges;
    }
    public static void main(String[] args) throws NumberFormatException, IOException {
        int [][]edges = takeInput();
        
        int ans = numConnected(edges, edges.length);
        System.out.println(ans);
		
	}

}
