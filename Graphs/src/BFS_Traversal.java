import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numberOfVertices = sc.nextInt();
		int numberOfEdges = sc.nextInt();
		int adjacencyMatrix[][] = new int[numberOfVertices][numberOfVertices];
		for(int i=0;i<numberOfEdges;i++) {
			int fv = sc.nextInt();
			int sv =  sc.nextInt();
			adjacencyMatrix[fv][sv] = 1;
			adjacencyMatrix[sv][fv] = 1;
		}
		BFS(adjacencyMatrix);
//		bfsTraversal(edges);
	}

	private static void BFS(int[][] adjacencyMatrix) {
		// TODO Auto-generated method stub
		int n = adjacencyMatrix.length;
		boolean visited[] = new boolean[n];
		for(int i=0;i<n;i++) {
			if(!visited[i]) {
			printBFS(adjacencyMatrix,i,visited);
			}
		}
			
		
	}

	private static void printBFS(int[][] adjacencyMatrix, int sv, boolean[] visited) {
		// TODO Auto-generated method stub
		int n= adjacencyMatrix.length;
		visited[sv]= true;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(sv);
		while(!queue.isEmpty()) {
			int frontnode = queue.poll();
			System.out.print(frontnode+" ");
			for(int i=0;i<n;i++) {
				if(adjacencyMatrix[frontnode][i] == 1 && !visited[i]) {
					visited[i]= true;
					queue.add(i);
				}
			}
		}
				
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	public static void bfsTraversal(int edges[][]) {
//		boolean visited[] = new boolean[edges.length];
//		for(int i=0;i<edges.length;i++) {
//			if(!visited[i]) {
//				bfsTraversalHelper(edges, i, visited);
//			}
//		}
//	}
//	
//	public static void bfsTraversalHelper(int edges[][],int sv,boolean[] visited) {
//		int n = edges.length;
//		Queue<Integer> queue = new LinkedList<Integer>();
//		queue.add(sv);
//		visited[sv]=true;
//			while(!queue.isEmpty()) {
//				int front =queue.remove();
//				System.out.print(front+" ");
//				for(int j=0;j<n;j++) {
//					if(edges[front][j]==1&&!visited[j]) {
//						queue.add(j);
//						visited[j]=true;
//					}
//				}
//			}
//	}
}
