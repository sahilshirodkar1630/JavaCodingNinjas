import java.util.ArrayList;
import java.util.Scanner;

public class Get_PathDFS {

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
			int search = sc.nextInt();
			int val = sc.nextInt();
			
			boolean[] visited = new boolean[edges.length];
			ArrayList<Integer> output= getPathDFS(edges, search, val,visited);
			if(output!=null) {
			for(int i:output) {
				System.out.print(i+" ");
			}
			}
		}
	
	    public static ArrayList<Integer> getPathDFS(int[][]edges,int v1,int v2,boolean[] visited){
	    	visited[v1] = true;
			int n = edges.length;
			ArrayList<Integer> output = new  ArrayList<Integer>();
			if(v1==v2) {
				output.add(v1);
				return output;
			}
			for(int i=0;i<n;i++) {
				if(edges[v1][i]==1&& !visited[i]) {
					visited[i]=true;
					ArrayList<Integer> temp = getPathDFS(edges, i,v2, visited);
					if(temp!=null) {
						temp.add(v1);
						return temp;
					}
				}
			}
			return null;
	    }

}
