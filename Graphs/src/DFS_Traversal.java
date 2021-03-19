import java.util.Scanner;

public class DFS_Traversal {

	public static void printDFSHelper(int adjacencyMatrix[][],int sv,boolean visited[]) {
		System.out.println(sv);
		visited[sv] = true;
		int n = adjacencyMatrix.length;
		for(int i=0;i<n;i++) {
			if(adjacencyMatrix[sv][i] == 1 && !visited[i]) {
				printDFSHelper(adjacencyMatrix, i, visited);
			}
		}
	}
	
	public static void DFS(int adjacencyMatrix[][]) {
		boolean visited[] = new boolean[adjacencyMatrix.length];
		
		for(int i=0;i<adjacencyMatrix.length;i++) {
			if(!visited[i]) {
				printDFSHelper(adjacencyMatrix, i, visited);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int numberOfVertices = sc.nextInt();
		int numberOfEdges = sc.nextInt();
		int adjacencyMatrix[][]= new int[numberOfVertices][numberOfVertices];
		for(int i=0;i<numberOfEdges;i++) {
			int fv = sc.nextInt();
			int sv =sc.nextInt();
			adjacencyMatrix[fv][sv]=1;
			adjacencyMatrix[sv][fv]=1;    
		}
		DFS(adjacencyMatrix);
		
	}

}
