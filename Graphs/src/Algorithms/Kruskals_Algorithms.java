package Algorithms;

import java.util.Arrays;
import java.util.Scanner;
/*
 Kruskal's Algorithm
 Given an undirected, connected and weighted graph G(V, E) with V number of vertices 
 (which are numbered from 0 to V-1) and E number of edges.
 Find and print the Minimum Spanning Tree (MST) using Kruskal's algorithm.
 
*/

class Edge implements Comparable<Edge>{
	int source;
	int dest;
	int weight;
	
	@Override
	public int compareTo(Edge o) {
		//Sort in increasing order
		return this.weight - o.weight;
	}
}
public class Kruskals_Algorithms {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int e = sc.nextInt();

		/* Write Your Code Here
		 * Complete the Rest of the Program
		 * You have to take input and print the output yourself
		 */
		
        Edge inputEdge[]= new Edge[e];
		for(int i = 0;i < e;i++) {
			inputEdge[i]= new Edge();
			inputEdge[i].source = sc.nextInt();
			inputEdge[i].dest = sc.nextInt();
			inputEdge[i].weight = sc.nextInt();
		}

		kruskals(inputEdge,n);
	}

	public static void kruskals(Edge[] inputEdge, int n) {
		// TODO Auto-generated method stub
	
		// Sort the inputEdge array
		Arrays.sort(inputEdge);
		
		Edge output[] = new Edge[n-1];
		
		int parent[] = new int[n];
		
		for(int i=0;i<n;i++) {
			parent[i]= i;
		}
		
		int count =0;
		int i=0;
		while(count!= n-1){
			Edge currentEdge = inputEdge[i];
			int sourceParent = findParent(currentEdge.source,parent);
			int destParent = findParent(currentEdge.dest,parent);
			if(sourceParent!=destParent) {
				output[count] = currentEdge;
				count++;
				parent[sourceParent]= destParent;
			}
			i++;
		}
		
		for(int j=0;j<n-1;j++) {
			if(output[j].source < output[j].dest ) {
				System.out.println(output[j].source+" "+ output[j].dest+" "+output[j].weight);
			}else {
				System.out.println(output[j].dest+" "+ output[j].source+" "+output[j].weight);
			}
		}
		
	}

	private static int findParent(int source, int[] parent) {
		// TODO Auto-generated method stub
		if(parent[source]==source) {
			return source;
		}
		return findParent(parent[source], parent);
		
	}

}
