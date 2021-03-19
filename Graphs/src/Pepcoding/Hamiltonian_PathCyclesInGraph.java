package Pepcoding;

import java.util.HashSet;
import java.util.Scanner;

public class Hamiltonian_PathCyclesInGraph {

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
		int source = sc.nextInt();
		
		HashSet<Integer> visited = new HashSet<Integer>();
		
		hamiltonian(adjacencyMatrix,source,visited,source+"",source);
	}

	private static void hamiltonian(int[][] adjacencyMatrix, int source, HashSet<Integer> visited, String pathSoFar,int originalSource) {
		// TODO Auto-generated method stub
		if(visited.size()== adjacencyMatrix.length-1) {
			boolean closingEdge = false;
			for(int i=0;i<adjacencyMatrix.length;i++) {
				if(adjacencyMatrix[source][i]==1) {
					if(i==originalSource) {
						closingEdge=true;
						break;
					}
				}
			}
			if(closingEdge) {
				System.out.println(pathSoFar+"*");
			}else {
				System.out.println(pathSoFar+".");
			}
		}
		
		visited.add(source);
		for(int i=0;i<adjacencyMatrix.length;i++) {
			if(adjacencyMatrix[source][i]==1&& !visited.contains(i)) {
				hamiltonian(adjacencyMatrix, i, visited, pathSoFar+i,originalSource);
			}
		}
		visited.remove(source);
	}

}
