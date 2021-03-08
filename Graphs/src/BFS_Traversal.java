import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class BFS_Traversal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		int edges[][] = new int[v][v];
		for(int i=0;i<e;i++) {
			int fv = sc.nextInt();
			int sv =  sc.nextInt();
			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
		}
		bfsTraversal(edges);
	}
	
	public static void bfsTraversal(int edges[][]) {
		boolean visited[] = new boolean[edges.length];
		for(int i=0;i<edges.length;i++) {
			if(!visited[i]) {
				bfsTraversalHelper(edges, i, visited);
			}
		}
	}
	
	public static void bfsTraversalHelper(int edges[][],int sv,boolean[] visited) {
		int n = edges.length;
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(sv);
		visited[sv]=true;
			while(!queue.isEmpty()) {
				int front =queue.remove();
				System.out.print(front+" ");
				for(int j=0;j<n;j++) {
					if(edges[front][j]==1&&!visited[j]) {
						queue.add(j);
						visited[j]=true;
					}
				}
			}
	}
}
