import java.util.Scanner;

public class DFS_Traversal {

	public static void printDFSHelper(int edges[][],int sv,boolean visited[]) {
		System.out.println(sv);
		visited[sv] = true;
		int n = edges.length;
		for(int i=0;i<n;i++) {
			if(edges[sv][i]==1&& !visited[i]) {
				printDFSHelper(edges, i, visited);
			}
		}
	}
	
	public static void DFS(int edges[][]) {
		boolean visited[] = new boolean[edges.length];
		for(int i=0;i<edges.length;i++) {
			if(!visited[i]) {
				printDFSHelper(edges, i, visited);
			}
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner (System.in);
		int v = sc.nextInt();
		int e = sc.nextInt();
		int edges[][]= new int[v][v];
		for(int i=0;i<e;i++) {
			int fv = sc.nextInt();
			int sv =sc.nextInt();
			edges[fv][sv]=1;
			edges[sv][fv]=1;    
		}
		DFS(edges);
		
	}

}
