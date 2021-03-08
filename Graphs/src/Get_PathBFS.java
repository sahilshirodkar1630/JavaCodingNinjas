import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Get_PathBFS {

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
		int v1 = sc.nextInt();
		int v2 = sc.nextInt();
		
		boolean[] visited = new boolean[edges.length];
		ArrayList<Integer> output= getPathBFS(edges, v1, v2,visited);
		if(output!=null) {
			for(int i:output) {
				System.out.print(i+" ");
			}
		}
	}
	public static ArrayList<Integer> getPathBFS(int edges[][],int v1,int v2,boolean[] visited) {
		int n = edges.length;
		ArrayList<Integer> output = new ArrayList<Integer>();
		if(v1==v2) {
			output.add(v1);
			return output;
		}
		Queue<Integer> queue = new LinkedList<Integer>();
		HashMap<Integer, Integer> maps = new HashMap<Integer, Integer>();
		queue.add(v1);
		visited[v1]=true;
			while(!queue.isEmpty()) {
				int front =queue.remove();
				for(int j=0;j<n;j++) {
					if(edges[front][j]==1&&!visited[j]) {
						maps.put(j, front);
						if(j==v2) {
							output.add(v2);
							while(j!=v1) {
								j=maps.get(j);
								output.add(j);
							}
							return output;
						}
						queue.add(j);
						visited[j]=true;
					}
				}
			}
			return null;
	}

}
