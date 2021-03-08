import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Return_AllConnected_Components {

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
			ArrayList<ArrayList<Integer>> output = new ArrayList<ArrayList<Integer>>();
			boolean[] visited = new boolean[edges.length];
			for(int i=0;i<edges.length;i++) {
				if(!visited[i]) {
					ArrayList<Integer> temp = allConnectedComponentsDFS(edges,i, visited);
					output.add(temp);
				}
			}
			for(int i=0;i<output.size();i++) {
				Collections.sort(output.get(i));
				for(int j=0;j<output.get(i).size();j++) {
					System.out.print(output.get(i).get(j)+" ");
				}
				System.out.println();
			}
			
		}

		private static ArrayList<Integer> allConnectedComponentsDFS(int[][] edges, int sv, boolean[] visited) {
			// TODO Auto-generated method stub
			ArrayList<Integer> ans = new ArrayList<Integer>();
			ans.add(sv);
			int n= edges.length;
			visited[sv]= true;
			for(int i=0;i<n;i++) {
				if(edges[sv][i]==1&& !visited[i]) {
					ArrayList<Integer> temp = allConnectedComponentsDFS(edges, i, visited);
					for(int j:temp) {
						ans.add(j);
					}
				}
			}
			
			return ans;
		
		}
}
