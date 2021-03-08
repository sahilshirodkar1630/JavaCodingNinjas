import java.util.Scanner;

public class Is_Connected {

	public static void main(String[] args) {
		// TODO Auto-generated method stud
		
		Scanner sc = new Scanner(System.in);
		int v = sc.nextInt();
		int e =  sc.nextInt();
		int[][] edges = new int[v][v];
		for(int i=0;i<e;i++) {
			int fv = sc.nextInt();
			int sv = sc.nextInt();
			edges[fv][sv] = 1;
			edges[sv][fv] = 1;
		}
		
		boolean[] visited = new boolean[edges.length];
		isConnectedDFS(edges, 0, visited);
		boolean  isConnected = true;
		for(int i=0;i<edges.length;i++) {
			if(!visited[i]) {
				isConnected = false;
				break;
			}
		}
		System.out.println(isConnected);
	}
	public static void isConnectedDFS(int[][] edges,int sv,boolean[] visited) {
		int n = edges.length;
		visited[sv]= true;
		for(int i=0;i<n;i++) {
			if(edges[sv][i]==1&& !visited[i]) {
				isConnectedDFS(edges, i, visited);
			}
		}
	}
	
}
