package Pepcoding;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class IsGraphCyclic {

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
		boolean[] visited = new boolean[adjacencyMatrix.length];
		boolean isCyclic = false;
		for(int i=0;i<adjacencyMatrix.length;i++) {
			if(!visited[i]) {
				if(isCyclicBFS(adjacencyMatrix,i,visited)) {
					isCyclic =true;
					break;
				}
			}
		}
		System.out.println(isCyclic);
	}

	private static boolean isCyclicBFS(int[][] adjacencyMatrix, int source, boolean[] visited) {
		// TODO Auto-generated method stub
		Queue<Integer> queue = new LinkedList<Integer>();
		queue.add(source);
		while(!queue.isEmpty()) {
			int frontNode = queue.poll();
			if(visited[frontNode]) {
				return true;
			}
			visited[frontNode]=true;
			for(int i=0;i<adjacencyMatrix.length;i++) {
				if(adjacencyMatrix[frontNode][i]==1&&!visited[i]) {
					queue.add(i);
				}
			}
		}
		return false;
	}

}
