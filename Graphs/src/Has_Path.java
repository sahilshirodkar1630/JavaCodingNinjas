import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class Has_Path {
	public static void main(String[] args) throws NumberFormatException, IOException {
        /* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
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
		int search = sc.nextInt();
		int val = sc.nextInt();
		
		boolean[] visited = new boolean[edges.length];
		System.out.println(hasPathBFS(edges, search, val,visited));
		
	}

	public static boolean hasPathBFS(int edges[][],int sv, int val,boolean[] visited) {
		int n = edges.length;
		if(val>=edges.length){
	            return false;
	        }
		if(edges[sv][val]==1) {
			return true;
		}
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(sv);
		visited[sv]=true;
			while(!queue.isEmpty()) {
				int front =queue.remove();
				if(edges[front][val]==1) {
					return true;
				}
				for(int j=0;j<n;j++) {
					if(edges[front][j]==1&&!visited[j]) {
						queue.add(j);
						visited[j]=true;
					}
				}
			}
			return false;
		
	}

}
